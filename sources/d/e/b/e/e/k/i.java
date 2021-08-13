package d.e.b.e.e.k;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.C1665g;

/* compiled from: com.google.android.gms:play-services-location@@17.1.0 */
public interface i extends IInterface {
    void C(boolean z);

    void a(PendingIntent pendingIntent, g gVar, String str);

    void a(C1665g c1665g, PendingIntent pendingIntent, g gVar);

    void a(C1685J c1685j);

    void a(z zVar);

    Location c(String str);

    @Deprecated
    Location f();
}
