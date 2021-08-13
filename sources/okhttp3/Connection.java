package okhttp3;

import java.net.Socket;

/* compiled from: Connection.kt */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
