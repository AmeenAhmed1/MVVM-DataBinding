package com.ameen.movieapp.mvvm.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.databinding.BindingAdapter;

public class DataBindingAdapter {

    @BindingAdapter("app:hideIfZero")
    public static void hideIfZero(View view, int num) {
        if (num == 0)
            view.setVisibility(View.GONE);
        else
            view.setVisibility(View.VISIBLE);
    }

    @BindingAdapter(value = {"app:progressScaled", "android:max"}, requireAll = true)
    public static void setProgress(ProgressBar progressBar, int likes, int max) {
        progressBar.setProgress((likes));
    }

}
