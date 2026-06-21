package com.project.informationbook.fragments;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
        ScrollView scrollView = view.findViewById(R.id.scrollViewMetropolitanMuseum);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewMetropolitanMuseum = view.findViewById(R.id.imageViewMetropolitanMuseum);
        progressBarMetropolitanMuseum = view.findViewById(R.id.progressBarMetropolitanMuseum);

        Picasso.get().load("https://coast2coastwithkids.com/wp-content/uploads/2024/12/71F379C6-365A-4AE4-B1B8-09614446C511_1_201_a-1536x1152.jpeg").into(imageViewMetropolitanMuseum, new Callback() {
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
