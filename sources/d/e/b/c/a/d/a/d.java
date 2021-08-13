package d.e.b.c.a.d.a;

import d.e.b.c.a.l;
import d.e.b.c.a.q;
import java.io.Closeable;

/* compiled from: EventStore */
public interface d extends Closeable {
    int B();

    Iterable<q> G();

    long a(q qVar);

    PersistedEvent a(q qVar, l lVar);

    void a(q qVar, long j);

    void a(Iterable<PersistedEvent> iterable);

    void b(Iterable<PersistedEvent> iterable);

    boolean b(q qVar);

    Iterable<PersistedEvent> c(q qVar);
}
