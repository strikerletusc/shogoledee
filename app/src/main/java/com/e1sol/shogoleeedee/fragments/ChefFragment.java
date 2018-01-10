package com.e1sol.shogoleeedee.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e1sol.shogoleeedee.R;
import com.e1sol.shogoleeedee.adapters.ChefsAdapter;
import com.e1sol.shogoleeedee.models.Chefs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/6/2018.
 */

public class ChefFragment extends Fragment {

    private RecyclerView chefRecyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Chefs> chefsList;
    private ChefsAdapter chefsAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.chefs_fragment_layout,container,false);
        chefRecyclerView = root.findViewById(R.id.chefs_recycler_view);
        chefsList = new ArrayList<Chefs>();
        chefsAdapter = new ChefsAdapter(getActivity() ,chefsList);
        chefRecyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getActivity(),2);
        chefRecyclerView.setLayoutManager(layoutManager);
        chefRecyclerView.setItemAnimator(new DefaultItemAnimator());
        chefRecyclerView.setHasFixedSize(true);
        chefRecyclerView.setAdapter(chefsAdapter);
        getChefs();

        return root;
    }

    private void getChefs() {
        Chefs chefOne = new Chefs(R.drawable.chef_image,"Clare Smyth","Seashell Julaia Hotel and Resort",R.drawable.star);
        chefsList.add(chefOne);
        Log.e("Size",chefsList.size()+"");

        Chefs chefTwo = new Chefs(R.drawable.chef_image,"Angelina Harnett","Arifjan Camp",R.drawable.star);
        chefsList.add(chefTwo);
        Log.e("Size",chefsList.size()+"");

        Chefs chefThree = new Chefs(R.drawable.chef_image,"Monica Galetti","King Fahad Bin Abdul Aziz Road ",R.drawable.star);
        chefsList.add(chefThree);
        Log.e("Size",chefsList.size()+"");

        Chefs chefFour = new Chefs(R.drawable.chef_image,"Christine ha","Al Wafrah Kuwait",R.drawable.star);

        chefsList.add(chefFour);
        Log.e("Size",chefsList.size()+"");

        Chefs chefFive = new Chefs(R.drawable.chef_image,"Shelina Permallo","Ahmad Al Jabir Airbase",R.drawable.star);
        chefsList.add(chefFive);
        Log.e("Size",chefsList.size()+"");
        Chefs chefSix = new Chefs(R.drawable.chef_image,"Natelie Coleman","Texas",R.drawable.star);
        chefsList.add(chefSix);

        chefsAdapter.notifyDataSetChanged();








    }
}
