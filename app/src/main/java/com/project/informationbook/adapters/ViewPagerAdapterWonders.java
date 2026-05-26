package com.project.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.informationbook.fragments.FragmentChichenItza;
import com.project.informationbook.fragments.FragmentChristTheRedeemer;
import com.project.informationbook.fragments.FragmentColosseum;
import com.project.informationbook.fragments.FragmentGreatWallofChina;
import com.project.informationbook.fragments.FragmentMachuPicchu;
import com.project.informationbook.fragments.FragmentPetra;
import com.project.informationbook.fragments.FragmentPutin;
import com.project.informationbook.fragments.FragmentTajMahal;
import com.project.informationbook.fragments.FragmentTrump;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {
    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentGreatWallofChina.newInstance();
                break;
            case 1:
                fragment = FragmentPetra.newInstance();
                break;
            case 2:
                fragment = FragmentChristTheRedeemer.newInstance();
                break;
            case 3:
                fragment = FragmentMachuPicchu.newInstance();
                break;
            case 4:
                fragment = FragmentChichenItza.newInstance();
                break;
            case 5:
                fragment = FragmentColosseum.newInstance();
                break;
            case 6:
                fragment = FragmentTajMahal.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
