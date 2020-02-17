package com.bawei.dome39.view;

import android.content.Intent;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei.dome39.R;
import com.bawei.dome39.base.BaseActitiy;
import com.bawei.dome39.contract.Contract;
import com.bawei.dome39.entity.Login_Entity;
import com.bawei.dome39.entity.Register_Entity;
import com.bawei.dome39.presenter.Presenter;
import com.blankj.utilcode.util.EncryptUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActitiy<Presenter> implements Contract.IView, View.OnClickListener {

    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.pwd)
    EditText pwd;
    @BindView(R.id.register)
    Button register;
    @BindView(R.id.login)
    Button login;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        register.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    protected Presenter initPresenter() {
        return new Presenter();
    }


    @Override
    public void Success(Object object) {
      if(object instanceof Register_Entity){
          Register_Entity register_entity=(Register_Entity)object;
          Toast.makeText(this, register_entity.getMessage(), Toast.LENGTH_SHORT).show();
      }else if(object instanceof Login_Entity){
          Login_Entity login_entity=(Login_Entity)object;
          Toast.makeText(this, login_entity.getMessage(), Toast.LENGTH_SHORT).show();
          if(login_entity.getStatus().equals("0000")){
              Intent intent = new Intent(MainActivity.this, Main2Activity.class);
              startActivity(intent);
          }



      }
    }

    @Override
    public void Error(Throwable throwable) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:{
              if (TextUtils.isEmpty(phone.getText().toString())||TextUtils.isEmpty(pwd.getText().toString())){
                  Toast.makeText(this, "不可为空", Toast.LENGTH_SHORT).show();
                  break;
              }
                ArrayMap<String, String> map = new ArrayMap<>();
                String user_phone = phone.getText().toString();
                String user_pwd =EncryptUtils.encryptMD5ToString(pwd.getText().toString()).substring(0,8);
                map.put("phone",user_phone);
                map.put("pwd",user_pwd);
               presenter.Register_Success(map);
            }break;
            case R.id.login:{
                if (TextUtils.isEmpty(phone.getText().toString())||TextUtils.isEmpty(pwd.getText().toString())){
                    Toast.makeText(this, "不可为空", Toast.LENGTH_SHORT).show();
                    break;
                }
                ArrayMap<String, String> map = new ArrayMap<>();
                String user_phone = phone.getText().toString();
                String user_pwd =EncryptUtils.encryptMD5ToString(pwd.getText().toString()).substring(0,8);
                map.put("phone",user_phone);
                map.put("pwd",user_pwd);
                presenter.Login_Success(map);

            }break;
        }
    }
}
