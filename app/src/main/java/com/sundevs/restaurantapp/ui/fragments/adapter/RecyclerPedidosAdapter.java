package com.sundevs.restaurantapp.ui.fragments.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sundevs.restaurantapp.R;

/**
 * Created by Latitude on 14/11/2016.
 */

public class RecyclerPedidosAdapter extends RecyclerView.Adapter<RecyclerPedidosAdapter.RecyclerPedidosHolder> {


    @Override
    public RecyclerPedidosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        RecyclerPedidosHolder holder = new RecyclerPedidosHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerPedidosHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerPedidosHolder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView labTitle;
        TextView labTime;

        public RecyclerPedidosHolder(View itemView) {
            super(itemView);
            imgFood = (ImageView) itemView.findViewById(R.id.img_food);
            labTime = (TextView) itemView.findViewById(R.id.lab_time);
            labTitle = (TextView) itemView.findViewById(R.id.lab_title);
        }
    }
}
