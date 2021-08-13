package com.google.protobuf;

import com.google.protobuf.ma.a;
import java.io.OutputStream;

/* renamed from: com.google.protobuf.ma */
public interface MessageLite extends MessageLiteOrBuilder {

    /* compiled from: MessageLite */
    public interface a extends MessageLiteOrBuilder, Cloneable {
        MessageLite M();

        a a(MessageLite messageLite);

        MessageLite build();
    }

    void a(CodedOutputStream codedOutputStream);

    byte[] b();

    a d();

    p e();

    int f();

    a g();

    Parser<? extends MessageLite> h();

    void writeTo(OutputStream outputStream);
}
