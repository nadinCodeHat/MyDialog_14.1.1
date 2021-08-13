package d.e.b.e.e.f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public interface b {
    ExecutorService a(ThreadFactory threadFactory, int i);

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);
}
