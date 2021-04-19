package com.hades.example.android.core;

import com.hades.example.android.model.CouponBO;

import java.util.List;

public interface ILoginAction {
    // 登录
    public void login(String loginName, String password, ActionCallbackListener<Void> listener);
}