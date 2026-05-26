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

public class FragmentColosseum extends Fragment {
    public static FragmentColosseum newInstance() {
        return new FragmentColosseum();
    }

    private ImageView imageViewColosseum;
    private ProgressBar progressBarColosseum;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_colosseum,container,false);

        imageViewColosseum = view.findViewById(R.id.imageViewColosseum);
        progressBarColosseum = view.findViewById(R.id.progressBarColosseum);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Colosseo_2020.jpg/1280px-Colosseo_2020.jpg").into(imageViewColosseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarColosseum.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarColosseum.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
