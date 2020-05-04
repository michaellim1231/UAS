package com.example.uasprogtech;

import android.drm.DrmStore;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.uasprogtech.ui.dashboard.DashboardFragment;
import com.example.uasprogtech.ui.home.ScoreFragment;
import com.example.uasprogtech.ui.notifications.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        BottomNavigationView navView = findViewById(R.id.bottom_nav_bar);

        DashboardFragment dashboard = new DashboardFragment();
        FragmentTransaction ftdashboard = getSupportFragmentManager().beginTransaction();
        ftdashboard.replace(R.id.Main_Frame, dashboard, "Dashboard");
        ftdashboard.commit();

        BottomNavigationView nav = findViewById(R.id.bottom_nav_bar);
        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.navigation_dashboard:
                        DashboardFragment dashboard = new DashboardFragment();
                        FragmentTransaction ftdashboard = getSupportFragmentManager().beginTransaction();
                        ftdashboard.replace(R.id.Main_Frame, dashboard, "Dashboard");
                        ftdashboard.commit();
                        return true;
                    case R.id.navigation_score:
                        ScoreFragment score = new ScoreFragment();
                        FragmentTransaction ftscore = getSupportFragmentManager().beginTransaction();
                        ftscore.replace(R.id.Main_Frame, score, "Score");
                        ftscore.commit();
                        return true;
                    case R.id.navigation_setting:
                        SettingFragment setting = new SettingFragment();
                        FragmentTransaction ftsetting = getSupportFragmentManager().beginTransaction();
                        ftsetting.replace(R.id.Main_Frame, setting, "Setting");
                        ftsetting.commit();
                        return true;

                }
                return false;
            }
        });



//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_score, R.id.navigation_dashboard, R.id.navigation_setting)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.Main_Frame);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);
    }


}
