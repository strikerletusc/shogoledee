package com.e1sol.shogoleeedee.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.e1sol.shogoleeedee.R;

/**
 * Created by User on 1/10/2018.
 */

public class ViewMyaccountFragment extends Fragment {
    Button edit_button;
    FragmentManager fragmentManager;
    FragmentTransaction transaction;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.my_account_view_fragment_layout,container,false);
        edit_button = (Button) root.findViewById(R.id.edit_my_account_button);
        onClickEditButton();
        return root;
    }

    private void onClickEditButton() {
        edit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager= getFragmentManager();
                transaction = fragmentManager.beginTransaction();
                EditMyAccountFragment editMyAccountFragment = new EditMyAccountFragment();
                transaction.replace(R.id.profile_layout,editMyAccountFragment);
                transaction.commit();
            }
        });

    }
}
