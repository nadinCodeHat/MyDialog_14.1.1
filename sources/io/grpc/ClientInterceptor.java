package io.grpc;

/* renamed from: io.grpc.i */
public interface ClientInterceptor {
    <ReqT, RespT> ClientCall<ReqT, RespT> a(da<ReqT, RespT> daVar, CallOptions callOptions, f fVar);
}
