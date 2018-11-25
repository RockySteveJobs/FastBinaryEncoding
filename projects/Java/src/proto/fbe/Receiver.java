// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

// Fast Binary Encoding base receiver class
public abstract class Receiver
{
    private Buffer _buffer;
    private boolean _logging;
    private boolean _final;

    // Get the bytes buffer
    public Buffer getBuffer() { return _buffer; }
    // Get the logging flag
    public boolean getLogging() { return _logging; }
    // Enable/Disable logging
    public void setLogging(boolean enable) { _logging = enable; }
    // Get the final protocol flag
    public boolean getFinal() { return _final; }
    // Enable/Disable final protocol
    protected void setFinal(boolean enable) { _final = enable; }

    protected Receiver() { _buffer = new Buffer(); }
    protected Receiver(Buffer buffer) { _buffer = buffer; }

    // Receive data
    public void receive(Buffer buffer) { receive(buffer.getData(), 0, buffer.getSize()); }
    public void receive(byte[] buffer) { receive(buffer, 0, buffer.length); }
    public void receive(byte[] buffer, long offset, long size)
    {
        assert (buffer != null) : "Invalid buffer!";
        if (buffer == null)
            throw new IllegalArgumentException("Invalid buffer!");
        assert ((offset + size) <= buffer.length) : "Invalid offset & size!";
        if ((offset + size) > buffer.length)
            throw new IllegalArgumentException("Invalid offset & size!");

        if (size == 0)
            return;

        // Storage buffer
        long offset0 = _buffer.getOffset();
        long offset1 = _buffer.getSize();
        long size1 = _buffer.getSize();

        // Receive buffer
        long offset2 = 0;
        long size2 = size;

        // While receive buffer is available to handle...
        while (offset2 < size2)
        {
            byte[] messageBuffer = null;
            long messageOffset = 0;
            long messageSize = 0;

            // Try to receive message size
            boolean messageSizeCopied = false;
            boolean messageSizeFound = false;
            while (!messageSizeFound)
            {
                // Look into the storage buffer
                if (offset0 < size1)
                {
                    long count = Math.min(size1 - offset0, 4);
                    if (count == 4)
                    {
                        messageSizeCopied = true;
                        messageSizeFound = true;
                        messageSize = _buffer.readInt32(_buffer.getData(), offset0);
                        offset0 += 4;
                        break;
                    }
                    else
                    {
                        // Fill remaining data from the receive buffer
                        if (offset2 < size2)
                        {
                            count = Math.min(size2 - offset2, 4 - count);

                            // Allocate and refresh the storage buffer
                            _buffer.allocate(count);
                            size1 += count;

                            System.arraycopy(buffer, (int)(offset + offset2), _buffer.getData(), (int)offset1, (int)count);
                            offset1 += count;
                            offset2 += count;
                            continue;
                        }
                        else
                            break;
                    }
                }

                // Look into the receive buffer
                if (offset2 < size2)
                {
                    long count = Math.min(size2 - offset2, 4);
                    if (count == 4)
                    {
                        messageSizeFound = true;
                        messageSize = _buffer.readInt32(buffer, offset + offset2);
                        offset2 += 4;
                        break;
                    }
                    else
                    {
                        // Allocate and refresh the storage buffer
                        _buffer.allocate(count);
                        size1 += count;

                        System.arraycopy(buffer, (int)(offset + offset2), _buffer.getData(), (int)offset1, (int)count);
                        offset1 += count;
                        offset2 += count;
                        continue;
                    }
                }
                else
                    break;
            }

            if (!messageSizeFound)
                return;

            // Check the message full size
            assert (messageSize >= (4 + 4 + 4 + 4)) : "Invalid receive data!";
            if (messageSize < (4 + 4 + 4 + 4))
                return;

            // Try to receive message body
            boolean messageFound = false;
            while (!messageFound)
            {
                // Look into the storage buffer
                if (offset0 < size1)
                {
                    long count = Math.min(size1 - offset0, messageSize - 4);
                    if (count == (messageSize - 4))
                    {
                        messageFound = true;
                        messageBuffer = _buffer.getData();
                        messageOffset = offset0 - 4;
                        offset0 += messageSize - 4;
                        break;
                    }
                    else
                    {
                        // Fill remaining data from the receive buffer
                        if (offset2 < size2)
                        {
                            // Copy message size into the storage buffer
                            if (!messageSizeCopied)
                            {
                                // Allocate and refresh the storage buffer
                                _buffer.allocate(4);
                                size1 += 4;

                                _buffer.write(_buffer.getData(), offset0, (int)messageSize);
                                offset0 += 4;
                                offset1 += 4;

                                messageSizeCopied = true;
                            }

                            count = Math.min(size2 - offset2, messageSize - 4 - count);

                            // Allocate and refresh the storage buffer
                            _buffer.allocate(count);
                            size1 += count;

                            System.arraycopy(buffer, (int)(offset + offset2), _buffer.getData(), (int)offset1, (int)count);
                            offset1 += count;
                            offset2 += count;
                            continue;
                        }
                        else
                            break;
                    }
                }

                // Look into the receive buffer
                if (offset2 < size2)
                {
                    long count = Math.min(size2 - offset2, messageSize - 4);
                    if (!messageSizeCopied && (count == (messageSize - 4)))
                    {
                        messageFound = true;
                        messageBuffer = buffer;
                        messageOffset = offset + offset2 - 4;
                        offset2 += messageSize - 4;
                        break;
                    }
                    else
                    {
                        // Copy message size into the storage buffer
                        if (!messageSizeCopied)
                        {
                            // Allocate and refresh the storage buffer
                            _buffer.allocate(4);
                            size1 += 4;

                            _buffer.write(_buffer.getData(), offset0, (int)messageSize);
                            offset0 += 4;
                            offset1 += 4;

                            messageSizeCopied = true;
                        }

                        // Allocate and refresh the storage buffer
                        _buffer.allocate(count);
                        size1 += count;

                        System.arraycopy(buffer, (int)(offset + offset2), _buffer.getData(), (int)offset1, (int)count);
                        offset1 += count;
                        offset2 += count;
                        continue;
                    }
                }
                else
                    break;
            }

            if (!messageFound)
            {
                // Copy message size into the storage buffer
                if (!messageSizeCopied)
                {
                    // Allocate and refresh the storage buffer
                    _buffer.allocate(4);
                    size1 += 4;

                    _buffer.write(_buffer.getData(), offset0, (int)messageSize);
                    offset0 += 4;
                    offset1 += 4;

                    messageSizeCopied = true;
                }
                return;
            }

            int fbeStructSize;
            int fbeStructType;

            // Read the message parameters
            if (_final)
            {
                fbeStructSize = Buffer.readInt32(messageBuffer, messageOffset);
                fbeStructType = Buffer.readInt32(messageBuffer, messageOffset + 4);
            }
            else
            {
                int fbeStructOffset = Buffer.readInt32(messageBuffer, messageOffset + 4);
                fbeStructSize = Buffer.readInt32(messageBuffer, messageOffset + fbeStructOffset);
                fbeStructType = Buffer.readInt32(messageBuffer, messageOffset + fbeStructOffset + 4);
            }

            // Handle the message
            onReceive(fbeStructType, messageBuffer, messageOffset, messageSize);

            // Reset the storage buffer
            _buffer.reset();

            // Refresh the storage buffer
            offset1 = _buffer.getOffset();
            size1 = _buffer.getSize();
        }
    }

    // Receive message handler
    public abstract boolean onReceive(long type, byte[] buffer, long offset, long size);
    // Receive log message handler
    protected void onReceiveLog(String message) {}
}
