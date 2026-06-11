package com.project.informationbook.fragments;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentChichenItza extends Fragment {
    public static FragmentChichenItza newInstance() {
        return new FragmentChichenItza();
    }

    private ImageView imageViewChichenItza;
    private ProgressBar progressBarChichenItza;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chichenitza,container,false);

        imageViewChichenItza = view.findViewById(R.id.imageViewChichenItza);
        progressBarChichenItza = view.findViewById(R.id.progressBarChichenItza);

        Picasso.get().load("https://i0.wp.com/www.mexicotours.travel/wp-content/uploads/2022/06/SAT-Mexico-tours-and-Travel-destination-Yucatan-chichen-itza-facts-.webp?fit=900%2C500&ssl=1").into(imageViewChichenItza, new Callback() {
            @Override
            public void onSuccess() {
                progressBarChichenItza.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarChichenItza.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
