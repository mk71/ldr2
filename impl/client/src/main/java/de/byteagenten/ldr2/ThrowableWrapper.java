package de.byteagenten.ldr2;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by knooma2e on 26.07.2016.
 */
@LogEvent(name = "Throwable", level = LogEvent.Level.WARN)
public class ThrowableWrapper {

    private Throwable throwable;
    private String stackTrace;

    public ThrowableWrapper(Throwable throwable) {

        this.throwable = throwable;

        StringWriter writer = new StringWriter(100);
        PrintWriter printWriter = new PrintWriter(writer);
        this.throwable.printStackTrace(printWriter);
        this.stackTrace = writer.getBuffer().toString();
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public String getStackTrace() {

        return this.stackTrace;
    }
}
