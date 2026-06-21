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

public class FragmentFrance extends Fragment {
    public static FragmentFrance newInstance() {
        return new FragmentFrance();
    }

    private ImageView imageViewFrance;
    private ProgressBar progressBarFrance;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_france,container,false);
        ScrollView scrollView = view.findViewById(R.id.scrollViewFrance);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewFrance = view.findViewById(R.id.imageViewFrance);
        progressBarFrance = view.findViewById(R.id.progressBarFrance);

        Picasso.get().load("https://getwallpapers.com/wallpaper/full/5/7/6/1423082-full-size-french-flag-wallpaper-1920x1080-iphone.jpg").into(imageViewFrance, new Callback() {
            @Override
            public void onSuccess() {
                progressBarFrance.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarFrance.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
