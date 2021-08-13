package androidx.core.os;

import android.os.Parcel;

@Deprecated
/* compiled from: ParcelableCompatCreatorCallbacks */
public interface h<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
