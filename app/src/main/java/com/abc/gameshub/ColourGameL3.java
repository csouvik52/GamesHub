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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ColourGameL3 extends AppCompatActivity {

    TextView count,score,color;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageView start,nextLevell3;
    Random r = new Random();
    int index=-100;
    int coun = 1;
    int scr = 0;
    Vibrator vibe;
    AlertDialog alert;

    ArrayList<String> arrCol = new ArrayList<String>();
    String arrColId[]={"#f76706","#000dff","#ff0000","#151414","#31f206","#f7f705","#f716b3","#06f2cf","#9806b6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_game_l3);


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




        arrCol.add("ORANGE");     arrCol.add("BLUE");      arrCol.add("RED");
        arrCol.add("BLACK");   arrCol.add("GREEN");      arrCol.add("YELLOW");
        arrCol.add("MAGENTA");     arrCol.add("CYAN");      arrCol.add("PURPLE");

        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);


        b1=(Button)findViewById(R.id.cgl3_but1);
        b2=(Button)findViewById(R.id.cgl3_but2);
        b3=(Button)findViewById(R.id.cgl3_but3);
        b4=(Button)findViewById(R.id.cgl3_but4);
        b5=(Button)findViewById(R.id.cgl3_but5);
        b6=(Button)findViewById(R.id.cgl3_but6);
        b7=(Button)findViewById(R.id.cgl3_but7);
        b8=(Button)findViewById(R.id.cgl3_but8);
        b9=(Button)findViewById(R.id.cgl3_but9);

        start = (ImageView)findViewById(R.id.imageViewl3Start);

        count = (TextView)findViewById(R.id.cgl3tvcount);
        score = (TextView)findViewById(R.id.cgl3tvscore);
        color = (TextView)findViewById(R.id.textViewl3Color);
        nextLevell3=(ImageView)findViewById(R.id.imageViewl3NextLevel);

        setButtonColors();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==1){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==2){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==3){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==4){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==5){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==6){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==7){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==8){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score.setText("Score: ");
                start.setImageResource(R.drawable.starticon);
                startGame(coun);
                start.setEnabled(false);
                score.setText("Score: ");
            }
        });

       nextLevell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent in=new Intent(ColourGameL3.this,Arena.class);
                //startActivity(in);
                finish();
            }
        });
    }

    public void setButtonColors(){
        Collections.shuffle(arrCol);

        b1.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(0))]));
        b2.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(1))]));
        b3.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(2))]));
        b4.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(3))]));
        b5.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(4))]));
        b6.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(5))]));
        b7.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(6))]));
        b8.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(7))]));
        b9.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(8))]));
    }

    public int getColor(String col){
        switch(col){
            case "ORANGE" :return 0;
            case "BLUE" :return 1;
            case "RED" :return 2;
            case "BLACK" :return 3;
            case "GREEN" :return 4;
            case "YELLOW" :return 5;
            case "MAGENTA" :return 6;
            case "CYAN" :return 7;
            case "PURPLE" :return 8;
            default: return -1;
        }

    }
    public void startGame(int in){
        final int j = in;
        if(in == 21){

            if (scr > 10) {
                nextLevell3.setEnabled(true);
                nextLevell3.setVisibility(View.VISIBLE);
            }
            else{
                nextLevell3.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"You are not qualified for next level",Toast.LENGTH_LONG).show();
            }

            index = -100;
            start.setEnabled(true);
            start.setImageResource(R.drawable.restarticon);
            scr = 0;
            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                index = r.nextInt(900);
                index /= 100;
                setButtonColors();
                count.setText("Count: "+j+"/20");
              //  color.setText(arrCol.indexOf(arrCol.get(index))+"");
                color.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(index))]));
                startGame(j+1);
            }
        }, 1000);
    }


    @Override
    public void onBackPressed(){
        alert.show();
    }
}
