package com.e1sol.shogoleeedee.activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e1sol.shogoleeedee.R;
import com.e1sol.shogoleeedee.fragments.EditMyAccountFragment;
import com.e1sol.shogoleeedee.fragments.ProfileFragment;
import com.e1sol.shogoleeedee.fragments.ViewMyaccountFragment;

public class MyAccount extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        fragmentManager= getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        ViewMyaccountFragment viewMyaccountFragment = new ViewMyaccountFragment();
        transaction.add(R.id.profile_layout,viewMyaccountFragment);
        transaction.commit();
    }

}
