package com.example.examenfinalinterfaces;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.tv_titulo);
        TextView mySubtitle = (TextView)findViewById(R.id.tvSlogan);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

        ImageView mForest = (ImageView) findViewById(R.id.backforest);


        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()

                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(mForest);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);

        mySubtitle.startAnimation(myanim);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
