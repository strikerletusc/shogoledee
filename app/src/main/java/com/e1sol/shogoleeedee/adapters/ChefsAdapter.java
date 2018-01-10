package com.e1sol.shogoleeedee.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e1sol.shogoleeedee.R;
import com.e1sol.shogoleeedee.models.Chefs;

import java.util.List;

/**
 * Created by User on 1/6/2018.
 */

public class ChefsAdapter extends RecyclerView.Adapter<ChefsAdapter.MyViewHolder> {
    private Context mcontext;
    private List<Chefs> catalogList;


    public ChefsAdapter(Context context , List<Chefs> catalogList){

        this.mcontext = context;
        this.catalogList = catalogList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chefs_layout,parent,false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

     Chefs chefs = catalogList.get(position);
     holder.chefLocation.setText(chefs.getChefLocation());
     holder.chefName.setText(chefs.getChefName());

     holder.profilePicture.setImageResource(R.drawable.chef_image);


    }

    @Override
    public int getItemCount()
    {
        return catalogList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public   ImageView profilePicture,chefReview;
        public  TextView chefName , chefLocation;

        public MyViewHolder(View itemView) {
            super(itemView);
            profilePicture = itemView.findViewById(R.id.chef_image);
            chefName= itemView.findViewById(R.id.chef_name);
            chefLocation = itemView.findViewById(R.id.chef_location);

        }
    }
}
