package com.project.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.project.informationbook.R;
import com.project.informationbook.adapters.ViewPagerAdapterCountry;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutCountries = findViewById(R.id.tabLayoutUK);
        viewPagerCountries = findViewById(R.id.viewPagerUK);

        ViewPagerAdapterCountry adapterCountry = new ViewPagerAdapterCountry(getSupportFragmentManager(),getLifecycle());
        viewPagerCountries.setAdapter(adapterCountry);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountries, viewPagerCountries, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                    case 1:
                        tab.setText("France");
                        break;
                    case 2:
                        tab.setText("Italy");
                        break;
                    case 3:
                        tab.setText("Turkiye");
                        break;
                    case 4:
                        tab.setText("Germany");
                        break;
                    case 5:
                        tab.setText("Russia");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}