package com.facebook.l.l;

import com.facebook.l.i.e;
import com.facebook.l.l.ca.a;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.facebook.l.l.ca */
public interface NetworkFetcher<FETCH_STATE extends A> {

    /* compiled from: NetworkFetcher */
    public interface a {
        void a();

        void a(InputStream inputStream, int i);

        void a(Throwable th);
    }

    FETCH_STATE a(n<e> nVar, na naVar);

    void a(FETCH_STATE fetch_state, int i);

    void a(FETCH_STATE fetch_state, a aVar);

    boolean a(FETCH_STATE fetch_state);

    Map<String, String> b(FETCH_STATE fetch_state, int i);
}
