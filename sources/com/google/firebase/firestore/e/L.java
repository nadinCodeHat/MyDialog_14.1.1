package com.google.firebase.firestore.e;

import io.grpc.ba;
import io.grpc.ta;

/* compiled from: IncomingStreamObserver */
interface L<RespT> {
    void a();

    void a(ba baVar);

    void a(ta taVar);

    void onNext(RespT respT);
}
