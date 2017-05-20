package com.example.vladimir.animalloader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;
import java.util.Random;

/**
 * Created by vladimir on 20.05.17.
 */

public class AnimalLoader extends AsyncTaskLoader<Animal> {


    public AnimalLoader(Context context) {
        super(context);

    }

    @Override
    public Animal loadInBackground() {
        Random random = new Random();
        return AnimalContainer.getAnimalsList().get(random.nextInt(9));
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        super.onStartLoading();

    }
}
