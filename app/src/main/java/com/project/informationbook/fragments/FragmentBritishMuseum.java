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
        ScrollView scrollView = view.findViewById(R.id.scrollViewBritishMuseum);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewBritishMuseum = view.findViewById(R.id.imageViewBritishMuseum);
        progressBarBritishMuseum = view.findViewById(R.id.progressBarBritishMuseum);

        Picasso.get().load("https://imageio.forbes.com/specials-images/imageserve/66ddef666c652b21864d6584/British-Museum-s-Security-In-Question-After-Revelations-Of-Missing-Treasures/0x0.jpg?format=jpg&width=1440").into(imageViewBritishMuseum, new Callback() {
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
