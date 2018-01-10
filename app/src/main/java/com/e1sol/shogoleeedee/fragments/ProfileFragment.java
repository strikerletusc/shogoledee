package com.e1sol.shogoleeedee.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.e1sol.shogoleeedee.R;
import com.e1sol.shogoleeedee.activities.MyAccount;
import com.e1sol.shogoleeedee.activities.MyFavourties;
import com.e1sol.shogoleeedee.activities.MyInvoices;
import com.e1sol.shogoleeedee.activities.MyOrders;

/**
 * Created by User on 1/9/2018.
 */

public class ProfileFragment extends Fragment {
    FragmentManager fragmentManager;
    FragmentTransaction transaction;
    RelativeLayout myAccountRelativeLayout;
    RelativeLayout myOrdersRelativeLayout;
    RelativeLayout myInvoicesRelativeLayout;
    RelativeLayout myFavourtiesRelativeLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.profile_fragment_layout,container,false);
        myAccountRelativeLayout = (RelativeLayout) root.findViewById(R.id.my_account);
        myOrdersRelativeLayout = (RelativeLayout) root.findViewById(R.id.my_orders);
        myInvoicesRelativeLayout =(RelativeLayout) root.findViewById(R.id.my_invoice);
        myFavourtiesRelativeLayout =(RelativeLayout) root.findViewById(R.id.my_favourites);
        onClickMyAccount();
        onClickMyOrders();
        onClickMyInvoices();
        onClickMyFavourties();
        return root;

    }

    private void onClickMyAccount() {
       myAccountRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyAccount.class);
                getActivity().startActivity(intent);
            }
        });
    }
    private void onClickMyOrders() {
        myOrdersRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyOrders.class);
                getActivity().startActivity(intent);
            }
        });

    }
    private void onClickMyInvoices() {
        myInvoicesRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyInvoices.class);
                getActivity().startActivity(intent);
            }
        });
    }
    private void onClickMyFavourties() {
        myFavourtiesRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyFavourties.class);
                getActivity().startActivity(intent);
            }
        });
    }
}
