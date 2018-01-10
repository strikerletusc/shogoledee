package com.e1sol.shogoleeedee.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import com.e1sol.shogoleeedee.adapters.ChefsAdapter;
import com.e1sol.shogoleeedee.fragments.ChefFragment;
import com.e1sol.shogoleeedee.fragments.ProfileFragment;
import com.e1sol.shogoleeedee.helpers.BottomNavigationViewHelper;
import com.e1sol.shogoleeedee.R;
import com.e1sol.shogoleeedee.models.Chefs;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomMenuBar;
    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    private RecyclerView chefRecyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Chefs> chefsList;
    private ChefsAdapter chefsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         bottomMenuBar = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomMenuBar);
        selectBottomMenuItem();






    }

    private void selectBottomMenuItem() {

        bottomMenuBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.chef){
                    fragmentManager= getSupportFragmentManager();
                    transaction = fragmentManager.beginTransaction();
                    ChefFragment chefFragment = new ChefFragment();
                    transaction.add(R.id.main_layout,chefFragment);
                    transaction.commit();


                }else if(item.getItemId() == R.id.profile){
                    fragmentManager= getSupportFragmentManager();
                    transaction = fragmentManager.beginTransaction();
                    ProfileFragment profileFragment = new ProfileFragment();
                    transaction.add(R.id.main_layout,profileFragment);
                    transaction.commit();

                }
            else if(item.getItemId() == R.id.feed){
                Toast.makeText(MainActivity.this, "feed View Screen", Toast.LENGTH_SHORT).show();

            }
        else if(item.getItemId() == R.id.cart){
            Toast.makeText(MainActivity.this, "cart View Screen", Toast.LENGTH_SHORT).show();

        }
    else if(item.getItemId() == R.id.filter){
        Toast.makeText(MainActivity.this, "filter View Screen", Toast.LENGTH_SHORT).show();

    }

                return true;
            }
        });
    }


}
