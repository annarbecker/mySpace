package com.epicodus.myspace;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mAddMusicButton;
    private Button mPicturesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddMusicButton = (Button) findViewById(R.id.addMusicButton);
            mAddMusicButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MusicActivity.class);
                    startActivity(intent);
                }
            });
        mPicturesButton = (Button) findViewById(R.id.picturesButton);
            mPicturesButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, PicturesActivity.class);
                    startActivity(intent);
                }
            });
        TextView textViewCustom = (TextView) findViewById(R.id.textView);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Italic.ttf");
        textViewCustom.setTypeface(myCustomFont);
    }
}
