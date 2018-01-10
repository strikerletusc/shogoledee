package com.e1sol.shogoleeedee.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.e1sol.shogoleeedee.R;

/**
 * Created by User on 1/10/2018.
 */

public class EditMyAccountFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Spinner userGender;
    CalendarView calendar;
    EditText userName,userDateOfBirth,userPhone,userEmail,userPassword,userLocation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root  = inflater.inflate(R.layout.my_account_edit_fragment_layout,container,false);
        userGender =(Spinner) root.findViewById(R.id.user_gender);
        userName = (EditText) root.findViewById(R.id.user_name);
        userDateOfBirth = (EditText) root.findViewById(R.id.user_date_of_birth);
        userPhone = (EditText) root.findViewById(R.id.user_phone_no);
        userEmail = (EditText) root.findViewById(R.id.user_email);
        userPassword = (EditText) root.findViewById(R.id.user_password);
        userLocation = (EditText) root.findViewById(R.id.user_location);


        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.gender,android.R.layout.simple_spinner_item);
        userGender.setAdapter(adapter);
        userGender.setOnItemSelectedListener(this);

        return root;
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView userGender = (TextView) view;

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
