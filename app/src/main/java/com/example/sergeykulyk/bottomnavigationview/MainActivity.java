package com.example.sergeykulyk.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigationView = findViewById(R.id.bottom_navigation);

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:

                            case R.id.action_calendar:

                            case R.id.action_match:

                            case R.id.action_chat:

                            case R.id.action_profile:
                        }
                        return true;
                    }
                });

        BottomNavigationViewHelper.removeShiftMode(mBottomNavigationView);

        mBottomNavigationView = findViewById(R.id.bottom_navigation);
        mBottomNavigationView.getMenu().getItem(getSelectedItem()).setCheckable(true);
    }

    private int getSelectedItem() {
        Menu menu = mBottomNavigationView.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            if (menu.getItem(i).isChecked()) {
                return i;
            }
        }
        return 0;
    }
}
