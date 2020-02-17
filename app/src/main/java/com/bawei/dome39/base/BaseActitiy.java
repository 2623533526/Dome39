package com.bawei.dome39.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.dome39.mvp.BasePresenter;
import com.bawei.dome39.mvp.IBaseView;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public abstract class BaseActitiy<P extends BasePresenter>extends AppCompatActivity implements IBaseView {
    public P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        presenter = initPresenter();
        if(presenter!=null){
            presenter.attach(this);
        }
        initView();
        initData();
    }

    protected abstract int initLayout();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P initPresenter();
    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.detach();
        }
    }
}
