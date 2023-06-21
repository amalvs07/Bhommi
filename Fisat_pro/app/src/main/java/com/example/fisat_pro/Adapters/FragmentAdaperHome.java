package com.example.fisat_pro.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fisat_pro.ParameterView;
import com.example.fisat_pro.R;
import com.example.fisat_pro.fragmentdata.Details;

import java.util.List;

public class FragmentAdaperHome extends RecyclerView.Adapter<FragmentAdaperHome.MyViewHolder> {






    /**
     * Created by Mahadi on 3/11/2018.
     */



        Context context;
        List<Details> contactList;

        public FragmentAdaperHome(Context context, List<Details> contactList) {
            this.context = context;
            this.contactList = contactList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v;
            v = LayoutInflater.from(context).inflate(R.layout.parameters_contents, parent, false);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, ParameterView.class);
                    context.startActivity(intent);
                }
            });
            MyViewHolder myViewHolder = new MyViewHolder(v);
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.name.setText(contactList.get(position).getName());
            holder.phone_num.setText(contactList.get(position).getPhn());
            holder.imageView.setImageResource(contactList.get(position).getPhoto());
        }

        @Override
        public int getItemCount() {
            return contactList.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {

            TextView name;
            TextView phone_num;
            ImageView imageView;


            public MyViewHolder(View itemView) {
                super(itemView);

                name = (TextView) itemView.findViewById(R.id.text);
                phone_num = (TextView) itemView.findViewById(R.id.name);
                imageView = (ImageView) itemView.findViewById(R.id.image_view);
            }
        }
    }


