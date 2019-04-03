package com.abc.gameshub;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class SlideGameL1 extends AppCompatActivity implements View.OnClickListener {
    AlertDialog alert;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, next;
    ImageView congo;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Vibrator vibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l1);


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




        b1 = (Button)findViewById(R.id.sgL1button1);
        b2 = (Button)findViewById(R.id.sgL1button2);
        b3 = (Button)findViewById(R.id.sgL1button3);
        b4 = (Button)findViewById(R.id.sgL1button4);
        b5 = (Button)findViewById(R.id.sgL1button5);
        b6 = (Button)findViewById(R.id.sgL1button6);
        b7 = (Button)findViewById(R.id.sgL1button7);
        b8 = (Button)findViewById(R.id.sgL1button8);
        b9 = (Button)findViewById(R.id.sgL1button9);
        next = (Button)findViewById(R.id.sgl1butnext);
        congo = (ImageView)findViewById(R.id.sgl1congo);
        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        arr.add(0);     arr.add(1);         arr.add(2);
        arr.add(3);     arr.add(4);         arr.add(5);
        arr.add(6);     arr.add(7);         arr.add(8);

        shuffleNumbers();

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SlideGameL1.this,SlideGameL2.class));
                finish();
            }
        });
    }

    public void shuffleNumbers(){
        int inversions;
        while(true){
            inversions = 0;
            Collections.shuffle(arr);
            for(int i=0;i<8;i++){
                for(int j= i+1;j<9;j++){
                    if(arr.get(i)!=0 && arr.get(j)!=0 && arr.get(i)>arr.get(j))
                        inversions++;
                }
            }
            if(inversions%2==0)
                break;
        }

        setImage();
    }
    public void setImage(){
        b1.setBackgroundResource(getId(arr.get(0)));    b1.setText(arr.get(0)+"");
        b2.setBackgroundResource(getId(arr.get(1)));    b2.setText(arr.get(1)+"");
        b3.setBackgroundResource(getId(arr.get(2)));    b3.setText(arr.get(2)+"");
        b4.setBackgroundResource(getId(arr.get(3)));    b4.setText(arr.get(3)+"");
        b5.setBackgroundResource(getId(arr.get(4)));    b5.setText(arr.get(4)+"");
        b6.setBackgroundResource(getId(arr.get(5)));    b6.setText(arr.get(5)+"");
        b7.setBackgroundResource(getId(arr.get(6)));    b7.setText(arr.get(6)+"");
        b8.setBackgroundResource(getId(arr.get(7)));    b8.setText(arr.get(7)+"");
        b9.setBackgroundResource(getId(arr.get(8)));    b9.setText(arr.get(8)+"");
    }

    public int getId(int num){
        switch(num){
            case 1: return R.drawable.a1;
            case 2: return R.drawable.a2;
            case 3: return R.drawable.a3;
            case 4: return R.drawable.a4;
            case 5: return R.drawable.a5;
            case 6: return R.drawable.a6;
            case 7: return R.drawable.a7;
            case 8: return R.drawable.a8;
            default: return R.drawable.a0;
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.sgL1button1:
                if(b2.getText().toString().equals("0")){
                    doSwap(b1,b2);
                }
                else if(b4.getText().toString().equals("0")){
                    doSwap(b1,b4);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button2:
                if(b1.getText().toString().equals("0")){
                    doSwap(b2,b1);
                }
                else if(b3.getText().toString().equals("0")){
                    doSwap(b2,b3);
                }
                else if(b5.getText().toString().equals("0")){
                    doSwap(b2,b5);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button3:
                if(b2.getText().toString().equals("0")){
                    doSwap(b3,b2);
                }
                else if(b6.getText().toString().equals("0")){
                    doSwap(b3,b6);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button4:
                if(b1.getText().toString().equals("0")){
                    doSwap(b4,b1);
                }
                else if(b5.getText().toString().equals("0")){
                    doSwap(b4,b5);
                }
                else if(b7.getText().toString().equals("0")){
                    doSwap(b4,b7);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button5:
                if(b2.getText().toString().equals("0")){
                    doSwap(b5,b2);
                }
                else if(b4.getText().toString().equals("0")){
                    doSwap(b5,b4);
                }
                else if(b6.getText().toString().equals("0")){
                    doSwap(b5,b6);
                }
                else if(b8.getText().toString().equals("0")){
                    doSwap(b5,b8);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button6:
                if(b3.getText().toString().equals("0")){
                    doSwap(b6,b3);
                }
                else if(b5.getText().toString().equals("0")){
                    doSwap(b6,b5);
                }
                else if(b9.getText().toString().equals("0")){
                    doSwap(b6,b9);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button7:
                if(b4.getText().toString().equals("0")){
                    doSwap(b7,b4);
                }
                else if(b8.getText().toString().equals("0")){
                    doSwap(b7,b8);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button8:
                if(b5.getText().toString().equals("0")){
                    doSwap(b8,b5);
                }
                else if(b7.getText().toString().equals("0")){
                    doSwap(b8,b7);
                }
                else if(b9.getText().toString().equals("0")){
                    doSwap(b8,b9);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
            case R.id.sgL1button9:
                if(b6.getText().toString().equals("0")){
                    doSwap(b9,b6);
                }
                else if(b8.getText().toString().equals("0")){
                    doSwap(b9,b8);
                }
                else{
                    vibe.vibrate(200);
                }
                break;
        }
        if(b1.getText().toString().equals("1") && b2.getText().toString().equals("2") && b3.getText().toString().equals("3")
                && b4.getText().toString().equals("4") && b5.getText().toString().equals("5") && b6.getText().toString().equals("6")
                && b7.getText().toString().equals("7") && b8.getText().toString().equals("8")){
            congo.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }

    public void doSwap(Button from,Button to){
        to.setText(from.getText());
        from.setText("0");
        to.setBackgroundResource(getId(Integer.parseInt(to.getText().toString())));
        from.setBackgroundResource(getId(0));
    }

    @Override
    public void onBackPressed(){
        alert.show();
    }
}