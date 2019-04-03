package com.abc.gameshub;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QuizL1 extends AppCompatActivity {
    AlertDialog alert;
    ProgressBar progressBar;
    TextView time,qno,points,question;
    ImageView start,rule;
    CountDownTimer cdt;
    Button op1,op2,op3,op4;
    InputStream inps;
    BufferedReader bfr;
    int noq = 25,count = 1;
    int totPoints = 0;
    int pointArr[] = new int[noq];
    String values[];
    Toast t;
    Drawable yellow,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_l1);

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




        progressBar = (ProgressBar)findViewById(R.id.progressBarCircle);
        time = (TextView)findViewById(R.id.textViewTime);
        question = (TextView)findViewById(R.id.quiz);
        points = (TextView)findViewById(R.id.quiztvpoint);
        qno = (TextView)findViewById(R.id.quiztvqno);
        op1 = (Button)findViewById(R.id.quizop1);
        op2 = (Button)findViewById(R.id.quizop2);
        op3 = (Button)findViewById(R.id.quizop3);
        op4 = (Button)findViewById(R.id.quizop4);
        start = (ImageView)findViewById(R.id.quizstart);
        rule = (ImageView)findViewById(R.id.quizrule);
        yellow = getDrawable(R.drawable.timerstyle);
        red = getDrawable(R.drawable.timerstylered);
        pointArr[0] = 500;
        for(int i=1;i<noq;i++)
            pointArr[i] = pointArr[i-1]*2;

        inps = getResources().openRawResource(R.raw.quizquestion);
        bfr = new BufferedReader(new InputStreamReader(inps));

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rule.setVisibility(View.INVISIBLE);
                start.setVisibility(View.INVISIBLE);
                playGame(count);
            }
        });
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().toString().equals(values[6])){
                    totPoints += pointArr[count-1];
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op2.getText().toString().equals(values[6])){
                    totPoints += pointArr[count-1];
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op3.getText().toString().equals(values[6])){
                    totPoints += pointArr[count-1];
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op4.getText().toString().equals(values[6])){
                    totPoints += pointArr[count-1];
                    points.setText("Points: "+totPoints);
                }else{
                    t = Toast.makeText(QuizL1.this, "Wrong Answer", Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    t.show();
                }
                cdt.onFinish();
            }
        });

    }

    public void playGame(int count){
        try {
            String line = bfr.readLine();
            values = line.split(",");
            question.setText(values[1]);
            qno.setText("Qno: "+count);
            op1.setText(values[2]);
            op2.setText(values[3]);
            op3.setText(values[4]);
            op4.setText(values[5]);
            countdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void countdown(){
        progressBar.setProgressDrawable(yellow);
        time.setTextColor(Color.parseColor("#F5FA55"));
        cdt = new CountDownTimer(10500,1000) {
            @Override
            public void onTick(long remainingTime) {
                if(remainingTime<5000){
                    progressBar.setProgressDrawable(red);
                    time.setTextColor(Color.parseColor("#ff0000"));
                }
                time.setText(remainingTime/1000+"");
                progressBar.setProgress((int)remainingTime/1000);
            }

            @Override
            public void onFinish() {
                cdt.cancel();
                ++count;
                if(count<=noq)
                    playGame(count);
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Finish", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    t.show();
                    finish();
                }

            }
        }.start();
    }
    @Override
    public void onBackPressed(){
        alert.show();
    }
}
