package com.epicodus.myspace;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class PicturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);

        Picasso.with(this)
                .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
                .into(imageView);
        Picasso.with(this)
                .load("https://secure-b.vimeocdn.com/ts/203/730/203730296_640.jpg")
                .into(imageView2);
    }
}
