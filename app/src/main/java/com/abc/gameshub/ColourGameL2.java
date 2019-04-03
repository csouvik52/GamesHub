package com.abc.gameshub;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ColourGameL2 extends AppCompatActivity {
    TextView count, score, color;
    Button orange, blue, red, black, green, yellow, magenta, cyan, purple;
    ImageView start,nextLevell2;
    Random r = new Random();
    int index = -1;
    int scr = 0, coun = 1;
    Vibrator vibe;
    AlertDialog alert;
    String arrCol[] = {"ORANGE", "BLUE", "RED", "BLACK", "GREEN", "YELLOW", "MAGENTA", "CYAN", "PURPLE"};
    String arrColId[] = {"#f76706", "#000dff", "#ff0000", "#151414", "#31f206", "#f7f705", "#f716b3", "#06f2cf", "#9806b6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_game_l2);


        // alert dialog starts...
        AlertDialog.Builder build = new AlertDialog.Builder(this);
        build.setTitle("Exit Application");
        build.setMessage("Do You Want To Exit ?");
        build.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        build.setCancelable(false);
        alert = build.create();

        //alert dialog ends...



        orange = (Button) findViewById(R.id.btn_orange_l2);
        blue = (Button) findViewById(R.id.btn_blue_l2);
        red = (Button) findViewById(R.id.btn_red_l2);
        black = (Button) findViewById(R.id.btn_black_l2);
        green = (Button) findViewById(R.id.btn_green_l2);
        yellow = (Button) findViewById(R.id.btn_yellow_l2);
        magenta = (Button) findViewById(R.id.btn_magenta_l2);
        cyan = (Button) findViewById(R.id.btn_cyan_l2);
        purple = (Button) findViewById(R.id.btn_purple_l2);
        start = (ImageView) findViewById(R.id.imageViewl2Start);
        nextLevell2=(ImageView)findViewById(R.id.imageViewl2NextLevel);
        count=(TextView)findViewById(R.id.cgl2tvcount);
        color=(TextView)findViewById(R.id.textViewl2Color);
        score=(TextView)findViewById(R.id.cgl2tvscore);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 1) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 2) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });


        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 3) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });


        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 4) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });


        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 5) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 6) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 7) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 8) {
                    scr += 1;
                    score.setText("Score " + scr);
                } else {
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score.setText("Score: ");
                start.setImageResource(R.drawable.starticon);
                startGame(coun);
                start.setEnabled(false);
                start.setVisibility(View.INVISIBLE);
            }
        });

        nextLevell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ColourGameL2.this,ColourGameL3.class);
                startActivity(in);
                finish();
            }
        });

    }

    public void animate() {
        Animation anim = new TranslateAnimation(0, 20, 0, 0);
        anim.setDuration(3);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(10);
        color.startAnimation(anim);
    }

    public void startGame(int in) {
        final int j = in;
        if (in == 21) {

            if (scr > 10) {
                nextLevell2.setEnabled(true);
                nextLevell2.setVisibility(View.VISIBLE);
            }
            else{
               // nextLevell2.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"You are not qualified for next level",Toast.LENGTH_LONG).show();
            }

            index = -100;
            start.setEnabled(true);
            start.setVisibility(View.VISIBLE);
            start.setImageResource(R.drawable.restarticon);
            scr = 0;
            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                index = r.nextInt(900);
                index /= 100;
                count.setText("Count: " + j + "/20");
                color.setText(arrCol[index]);
                color.setTextColor(Color.parseColor(arrColId[index]));
                startGame(j + 1);
            }
        }, 1000);

    }

    @Override
    public void onBackPressed(){
        alert.show();
    }
}
