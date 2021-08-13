package io.smooch.core.service;

import io.smooch.core.InitializationStatus;
import io.smooch.core.LoginResult;
import io.smooch.core.LogoutResult;
import io.smooch.core.PaymentStatus;
import io.smooch.core.SmoochCallback;
import io.smooch.core.SmoochCallback.Response;
import io.smooch.core.SmoochConnectionStatus;
import io.smooch.core.d.g;
import io.smooch.core.d.o;
import io.smooch.core.d.p;

public interface d {
    void a();

    void a(InitializationStatus initializationStatus);

    void a(LoginResult loginResult);

    void a(LogoutResult logoutResult);

    void a(Response response, p pVar, SmoochCallback smoochCallback);

    void a(SmoochConnectionStatus smoochConnectionStatus);

    void a(io.smooch.core.d.d dVar);

    void a(g gVar);

    void a(o oVar, PaymentStatus paymentStatus);

    void a(p pVar);

    void a(String str);
}
