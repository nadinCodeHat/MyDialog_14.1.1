package kotlin.io;

import java.io.File;
import java.io.IOException;

/* compiled from: Exceptions.kt */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;
}
