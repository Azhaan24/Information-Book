package com.project.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.ViewPagerAdapterMuseums;

public class MuseumsActivity extends AppCompatActivity {

    private TabLayout tabLayoutMuseums;
    private ViewPager2 viewPagerMuseums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        tabLayoutMuseums = findViewById(R.id.tabLayoutMuseum);
        viewPagerMuseums = findViewById(R.id.viewPagerMuseum);

        ViewPagerAdapterMuseums adapter = new ViewPagerAdapterMuseums(getSupportFragmentManager(),getLifecycle());
        viewPagerMuseums.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutMuseums, viewPagerMuseums, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Louvre Museum");
                        break;
                    case 1:
                        tab.setText("National Museum of China");
                        break;
                    case 2:
                        tab.setText("British Museum");
                        break;
                    case 3:
                        tab.setText("Vatican Museums");
                        break;
                    case 4:
                        tab.setText("Metropolitan Museum");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}