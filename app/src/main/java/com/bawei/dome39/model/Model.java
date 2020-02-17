package com.bawei.dome39.model;

import android.util.Log;
import android.widget.Toast;

import com.bawei.dome39.contract.Contract;
import com.bawei.dome39.entity.Login_Entity;
import com.bawei.dome39.entity.Merchandiseorder_Entity;
import com.bawei.dome39.entity.Register_Entity;
import com.bawei.dome39.service.MyService;
import com.bawei.dome39.utlis.NetUtlis;
import com.bawei.dome39.view.MainActivity;

import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public class Model implements Contract.IModel {

    @Override
    public void Register_Success(Map<String, String> map, CallBack callBack) {
        NetUtlis.getInstance().create(MyService.class)
                .getregister(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Register_Entity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Register_Entity register_entity) {
                        callBack.Success(register_entity);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void Login_Success(Map<String, String> map, CallBack callBack) {
        NetUtlis.getInstance().create(MyService.class)
                .getlogin(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Login_Entity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Login_Entity login_Entity) {
                        callBack.Success(login_Entity);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void Merchandiseorder_Success(Map<String, String> headermap, Map<String, String> querymap, CallBack callBack) {
        NetUtlis.getInstance().create(MyService.class)
                .getnerchandiseorder(headermap,querymap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Merchandiseorder_Entity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Merchandiseorder_Entity merchandiseorder_entity) {
                       callBack.Success(merchandiseorder_entity);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void Error(Throwable throwable) {

    }
}
