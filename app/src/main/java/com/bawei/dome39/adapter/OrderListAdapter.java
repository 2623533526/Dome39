package com.bawei.dome39.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.dome39.R;
import com.bawei.dome39.entity.Merchandiseorder_Entity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: 张家辅
 * @date: 2020/02/16
 */
public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.MyHv> {
    Context context;
    List<Merchandiseorder_Entity.OrderListBean> orderList;

    public OrderListAdapter(Context context, List<Merchandiseorder_Entity.OrderListBean> orderList) {
        this.context = context;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public MyHv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.orderlist_itme, null);
        MyHv myHv = new MyHv(inflate);
        return myHv;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHv holder, int position) {
        holder.title.setText("订单id："+orderList.get(position).getOrderId());


    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class MyHv extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.register2)
        RecyclerView register2;
        @BindView(R.id.bt)
        Button bt;

        public MyHv(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
