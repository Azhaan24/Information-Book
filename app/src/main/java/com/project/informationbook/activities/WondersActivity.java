package com.project.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.ViewPagerAdapterWonders;

public class WondersActivity extends AppCompatActivity {

    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewPagerWonders);

        ViewPagerAdapterWonders adapter = new ViewPagerAdapterWonders(getSupportFragmentManager(),getLifecycle());
        viewPagerWonders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutWonders, viewPagerWonders, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Great Wall of China");
                        break;
                    case 1:
                        tab.setText("Petra");
                        break;
                    case 2:
                        tab.setText("Christ The Redeemer");
                        break;
                    case 3:
                        tab.setText("Machu Picchu");
                        break;
                    case 4:
                        tab.setText("Chichen Itza");
                        break;
                    case 5:
                        tab.setText("Colossseum");
                        break;
                    case 6:
                        tab.setText("Taj Mahal");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}