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
        ScrollView scrollView = view.findViewById(R.id.scrollViewLouvreMuseum);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewLouvre = view.findViewById(R.id.imageViewLouvre);
        progressBarLouvre = view.findViewById(R.id.progressBarLouvre);

        Picasso.get().load("https://cdn.britannica.com/01/150801-050-3072D42F/Louvre-Museum-pyramid-Paris-Pei-IM.jpg").into(imageViewLouvre, new Callback() {
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
