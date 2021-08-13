package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.d;
import java.util.List;
import java.util.Map;

interface ib {
    d<ParcelFileDescriptor> a(int i, String str, String str2, int i2);

    d<List<String>> a(Map<String, Long> map);

    void a();

    void a(int i, String str);

    void b(int i);

    void b(int i, String str, String str2, int i2);

    void b(List<String> list);
}
