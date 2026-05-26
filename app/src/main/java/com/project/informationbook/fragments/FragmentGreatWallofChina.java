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

public class FragmentGreatWallofChina extends Fragment {
    public static FragmentGreatWallofChina newInstance() {
        return new FragmentGreatWallofChina();
    }

    private ImageView imageViewGreatWallOfChina;
    private ProgressBar progressBarGreatWallOfChina;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wallofchina,container,false);

        imageViewGreatWallOfChina = view.findViewById(R.id.imageViewWallofChina);
        progressBarGreatWallOfChina = view.findViewById(R.id.progressBarWallofChina);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/1280px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg").into(imageViewGreatWallOfChina, new Callback() {
            @Override
            public void onSuccess() {
                progressBarGreatWallOfChina.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarGreatWallOfChina.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
