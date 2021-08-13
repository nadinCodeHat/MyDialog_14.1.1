package okhttp3;

import h.m;

/* compiled from: WebSocket.kt */
public interface WebSocket {

    /* compiled from: WebSocket.kt */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(m mVar);

    boolean send(String str);
}
