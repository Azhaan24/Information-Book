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

public class FragmentMetropolitanMuseum extends Fragment {
    public static FragmentMetropolitanMuseum newInstance() {
        return new FragmentMetropolitanMuseum();
    }

    private ImageView imageViewMetropolitanMuseum;
    private ProgressBar progressBarMetropolitanMuseum;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_metropolitanmuseum,container,false);

        imageViewMetropolitanMuseum = view.findViewById(R.id.imageViewMetropolitanMuseum);
        progressBarMetropolitanMuseum = view.findViewById(R.id.progressBarMetropolitanMuseum);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Metropolitan_Museum_of_Art_%28The_Met%29_-_Central_Park%2C_NYC.jpg/1920px-Metropolitan_Museum_of_Art_%28The_Met%29_-_Central_Park%2C_NYC.jpg").into(imageViewMetropolitanMuseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarMetropolitanMuseum.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarMetropolitanMuseum.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
