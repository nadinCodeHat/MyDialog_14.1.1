package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.a;
import d.e.b.f.a.h;
import java.util.List;

/* compiled from: MotionStrategy */
interface m {
    void a();

    void a(a aVar);

    void a(h hVar);

    h b();

    boolean c();

    void d();

    AnimatorSet e();

    List<AnimatorListener> f();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);
}
