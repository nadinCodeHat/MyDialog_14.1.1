package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* compiled from: Reader */
interface Ea {
    long a();

    @Deprecated
    <T> T a(Ha<T> ha, A a);

    @Deprecated
    <T> T a(Class<T> cls, A a);

    void a(List<String> list);

    @Deprecated
    <T> void a(List<T> list, Ha<T> ha, A a);

    <K, V> void a(Map<K, V> map, a<K, V> aVar, A a);

    <T> T b(Ha<T> ha, A a);

    <T> T b(Class<T> cls, A a);

    void b(List<Integer> list);

    <T> void b(List<T> list, Ha<T> ha, A a);

    boolean b();

    long c();

    void c(List<Long> list);

    int d();

    void d(List<Long> list);

    int e();

    void e(List<Long> list);

    int f();

    void f(List<Integer> list);

    int g();

    void g(List<Boolean> list);

    int getTag();

    long h();

    void h(List<String> list);

    int i();

    void i(List<Long> list);

    long j();

    void j(List<Integer> list);

    int k();

    void k(List<Integer> list);

    void l(List<Long> list);

    boolean l();

    int m();

    void m(List<Integer> list);

    long n();

    void n(List<Integer> list);

    String o();

    void o(List<Float> list);

    void p(List<p> list);

    void q(List<Double> list);

    p readBytes();

    double readDouble();

    float readFloat();

    String readString();
}
