package com.bawei.dome39.presenter;

import android.util.Log;
import android.view.Display;

import com.bawei.dome39.contract.Contract;
import com.bawei.dome39.model.Model;
import com.bawei.dome39.mvp.BasePresenter;
import com.bawei.dome39.mvp.IBaseModel;

import java.util.Map;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public class Presenter extends BasePresenter<Model, Contract.IView> implements Contract.Presenter {

    @Override
    public void Register_Success(Map<String, String> map) {
     model.Register_Success(map, new Contract.IModel.CallBack() {
         @Override
         public void Success(Object object) {
           getView().Success(object);
         }

         @Override
         public void Error(Throwable throwable) {

         }
     });
    }

    @Override
    public void Login_Success(Map<String, String> map) {
     model.Login_Success(map, new Contract.IModel.CallBack() {
         @Override
         public void Success(Object object) {
             getView().Success(object);
         }

         @Override
         public void Error(Throwable throwable) {

         }
     });
    }

    @Override
    public void Merchandiseorder_Success(Map<String, String> headermap, Map<String, String> querymap) {
        model.Merchandiseorder_Success(headermap, querymap, new Contract.IModel.CallBack() {
            @Override
            public void Success(Object object) {
                getView().Success(object);
            }

            @Override
            public void Error(Throwable throwable) {

            }
        });
    }


    @Override
    public void Error(Throwable throwable) {

    }

    @Override
    protected Model initModel() {
        return new Model();
    }
}
