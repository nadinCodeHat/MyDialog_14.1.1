package okhttp3;

import h.K;

/* compiled from: Call.kt */
public interface Call extends Cloneable {

    /* compiled from: Call.kt */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    K timeout();
}
