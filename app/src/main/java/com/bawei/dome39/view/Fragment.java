package com.bawei.dome39.view;

import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bawei.dome39.R;
import com.bawei.dome39.adapter.OrderListAdapter;
import com.bawei.dome39.base.BaseFragment;
import com.bawei.dome39.contract.Contract;
import com.bawei.dome39.entity.Merchandiseorder_Entity;
import com.bawei.dome39.presenter.Presenter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public class Fragment extends BaseFragment<Presenter> implements Contract.IView {
    @BindView(R.id.register1)
    XRecyclerView recycler1;
    private String status;
    private Unbinder bind;
    int page=1;
    private ArrayList<Merchandiseorder_Entity.OrderListBean> list;
    private OrderListAdapter orderListAdapter;

    @Override
    protected int layoutid() {
        return R.layout.fragment;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        bind = ButterKnife.bind(this, getView());
        recycler1.setLoadingMoreEnabled(true);
        recycler1.setPullRefreshEnabled(true);
        recycler1.setLayoutManager(new LinearLayoutManager(getContext()));
        status = getArguments().getString("status");
        list = new ArrayList<>();



        recycler1.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getContext(), "刷新", Toast.LENGTH_SHORT).show();
                page=1;
                ArrayMap<String, String> headermap = new ArrayMap<>();
                headermap.put("userId", "27842");
                headermap.put("sessionId", "158184338295527842");
                presenter.Register_Success(headermap);
                ArrayMap<String, String> querymap = new ArrayMap<>();
                querymap.put("status", status);
                querymap.put("page", page+"");
                querymap.put("count", "5");
                presenter.Merchandiseorder_Success(headermap, querymap);
                recycler1.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                page++;
                Toast.makeText(getContext(), "加载更多", Toast.LENGTH_SHORT).show();
                ArrayMap<String, String> headermap = new ArrayMap<>();
                headermap.put("userId", "27842");
                headermap.put("sessionId", "158184338295527842");
                presenter.Register_Success(headermap);
                ArrayMap<String, String> querymap = new ArrayMap<>();
                querymap.put("status", status);
                querymap.put("page", page+"");
                querymap.put("count", "5");
                presenter.Merchandiseorder_Success(headermap, querymap);
                recycler1.loadMoreComplete();
            }
        });


        ArrayMap<String, String> headermap = new ArrayMap<>();
        headermap.put("userId", "27842");
        headermap.put("sessionId", "158184338295527842");
        presenter.Register_Success(headermap);
        ArrayMap<String, String> querymap = new ArrayMap<>();
        querymap.put("status", status);
        querymap.put("page", "1");
        querymap.put("count", "5");
        presenter.Merchandiseorder_Success(headermap, querymap);

    }

    @Override
    protected Presenter initPresenter() {
        return new Presenter();
    }

    @Override
    public void Success(Object object) {
        if (object instanceof Merchandiseorder_Entity) {
            Merchandiseorder_Entity merchandiseorder_entity = (Merchandiseorder_Entity) object;
            List<Merchandiseorder_Entity.OrderListBean> orderList = merchandiseorder_entity.getOrderList();
            if(page!=1) {
              list.clear();
            }
            list.addAll(orderList);
            Log.i("XXX",list.size()+"");
            orderListAdapter = new OrderListAdapter(getContext(), list);
            recycler1.setAdapter(orderListAdapter);
        }

    }

    public static Fragment getInstance(int status) {
        Fragment fragment = new Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("status", status + "");
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void Error(Throwable throwable) {


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
            bind.unbind();
        }
    }
    public void getData(int page){

    }
}
