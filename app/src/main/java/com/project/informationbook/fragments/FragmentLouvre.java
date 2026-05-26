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

public class FragmentLouvre extends Fragment {
    public static FragmentLouvre newInstance() {
        return new FragmentLouvre();
    }

    private ImageView imageViewLouvre;
    private ProgressBar progressBarLouvre;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_louvre,container,false);

        imageViewLouvre = view.findViewById(R.id.imageViewLouvre);
        progressBarLouvre = view.findViewById(R.id.progressBarLouvre);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Louvre_Museum_Wikimedia_Commons.jpg/1920px-Louvre_Museum_Wikimedia_Commons.jpg").into(imageViewLouvre, new Callback() {
            @Override
            public void onSuccess() {
                progressBarLouvre.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarLouvre.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
