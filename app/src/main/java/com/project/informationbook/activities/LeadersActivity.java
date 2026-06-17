package com.project.informationbook.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.ViewPagerAdapterCountry;
import com.project.informationbook.adapters.ViewPagerAdapterLeaders;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leaders);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tabLayoutLeaders = findViewById(R.id.tabLayoutLeaders);
        viewPagerLeaders = findViewById(R.id.viewPagerLeaders);

        ViewPagerAdapterLeaders adapter = new ViewPagerAdapterLeaders(getSupportFragmentManager(),getLifecycle());
        viewPagerLeaders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Donald Trump");
                        break;
                    case 1:
                        tab.setText("Vladimir Putin");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}