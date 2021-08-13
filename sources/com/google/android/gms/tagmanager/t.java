package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;

public interface t extends IInterface {
    void initialize(b bVar, q qVar, h hVar);

    void preview(Intent intent, b bVar);

    void previewIntent(Intent intent, b bVar, b bVar2, q qVar, h hVar);
}
