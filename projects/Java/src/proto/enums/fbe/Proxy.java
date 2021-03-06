// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.2.0.0

package enums.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import enums.*;

// Fast Binary Encoding enums proxy
public class Proxy extends fbe.Receiver
{
    // Proxy models accessors
    private final EnumsModel EnumsModel;

    public Proxy()
    {
        super(false);
        EnumsModel = new EnumsModel();
    }
    public Proxy(Buffer buffer)
    {
        super(buffer, false);
        EnumsModel = new EnumsModel();
    }

    // Proxy handlers
    protected void onProxy(EnumsModel model, long type, byte[] buffer, long offset, long size) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)enums.fbe.EnumsModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                EnumsModel.attach(buffer, offset);
                assert EnumsModel.verify() : "enums.Enums validation failed!";

                long fbeBegin = EnumsModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(EnumsModel, type, buffer, offset, size);
                EnumsModel.model.getEnd(fbeBegin);
                return true;
            }
        }

        return false;
    }
}
