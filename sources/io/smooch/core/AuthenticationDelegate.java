package io.smooch.core;

public interface AuthenticationDelegate {
    void onInvalidAuth(AuthenticationError authenticationError, AuthenticationCallback authenticationCallback);
}
