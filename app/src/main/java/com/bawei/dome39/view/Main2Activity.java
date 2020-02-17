package com.bawei.dome39.view;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bawei.dome39.R;
import com.bawei.dome39.base.BaseActitiy;
import com.bawei.dome39.contract.Contract;
import com.bawei.dome39.presenter.Presenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends BaseActitiy<Presenter> implements Contract.IView {

    @BindView(R.id.rb0)
    RadioButton rb0;
    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    @BindView(R.id.rb3)
    RadioButton rb3;
    @BindView(R.id.rb9)
    RadioButton rb9;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.vp)
    ViewPager vp;
    private ArrayList<Fragment> list;

    @Override
    protected int initLayout() {
        return R.layout.activity_main2;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        list = new ArrayList<>();
        Fragment fragment_0 = Fragment.getInstance(0);
        Fragment fragment_1 = Fragment.getInstance(1);
        Fragment fragment_2 = Fragment.getInstance(2);
        Fragment fragment_3 = Fragment.getInstance(3);
        Fragment fragment_9 = Fragment.getInstance(9);
        list.add(fragment_0);
        list.add(fragment_1);
        list.add(fragment_2);
        list.add(fragment_3);
        list.add(fragment_9);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public androidx.fragment.app.Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb0:{
                        vp.setCurrentItem(0);
                    }break;
                    case R.id.rb1:{
                        vp.setCurrentItem(1);
                    }break;
                    case R.id.rb2:{
                        vp.setCurrentItem(2);
                    }break;
                    case R.id.rb3:{
                        vp.setCurrentItem(3);
                    }break;
                    case R.id.rb9:{
                        vp.setCurrentItem(4);
                    }break;
                }
            }
        });
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
             rg.check(rg.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    protected Presenter initPresenter() {
        return null;
    }

    @Override
    public void Success(Object object) {

    }

    @Override
    public void Error(Throwable throwable) {

    }
}
