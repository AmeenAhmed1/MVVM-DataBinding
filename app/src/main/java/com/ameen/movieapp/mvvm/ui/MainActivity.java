package com.ameen.movieapp.mvvm.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.ameen.movieapp.mvvm.R;
import com.ameen.movieapp.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        binding.setViewModel(mainViewModel);

//        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
//        binding.setMovie(mainViewModel);
//        binding.setLifecycleOwner(this);
//
//        binding.getMovieButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainViewModel.getMovieName();
//            }
//        });

//        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
//        mainViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                moveNameText.setText(s);
//            }
//        });

    }
}
