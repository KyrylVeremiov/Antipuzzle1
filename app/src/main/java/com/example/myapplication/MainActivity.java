package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView[] imageViews = {
                findViewById(R.id.image_our_view1),
                findViewById(R.id.image_our_view2),
                findViewById(R.id.image_our_view3),
                findViewById(R.id.image_our_view4),
                findViewById(R.id.image_our_view5),
                findViewById(R.id.image_our_view6),
                findViewById(R.id.image_our_view7),
                findViewById(R.id.image_our_view8),
                findViewById(R.id.image_our_view9),
                findViewById(R.id.image_our_view10),
                findViewById(R.id.image_our_view11),
                findViewById(R.id.image_our_view12),
                findViewById(R.id.image_our_view13),
                findViewById(R.id.image_our_view14),
                findViewById(R.id.image_our_view15),
                findViewById(R.id.image_our_view16),
                findViewById(R.id.image_our_view17),
                findViewById(R.id.image_our_view18),
                findViewById(R.id.image_our_view19),
                findViewById(R.id.image_our_view20),
                findViewById(R.id.image_our_view21),
                findViewById(R.id.image_our_view22),
                findViewById(R.id.image_our_view23),
                findViewById(R.id.image_our_view24),
                findViewById(R.id.image_our_view25),
                findViewById(R.id.image_our_view26),
                findViewById(R.id.image_our_view27),
                findViewById(R.id.image_our_view28),
                findViewById(R.id.image_our_view29),
                findViewById(R.id.image_our_view30),
                findViewById(R.id.image_our_view31),
                findViewById(R.id.image_our_view32),
                findViewById(R.id.image_our_view33),
                findViewById(R.id.image_our_view34),
                findViewById(R.id.image_our_view35),
                findViewById(R.id.image_our_view36)
        };
        for(int i=0;i<imageViews.length;i++){
            imageViews[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "ImageView clicked!!!");
                    v.setVisibility(View.GONE);
                }
            });
        }
    }
}