package com.example.loginonlyonce.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginonlyonce.Berkas;
import com.example.loginonlyonce.Model.ModelClass;
import com.example.loginonlyonce.R;

import java.util.ArrayList;

public class AdapterInbox extends RecyclerView.Adapter<AdapterInbox.InboxViewHolder> {

    private ArrayList<ModelClass> dataList;
    View viewku;

    public AdapterInbox(ArrayList<ModelClass> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public InboxViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(ViewGroup.getContext());
        viewku = layoutInflater.inflate(R.layout.itemview, ViewGroup, false);
        return new InboxViewHolder(viewku);

    }

    @Override
    public void onBindViewHolder(@NonNull final InboxViewHolder holder, final int position) {

        holder.txtisi.setText(dataList.get(position).getTxtisi());
        holder.txttitle.setText(dataList.get(position).getTxttitle());
        holder.txttype.setText(dataList.get(position).getTxttype());
        holder.txtdate.setText(dataList.get(position).getTxtdate());
        if (dataList.get(position).getTxttype().equalsIgnoreCase("ERROR")){
            holder.vInbox.setBackgroundColor(Color.parseColor("#D41414"));
        }
        if (dataList.get(position).getTxttype().equalsIgnoreCase("SUCCESS")){
            holder.vInbox.setBackgroundColor(Color.parseColor("#14D45B"));
        }
        if (dataList.get(position).getTxttype().equalsIgnoreCase("INFO")){
            holder.vInbox.setBackgroundColor(Color.parseColor("#2A429E"));
        }
        holder.cvInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dataList.get(position).getTxttype().equalsIgnoreCase("ERROR")){
                    Intent in = new Intent(holder.itemView.getContext(), Berkas.class);
                    holder.itemView.getContext().startActivity(in);
                    ((Activity)viewku.getContext()).finish();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class InboxViewHolder extends RecyclerView.ViewHolder{
        private TextView txttitle, txtisi, txttype, txtdate;
        View vInbox;
        CardView cvInbox;

        InboxViewHolder(View itemView) {
            super(itemView);
            txttitle = itemView.findViewById(R.id.txttitle);
            txtisi = itemView.findViewById(R.id.txtisi);
            txttype = itemView.findViewById(R.id.txttype);
            vInbox = itemView.findViewById(R.id.vInbox);
            cvInbox = itemView.findViewById(R.id.cvInbox);
            txtdate = itemView.findViewById(R.id.txtdate);
        }
    }

}
