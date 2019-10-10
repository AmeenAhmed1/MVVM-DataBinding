package com.ameen.movieapp.mvvm.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> _name = new MutableLiveData<>("Grace");
    private MutableLiveData<String> _lastName = new MutableLiveData<>("Hopper");
    private MutableLiveData<Integer> _likes = new MutableLiveData<>(0);

    public LiveData<String> name = _name;
    public LiveData<String> lastName = _lastName;
    public LiveData<Integer> likes = _likes;

    public void onLike() {
        _likes.setValue((_likes.getValue()) + 1);
    }


//    public LiveData<Popularity> getPopularity() {
//        if (_likes.getValue() > 9)
//            return Popularity.STAR;
//        else if (likes > 4)
//            return Popularity.POPULAR;
//        else
//            return Popularity.NORMAL;
//    }


//    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();
//
//    public void getMovieName(){
//        String movieName = getMovieFromDataBase().getName();
//        movieNameMutableLiveData.setValue(movieName);
//    }
//
//    private MovieModel getMovieFromDataBase(){
//        return new MovieModel("Hero 7");
//    }
}
