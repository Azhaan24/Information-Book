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

public class FragmentTajMahal extends Fragment {
    public static FragmentTajMahal newInstance() {
        return new FragmentTajMahal();
    }

    private ImageView imageViewTajMahal;
    private ProgressBar progressBarTajMahal;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tajmahal,container,false);
        ScrollView scrollView = view.findViewById(R.id.scrollViewTajMahal);
        ViewCompat.setOnApplyWindowInsetsListener(scrollView, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left,bars.top,bars.right,bars.bottom);
            return insets;
        });

        imageViewTajMahal = view.findViewById(R.id.imageViewTajMahal);
        progressBarTajMahal = view.findViewById(R.id.progressBarTajMahal);

        Picasso.get().load("https://static.wixstatic.com/media/055605_65e20a7fcbc54e2e8720adfc2544c35e~mv2.jpg/v1/fill/w_810,h_641,al_c,q_85,usm_0.66_1.00_0.01,enc_avif,quality_auto/taj_new_contant_edited.jpg").into(imageViewTajMahal, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTajMahal.setVisibility(INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarTajMahal.setVisibility(INVISIBLE);
            }
        });

        return view;
    }
}
