package com.example.uasprogtech.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.uasprogtech.R;

public class DashboardFragment extends Fragment {

    CardView cv_category1,cv_category2,cv_category3,cv_category4,cv_category5,cv_category6;

    public DashboardFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        cv_category1 = view.findViewById(R.id.cv_category1);
        cv_category2 = view.findViewById(R.id.cv_category2);
        cv_category3 = view.findViewById(R.id.cv_category3);
        cv_category4 = view.findViewById(R.id.cv_category4);
        cv_category5 = view.findViewById(R.id.cv_category5);
        cv_category6 = view.findViewById(R.id.cv_category6);

        cv_category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory1();
            }

        });
        cv_category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory2();
            }
        });
        cv_category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory3();
            }
        });
        cv_category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory4();
            }
        });
        cv_category5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory5();
            }
        });
        cv_category6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory6();
            }
        });
        return view;
    }

    private void openCategory6() {
    }

    private void openCategory5() {
    }

    private void openCategory4() {
    }

    private void openCategory3() {
    }

    private void openCategory2() {

    }

    private void openCategory1() {

    }
}
