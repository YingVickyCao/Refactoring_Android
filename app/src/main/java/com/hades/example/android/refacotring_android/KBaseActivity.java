package com.hades.example.android.refacotring_android;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class KBaseActivity extends AppCompatActivity {
    // 上下文实例
    public Context context;
    // 应用全局的实例
    public KApplication application;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        application = (KApplication) this.getApplication();
        ILoginAction = application.getILoginAction();
    }
}
