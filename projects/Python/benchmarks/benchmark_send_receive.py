import proto
import timeit
from proto import proto


class MySender1(proto.Sender):

    def __init__(self):
        super().__init__()
        self._size = 0
        self._log_size = 0

    @property
    def size(self):
        return self._size

    @property
    def log_size(self):
        return self._log_size

    def on_send(self, buffer, offset, size):
        self._size += size
        return size

    def on_send_log(self, message):
        self._log_size += len(message)


class MySender2(proto.Sender):

    def __init__(self):
        super().__init__()
        self._size = 0
        self._log_size = 0

    @property
    def size(self):
        return self._size

    @property
    def log_size(self):
        return self._log_size

    def on_send(self, buffer, offset, size):
        self._size += size
        return 0

    def on_send_log(self, message):
        self._log_size += len(message)


class MyReceiver(proto.Receiver):

    def __init__(self):
        super().__init__()
        self._log_size = 0

    @property
    def log_size(self):
        return self._log_size

    def on_receive_order(self, value):
        pass

    def on_receive_balance(self, value):
        pass

    def on_receive_account(self, value):
        pass

    def on_receive_log(self, message):
        self._log_size += len(message)


class BenchmarkSendReceive(object):

    def __init__(self):
        # Create a new account with some orders
        self.account = proto.Account(1, "Test", proto.State.good, proto.Balance("USD", 1000.0), proto.Balance("EUR", 100.0))
        self.account.orders.append(proto.Order(1, "EURUSD", proto.OrderSide.buy, proto.OrderType.market, 1.23456, 1000.0))
        self.account.orders.append(proto.Order(2, "EURUSD", proto.OrderSide.sell, proto.OrderType.limit, 1.0, 100.0))
        self.account.orders.append(proto.Order(3, "EURUSD", proto.OrderSide.buy, proto.OrderType.stop, 1.5, 10.0))

        self.sender1 = MySender1()
        self.sender1.send(self.account)

        self.sender2 = MySender2()
        self.sender2.send(self.account)

        self.receiver = MyReceiver()
        self.receiver.receive(self.sender2.buffer)

    def send(self):
        # Serialize and send the account
        self.sender1.send(self.account)

    def send_with_logs(self):
        # Enable logging
        self.sender1.logging = True

        # Serialize and send the account
        self.sender1.send(self.account)

    def receive(self):
        # Receive the account from the sender
        self.receiver.receive(self.sender2.buffer)

    def receive_with_logs(self):
        # Enable logging
        self.receiver.logging = True

        # Receive the account from the sender
        self.receiver.receive(self.sender2.buffer)


benchmark = BenchmarkSendReceive()
iterations = 100000


def main():
    # Benchmark send() method
    times = timeit.repeat(setup='print("Benchmarking send() method...")', stmt="benchmark.send()", repeat=5, number=iterations, globals=globals())
    duration = min(times)
    print()
    print("Phase: Send")
    print("Average time: {:.3f} mcs / iteration".format(duration / iterations * 1000000))
    print("Total time: {:.3f} s".format(duration))
    print("Total iterations: {}".format(iterations))
    print("Iterations throughput: {:.3f} / second".format(iterations / duration))
    print()

    # Benchmark send_with_logs() method
    times = timeit.repeat(setup='print("Benchmarking send_with_logs() method...")', stmt="benchmark.send_with_logs()", repeat=5, number=iterations, globals=globals())
    duration = min(times)
    print()
    print("Phase: Send with logs")
    print("Average time: {:.3f} mcs / iteration".format(duration / iterations * 1000000))
    print("Total time: {:.3f} s".format(duration))
    print("Total iterations: {}".format(iterations))
    print("Iterations throughput: {:.3f} / second".format(iterations / duration))
    print()

    # Benchmark receive() method
    times = timeit.repeat(setup='print("Benchmarking receive() method...")', stmt="benchmark.receive()", repeat=5, number=iterations, globals=globals())
    duration = min(times)
    print()
    print("Phase: Receive")
    print("Average time: {:.3f} mcs / iteration".format(duration / iterations * 1000000))
    print("Total time: {:.3f} s".format(duration))
    print("Total iterations: {}".format(iterations))
    print("Iterations throughput: {:.3f} / second".format(iterations / duration))
    print()

    # Benchmark receive_with_logs() method
    times = timeit.repeat(setup='print("Benchmarking receive_with_logs() method...")', stmt="benchmark.receive_with_logs()", repeat=5, number=iterations, globals=globals())
    duration = min(times)
    print()
    print("Phase: Receive with logs")
    print("Average time: {:.3f} mcs / iteration".format(duration / iterations * 1000000))
    print("Total time: {:.3f} s".format(duration))
    print("Total iterations: {}".format(iterations))
    print("Iterations throughput: {:.3f} / second".format(iterations / duration))
    print()


if __name__ == "__main__":
    main()
