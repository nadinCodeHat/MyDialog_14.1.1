package com.franmontiel.persistentcookiejar.persistence;

import java.util.Collection;
import okhttp3.Cookie;

public interface CookiePersistor {
    void a(Collection<Cookie> collection);

    void removeAll(Collection<Cookie> collection);
}
