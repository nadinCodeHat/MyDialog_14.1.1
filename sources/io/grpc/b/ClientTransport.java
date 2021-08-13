package io.grpc.b;

import io.grpc.CallOptions;
import io.grpc.K;
import io.grpc.b.P.a;
import io.grpc.ba;
import io.grpc.da;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.b.P */
public interface ClientTransport extends K<Object> {

    /* compiled from: ClientTransport */
    public interface a {
        void a(long j);

        void a(Throwable th);
    }

    N a(da<?, ?> daVar, ba baVar, CallOptions callOptions);

    void a(a aVar, Executor executor);
}
