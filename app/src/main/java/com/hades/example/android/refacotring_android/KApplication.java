package com.hades.example.android.refacotring_android;

import android.app.Application;

import com.hades.example.android.core.ILoginAction;
import com.hades.example.android.core.ILoginActionImpl;

public class KApplication extends Application {
    private ILoginAction ILoginAction;

    @Override
    public void onCreate() {
        super.onCreate();
        ILoginAction = new ILoginActionImpl(this);
    }

    public ILoginAction getILoginAction() {
        return ILoginAction;
    }
}
