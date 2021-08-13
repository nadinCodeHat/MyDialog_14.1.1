package io.grpc.b;

import java.io.InputStream;

/* compiled from: StreamListener */
public interface gd {

    /* compiled from: StreamListener */
    public interface a {
        InputStream next();
    }

    void a(a aVar);

    void onReady();
}
