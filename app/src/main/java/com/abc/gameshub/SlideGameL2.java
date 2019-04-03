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

public class SlideGameL2 extends AppCompatActivity implements View.OnClickListener {
    Button b21, b22, b23, b24, b25, b26, b27, b28, b29,b210,b211,b212,b213,b214,b215,b216, next2;
    ImageView congol2;
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    Vibrator vibel2;
    AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l2);
        b21 = (Button)findViewById(R.id.button1sgl2);
        b22 = (Button)findViewById(R.id.button2sgl2);
        b23 = (Button)findViewById(R.id.button3sgl2);
        b24 = (Button)findViewById(R.id.button4sgl2);
        b25 = (Button)findViewById(R.id.button5sgl2);
        b26 = (Button)findViewById(R.id.button6sgl2);
        b27 = (Button)findViewById(R.id.button7sgl2);
        b28 = (Button)findViewById(R.id.button8sgl2);
        b29 = (Button)findViewById(R.id.button9sgl2);
        b210 = (Button)findViewById(R.id.button10sgl2);
        b211 = (Button)findViewById(R.id.button11sgl2);
        b212 = (Button)findViewById(R.id.button12sgl2);
        b213 = (Button)findViewById(R.id.button13sgl2);
        b214 = (Button)findViewById(R.id.button14sgl2);
        b215 = (Button)findViewById(R.id.button15sgl2);
        b216 = (Button)findViewById(R.id.button16sgl2);
        next2 = (Button)findViewById(R.id.sgl2butnext);
        congol2 = (ImageView)findViewById(R.id.sgl2congo);
        vibel2 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        AlertDialog.Builder build = new AlertDialog.Builder(this);
        build.setTitle("Exit Application");
        build.setMessage("Do you want to exit application?");
        build.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        build.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        build.setCancelable(false);
        alert = build.create();

        arr2.add(0);     arr2.add(1);         arr2.add(2);
        arr2.add(3);     arr2.add(4);         arr2.add(5);
        arr2.add(6);     arr2.add(7);         arr2.add(8);
        arr2.add(9);     arr2.add(10);        arr2.add(11);
        arr2.add(12);    arr2.add(13);        arr2.add(14);
        arr2.add(15);

        shuffleNumbers();

        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b210.setOnClickListener(this);
        b211.setOnClickListener(this);
        b212.setOnClickListener(this);
        b213.setOnClickListener(this);
        b214.setOnClickListener(this);
        b215.setOnClickListener(this);
        b216.setOnClickListener(this);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SlideGameL2.this,SlideGameL3.class));
                finish();
            }
        });
    }

    public void shuffleNumbers(){
        int inversions , blankIndex;
        while(true){
            inversions = 0;
            blankIndex = 0;
            Collections.shuffle(arr2);
            for(int i=0;i<15;i++){
                if((blankIndex==0) && (arr2.get(i)==0 || arr2.get(15)==0)){
                    blankIndex = (i/4)+1;
                }
                for(int j= i+1;j<16;j++){
                    if(arr2.get(i)!=0 && arr2.get(j)!=0 && arr2.get(i)>arr2.get(j))
                        inversions++;
                }
            }
            if((inversions%2==0 && blankIndex%2==0) || (inversions%2!=0 && blankIndex%2!=0))
                break;
        }
        setImage();
    }
    public void setImage(){
        b21.setBackgroundResource(getId(arr2.get(0)));      b21.setText(arr2.get(0)+"");
        b22.setBackgroundResource(getId(arr2.get(1)));      b22.setText(arr2.get(1)+"");
        b23.setBackgroundResource(getId(arr2.get(2)));      b23.setText(arr2.get(2)+"");
        b24.setBackgroundResource(getId(arr2.get(3)));      b24.setText(arr2.get(3)+"");
        b25.setBackgroundResource(getId(arr2.get(4)));      b25.setText(arr2.get(4)+"");
        b26.setBackgroundResource(getId(arr2.get(5)));      b26.setText(arr2.get(5)+"");
        b27.setBackgroundResource(getId(arr2.get(6)));      b27.setText(arr2.get(6)+"");
        b28.setBackgroundResource(getId(arr2.get(7)));      b28.setText(arr2.get(7)+"");
        b29.setBackgroundResource(getId(arr2.get(8)));      b29.setText(arr2.get(8)+"");
        b210.setBackgroundResource(getId(arr2.get(9)));     b210.setText(arr2.get(9)+"");
        b211.setBackgroundResource(getId(arr2.get(10)));    b211.setText(arr2.get(10)+"");
        b212.setBackgroundResource(getId(arr2.get(11)));    b212.setText(arr2.get(11)+"");
        b213.setBackgroundResource(getId(arr2.get(12)));    b213.setText(arr2.get(12)+"");
        b214.setBackgroundResource(getId(arr2.get(13)));    b214.setText(arr2.get(13)+"");
        b215.setBackgroundResource(getId(arr2.get(14)));    b215.setText(arr2.get(14)+"");
        b216.setBackgroundResource(getId(arr2.get(15)));    b216.setText(arr2.get(15)+"");
    }

    public int getId(int num){
        switch(num){
            case 1: return R.drawable.a31;
            case 2: return R.drawable.a32;
            case 3: return R.drawable.a33;
            case 4: return R.drawable.a34;
            case 5: return R.drawable.a35;
            case 6: return R.drawable.a36;
            case 7: return R.drawable.a37;
            case 8: return R.drawable.a38;
            case 9: return R.drawable.a39;
            case 10: return R.drawable.a310;
            case 11: return R.drawable.a311;
            case 12: return R.drawable.a312;
            case 13: return R.drawable.a313;
            case 14: return R.drawable.a314;
            case 15: return R.drawable.a315;
            default: return R.drawable.a0;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1sgl2:
                if (b22.getText().toString().equals("0")) {
                    doSwap(b21, b22);
                } else if (b25.getText().toString().equals("0")) {
                    doSwap(b21, b25);
                } else {
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button2sgl2:
                if (b21.getText().toString().equals("0")) {
                    doSwap(b22, b21);
                } else if (b23.getText().toString().equals("0")) {
                    doSwap(b22, b23);
                } else if (b26.getText().toString().equals("0")) {
                    doSwap(b22, b26);
                } else {
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button3sgl2:
                if (b22.getText().toString().equals("0")) {
                    doSwap(b23, b22);
                } else if (b24.getText().toString().equals("0")) {
                    doSwap(b23, b24);
                } else if (b27.getText().toString().equals("0")) {
                    doSwap(b23, b27);
                } else {
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button4sgl2:
                if(b23.getText().toString().equals("0")){
                    doSwap(b24,b23);
                }
                else if(b28.getText().toString().equals("0")){
                    doSwap(b24,b28);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button5sgl2:
                if(b21.getText().toString().equals("0")){
                    doSwap(b25,b21);
                }
                else if(b26.getText().toString().equals("0")){
                    doSwap(b25,b26);
                }
                else if(b29.getText().toString().equals("0")){
                    doSwap(b25,b29);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button6sgl2:
                if(b22.getText().toString().equals("0")){
                    doSwap(b26,b22);
                }
                else if(b27.getText().toString().equals("0")){
                    doSwap(b26,b27);
                }
                else if(b210.getText().toString().equals("0")){
                    doSwap(b26,b210);
                }
                else if(b25.getText().toString().equals("0")){
                    doSwap(b26,b25);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button7sgl2:
                if(b23.getText().toString().equals("0")){
                    doSwap(b27,b23);
                }
                else if(b28.getText().toString().equals("0")){
                    doSwap(b27,b28);
                }
                else if(b26.getText().toString().equals("0")){
                    doSwap(b27,b26);
                }
                else if(b211.getText().toString().equals("0")){
                    doSwap(b27,b211);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button8sgl2:
                if(b24.getText().toString().equals("0")){
                    doSwap(b28,b24);
                }
                else if(b27.getText().toString().equals("0")){
                    doSwap(b28,b27);
                }
                else if(b212.getText().toString().equals("0")){
                    doSwap(b28,b212);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button9sgl2:
                if(b25.getText().toString().equals("0")){
                    doSwap(b29,b25);
                }
                else if(b210.getText().toString().equals("0")){
                    doSwap(b29,b210);
                }
                else if(b213.getText().toString().equals("0")){
                    doSwap(b29,b213);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button10sgl2:
                if(b26.getText().toString().equals("0")){
                    doSwap(b210,b26);
                }
                else if(b29.getText().toString().equals("0")){
                    doSwap(b210,b29);
                }
                else if(b211.getText().toString().equals("0")){
                    doSwap(b210,b211);
                }
                else if(b214.getText().toString().equals("0")){
                    doSwap(b210,b214);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button11sgl2:
                if(b27.getText().toString().equals("0")){
                    doSwap(b211,b27);
                }
                else if(b212.getText().toString().equals("0")){
                    doSwap(b211,b212);
                }
                else if(b210.getText().toString().equals("0")){
                    doSwap(b211,b210);
                }
                else if(b215.getText().toString().equals("0")){
                    doSwap(b211,b215);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button12sgl2:
                if(b28.getText().toString().equals("0")){
                    doSwap(b212,b28);
                }
                else if(b211.getText().toString().equals("0")){
                    doSwap(b212,b211);
                }
                else if(b216.getText().toString().equals("0")){
                    doSwap(b212,b216);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button13sgl2:
                if(b29.getText().toString().equals("0")){
                    doSwap(b213,b29);
                }
                else if(b214.getText().toString().equals("0")){
                    doSwap(b213,b214);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button14sgl2:
                if(b210.getText().toString().equals("0")){
                    doSwap(b214,b210);
                }
                else if(b213.getText().toString().equals("0")){
                    doSwap(b214,b213);
                }
                else if(b215.getText().toString().equals("0")){
                    doSwap(b214,b215);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button15sgl2:
                if(b211.getText().toString().equals("0")){
                    doSwap(b215,b211);
                }
                else if(b214.getText().toString().equals("0")){
                    doSwap(b215,b214);
                }
                else if(b216.getText().toString().equals("0")){
                    doSwap(b215,b216);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
            case R.id.button16sgl2:
                if(b212.getText().toString().equals("0")){
                    doSwap(b216,b212);
                }
                else if(b215.getText().toString().equals("0")){
                    doSwap(b216,b215);
                }
                else{
                    vibel2.vibrate(200);
                }
                break;
        }
        if (b21.getText().toString().equals("1")
                && b22.getText().toString().equals("2")
                && b23.getText().toString().equals("3")
                && b24.getText().toString().equals("4")
                && b25.getText().toString().equals("5")
                && b26.getText().toString().equals("6")
                && b27.getText().toString().equals("7")
                && b28.getText().toString().equals("8")
                && b29.getText().toString().equals("9")
                && b210.getText().toString().equals("10")
                && b211.getText().toString().equals("11")
                && b212.getText().toString().equals("12")
                && b213.getText().toString().equals("13")
                && b214.getText().toString().equals("14")
                && b215.getText().toString().equals("15")){
            congol2.setVisibility(View.VISIBLE);
            next2.setVisibility(View.VISIBLE);
            next2.setText("PROCEED TO NEXT LEVEL");
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