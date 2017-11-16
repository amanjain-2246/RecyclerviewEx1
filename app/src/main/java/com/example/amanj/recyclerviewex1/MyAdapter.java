package com.example.amanj.recyclerviewex1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amanj on 4/24/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String state[],capital[];
    MyAdapter(String sname[],String cname[])
    {
        state=sname;
        capital=cname;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
holder.txtstate.setText(state[position]);
        holder.txtcap.setText(capital[position]);
    }

    @Override
    public int getItemCount() {
        return state.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
TextView txtstate,txtcap;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtstate=(TextView)itemView.findViewById(R.id.textView);
            txtcap=(TextView)itemView.findViewById(R.id.textView2);


        }
    }
}
