package com.example.vladimir.animalloader;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private TextView mTextViewName;
    private TextView mTextViewAge;
    private TextView mTextViewClasseness;
    private Button mButton;
    private static final int SOME_ID = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewAge = (TextView)findViewById(R.id.age);
        mTextViewName = (TextView)findViewById(R.id.name);
        mTextViewClasseness = (TextView)findViewById(R.id.classeless);
        mButton = (Button)findViewById(R.id.mButton);

        getSupportLoaderManager().initLoader(SOME_ID, null, new AnimalLoaderCallBack());

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportLoaderManager().getLoader(SOME_ID).forceLoad();
            }
        });

    }

    private class AnimalLoaderCallBack implements LoaderManager.LoaderCallbacks<Animal>{

        @Override
        public Loader<Animal> onCreateLoader(int id, Bundle args) {
            return new AnimalLoader(MainActivity.this);
        }

        @Override
        public void onLoadFinished(Loader<Animal> loader, Animal data) {
            mTextViewName.setText(data.getName());
            mTextViewAge.setText(String.valueOf(data.getAge()));
            mTextViewClasseness.setText(data.getClasseless());
        }

        @Override
        public void onLoaderReset(Loader<Animal> loader) {

        }
    }
}
