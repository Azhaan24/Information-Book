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

public class FragmentBritishMuseum extends Fragment {
    public static FragmentBritishMuseum newInstance() {
        return new FragmentBritishMuseum();
    }

    private ImageView imageViewBritishMuseum;
    private ProgressBar progressBarBritishMuseum;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_britishmuseum,container,false);

        imageViewBritishMuseum = view.findViewById(R.id.imageViewBritishMuseum);
        progressBarBritishMuseum = view.findViewById(R.id.progressBarBritishMuseum);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/British_Museum_%28aerial%29.jpg/1280px-British_Museum_%28aerial%29.jpg?utm_source=en.wikipedia.org&utm_campaign=parser&utm_content=thumbnail").into(imageViewBritishMuseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarBritishMuseum.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarBritishMuseum.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
