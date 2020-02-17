package com.bawei.dome39.contract;

import com.bawei.dome39.mvp.IBaseModel;
import com.bawei.dome39.mvp.IBaseView;

import java.util.Map;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public class Contract {
    public interface IModel  extends IBaseModel {
     public void Register_Success(Map<String,String> map,CallBack callBack);
     public void Login_Success(Map<String,String> map,CallBack callBack);
     public void Merchandiseorder_Success(Map<String,String> headermap,Map<String,String> querymap,CallBack callBack);
     public void Error(Throwable throwable);
     interface CallBack{
         public void Success(Object object);
         public void Error(Throwable throwable);
     }
    }
    public interface IView extends IBaseView {
        public void Success(Object object);
        public void Error(Throwable throwable);
    }
    public interface Presenter{
        public void Register_Success(Map<String,String> map);
        public void Login_Success(Map<String,String> map);
        public void Merchandiseorder_Success(Map<String,String> headermap,Map<String,String> querymap);
        public void Error(Throwable throwable);
    }
}
