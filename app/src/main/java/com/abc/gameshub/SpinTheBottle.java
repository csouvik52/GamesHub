package com.abc.gameshub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class SpinTheBottle extends AppCompatActivity {
    View rel;
    ImageView bot;
    int lastAngle = -1, angle;
    Random r;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_the_bottle);
        rel = findViewById(R.id.view);
        bot = (ImageView) findViewById(R.id.spbbottle);
        r = new Random();
        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinBottle();
            }
        });

    }

    public void spinBottle() {
        angle = r.nextInt(3600 - 360) + 360;
        anim = new RotateAnimation(lastAngle == -1 ? 0 : lastAngle, angle, bot.getPivotX(), bot.getPivotY());
        anim.setDuration(2500);
        anim.setFillAfter(true);
        bot.startAnimation(anim);

        lastAngle = angle;
    }
}