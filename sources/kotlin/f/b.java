package kotlin.f;

import java.util.List;
import java.util.Map;

/* compiled from: KCallable.kt */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    l getReturnType();

    List<Object> getTypeParameters();

    m getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
