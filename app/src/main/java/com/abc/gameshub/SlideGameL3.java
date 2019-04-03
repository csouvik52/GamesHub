package com.abc.gameshub;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class SlideGameL3 extends AppCompatActivity implements View.OnClickListener {
    Button b31, b32, b33, b34, b35, b36, b37, b38, b39,b310,b311,b312,b313,b314,b315,b316,b317,b318,b319,b320,b321,b322,b323,b324,b325, finish;
    ImageView congol3;
    ArrayList<Integer> arr3 = new ArrayList<Integer>();
    Vibrator vibel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l3);
        b31 = (Button)findViewById(R.id.button1sgl3);
        b32 = (Button)findViewById(R.id.button2sgl3);
        b33 = (Button)findViewById(R.id.button3sgl3);
        b34 = (Button)findViewById(R.id.button4sgl3);
        b35 = (Button)findViewById(R.id.button5sgl3);
        b36 = (Button)findViewById(R.id.button6sgl3);
        b37 = (Button)findViewById(R.id.button7sgl3);
        b38 = (Button)findViewById(R.id.button8sgl3);
        b39 = (Button)findViewById(R.id.button9sgl3);
        b310 = (Button)findViewById(R.id.button10sgl3);
        b311 = (Button)findViewById(R.id.button11sgl3);
        b312 = (Button)findViewById(R.id.button12sgl3);
        b313 = (Button)findViewById(R.id.button13sgl3);
        b314 = (Button)findViewById(R.id.button14sgl3);
        b315 = (Button)findViewById(R.id.button15sgl3);
        b316 = (Button)findViewById(R.id.button16sgl3);
        b317 = (Button)findViewById(R.id.button17sgl3);
        b318 = (Button)findViewById(R.id.button18sgl3);
        b319 = (Button)findViewById(R.id.button19sgl3);
        b320 = (Button)findViewById(R.id.button20sgl3);
        b321 = (Button)findViewById(R.id.button21sgl3);
        b322 = (Button)findViewById(R.id.button22sgl3);
        b323 = (Button)findViewById(R.id.button23sgl3);
        b324 = (Button)findViewById(R.id.button24sgl3);
        b325 = (Button)findViewById(R.id.button25sgl3);
        // finish = (Button)findViewById(R.id.sgl1butnext);
        congol3 = (ImageView)findViewById(R.id.sgl3congo);
        vibel3 = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        arr3.add(0);     arr3.add(1);         arr3.add(2);
        arr3.add(3);     arr3.add(4);         arr3.add(5);
        arr3.add(6);     arr3.add(7);         arr3.add(8);
        arr3.add(9);     arr3.add(10);        arr3.add(11);
        arr3.add(12);    arr3.add(13);        arr3.add(14);
        arr3.add(15);    arr3.add(16);        arr3.add(17);
        arr3.add(18);    arr3.add(19);        arr3.add(20);
        arr3.add(21);    arr3.add(22);        arr3.add(23);
        arr3.add(24);

        shuffleNumbers();

        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b310.setOnClickListener(this);
        b311.setOnClickListener(this);
        b312.setOnClickListener(this);
        b313.setOnClickListener(this);
        b314.setOnClickListener(this);
        b315.setOnClickListener(this);
        b316.setOnClickListener(this);
        b317.setOnClickListener(this);
        b318.setOnClickListener(this);
        b319.setOnClickListener(this);
        b320.setOnClickListener(this);
        b321.setOnClickListener(this);
        b322.setOnClickListener(this);
        b323.setOnClickListener(this);
        b324.setOnClickListener(this);
        b325.setOnClickListener(this);

        //  finish.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View view) {
        //startActivity(new Intent(SlideGameL1.this,SlideGameL2.class));
        //         finish();
        //      }
        // });
    }

    public void shuffleNumbers(){
        int inversions;
        while(true){
            inversions = 0;
            Collections.shuffle(arr3);
            for(int i=0;i<24;i++){
                for(int j= i+1;j<25;j++){
                    if(arr3.get(i)!=0 && arr3.get(j)!=0 && arr3.get(i)>arr3.get(j))
                        inversions++;
                }
            }
            if(inversions%2==0)
                break;
        }

        setImage();
    }
    public void setImage(){
        b31.setBackgroundResource(getId(arr3.get(0)));      b31.setText(arr3.get(0)+"");
        b32.setBackgroundResource(getId(arr3.get(1)));      b32.setText(arr3.get(1)+"");
        b33.setBackgroundResource(getId(arr3.get(2)));      b33.setText(arr3.get(2)+"");
        b34.setBackgroundResource(getId(arr3.get(3)));      b34.setText(arr3.get(3)+"");
        b35.setBackgroundResource(getId(arr3.get(4)));      b35.setText(arr3.get(4)+"");
        b36.setBackgroundResource(getId(arr3.get(5)));      b36.setText(arr3.get(5)+"");
        b37.setBackgroundResource(getId(arr3.get(6)));      b37.setText(arr3.get(6)+"");
        b38.setBackgroundResource(getId(arr3.get(7)));      b38.setText(arr3.get(7)+"");
        b39.setBackgroundResource(getId(arr3.get(8)));      b39.setText(arr3.get(8)+"");
        b310.setBackgroundResource(getId(arr3.get(9)));     b310.setText(arr3.get(9)+"");
        b311.setBackgroundResource(getId(arr3.get(10)));    b311.setText(arr3.get(10)+"");
        b312.setBackgroundResource(getId(arr3.get(11)));    b312.setText(arr3.get(11)+"");
        b313.setBackgroundResource(getId(arr3.get(12)));    b313.setText(arr3.get(12)+"");
        b314.setBackgroundResource(getId(arr3.get(13)));    b314.setText(arr3.get(13)+"");
        b315.setBackgroundResource(getId(arr3.get(14)));    b315.setText(arr3.get(14)+"");
        b316.setBackgroundResource(getId(arr3.get(15)));    b316.setText(arr3.get(15)+"");
        b317.setBackgroundResource(getId(arr3.get(16)));    b317.setText(arr3.get(16)+"");
        b318.setBackgroundResource(getId(arr3.get(17)));    b318.setText(arr3.get(17)+"");
        b319.setBackgroundResource(getId(arr3.get(18)));    b319.setText(arr3.get(18)+"");
        b320.setBackgroundResource(getId(arr3.get(19)));    b320.setText(arr3.get(19)+"");
        b321.setBackgroundResource(getId(arr3.get(20)));    b321.setText(arr3.get(20)+"");
        b322.setBackgroundResource(getId(arr3.get(21)));    b322.setText(arr3.get(21)+"");
        b323.setBackgroundResource(getId(arr3.get(22)));    b323.setText(arr3.get(22)+"");
        b324.setBackgroundResource(getId(arr3.get(23)));    b324.setText(arr3.get(23)+"");
        b325.setBackgroundResource(getId(arr3.get(24)));    b325.setText(arr3.get(24)+"");
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
            case 16: return R.drawable.a316;
            case 17: return R.drawable.a317;
            case 18: return R.drawable.a318;
            case 19: return R.drawable.a319;
            case 20: return R.drawable.a320;
            case 21: return R.drawable.a321;
            case 22: return R.drawable.a322;
            case 23: return R.drawable.a323;
            case 24: return R.drawable.a324;
            default: return R.drawable.a0;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1sgl3:
                if (b32.getText().toString().equals("0")) {
                    doSwap(b31, b32);
                } else if (b36.getText().toString().equals("0")) {
                    doSwap(b31, b36);
                } else {
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button2sgl3:
                if (b31.getText().toString().equals("0")) {
                    doSwap(b32, b31);
                } else if (b33.getText().toString().equals("0")) {
                    doSwap(b32, b33);
                } else if (b37.getText().toString().equals("0")) {
                    doSwap(b32, b37);
                } else {
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button3sgl3:
                if (b32.getText().toString().equals("0")) {
                    doSwap(b33, b32);
                } else if (b34.getText().toString().equals("0")) {
                    doSwap(b33, b34);
                } else if (b38.getText().toString().equals("0")) {
                    doSwap(b33, b38);
                } else {
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button4sgl3:
                if(b33.getText().toString().equals("0")){
                    doSwap(b34,b33);
                }
                else if(b35.getText().toString().equals("0")){
                    doSwap(b34,b35);
                }
                else if(b39.getText().toString().equals("0")){
                    doSwap(b34,b39);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button5sgl3:
                if(b34.getText().toString().equals("0")){
                    doSwap(b35,b34);
                }
                else if(b310.getText().toString().equals("0")){
                    doSwap(b35,b310);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button6sgl3:
                if(b31.getText().toString().equals("0")){
                    doSwap(b36,b31);
                }
                else if(b37.getText().toString().equals("0")){
                    doSwap(b36,b37);
                }
                else if(b311.getText().toString().equals("0")){
                    doSwap(b36,b311);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button7sgl3:
                if(b32.getText().toString().equals("0")){
                    doSwap(b37,b32);
                }
                else if(b38.getText().toString().equals("0")){
                    doSwap(b37,b38);
                }
                else if(b36.getText().toString().equals("0")){
                    doSwap(b37,b36);
                }
                else if(b312.getText().toString().equals("0")){
                    doSwap(b37,b312);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button8sgl3:
                if(b33.getText().toString().equals("0")){
                    doSwap(b38,b33);
                }
                else if(b37.getText().toString().equals("0")){
                    doSwap(b38,b37);
                }
                else if(b39.getText().toString().equals("0")){
                    doSwap(b38,b39);
                }
                else if(b313.getText().toString().equals("0")){
                    doSwap(b38,b313);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button9sgl3:
                if(b34.getText().toString().equals("0")){
                    doSwap(b39,b34);
                }
                else if(b38.getText().toString().equals("0")){
                    doSwap(b39,b38);
                }
                else if(b310.getText().toString().equals("0")){
                    doSwap(b39,b310);
                }else if(b314.getText().toString().equals("0")){
                    doSwap(b39,b314);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button10sgl3:
                if(b35.getText().toString().equals("0")){
                    doSwap(b310,b35);
                }
                else if(b39.getText().toString().equals("0")){
                    doSwap(b310,b39);
                }
                else if(b315.getText().toString().equals("0")){
                    doSwap(b310,b315);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button11sgl3:
                if(b36.getText().toString().equals("0")){
                    doSwap(b311,b36);
                }
                else if(b312.getText().toString().equals("0")){
                    doSwap(b311,b312);
                }
                else if(b316.getText().toString().equals("0")){
                    doSwap(b311,b316);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button12sgl3:
                if(b37.getText().toString().equals("0")){
                    doSwap(b312,b37);
                }
                else if(b311.getText().toString().equals("0")){
                    doSwap(b312,b311);
                }
                else if(b313.getText().toString().equals("0")){
                    doSwap(b312,b313);
                }
                else if(b317.getText().toString().equals("0")){
                    doSwap(b312,b317);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button13sgl3:
                if(b38.getText().toString().equals("0")){
                    doSwap(b313,b38);
                }
                else if(b312.getText().toString().equals("0")){
                    doSwap(b313,b312);
                }
                else if(b314.getText().toString().equals("0")){
                    doSwap(b313,b318);
                }
                else if(b314.getText().toString().equals("0")){
                    doSwap(b313,b314);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button14sgl3:
                if(b39.getText().toString().equals("0")){
                    doSwap(b314,b39);
                }
                else if(b313.getText().toString().equals("0")){
                    doSwap(b314,b313);
                }
                else if(b315.getText().toString().equals("0")){
                    doSwap(b314,b315);
                }
                else if(b319.getText().toString().equals("0")){
                    doSwap(b314,b319);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button15sgl3:
                if(b310.getText().toString().equals("0")){
                    doSwap(b315,b310);
                }
                else if(b314.getText().toString().equals("0")){
                    doSwap(b315,b314);
                }
                else if(b320.getText().toString().equals("0")){
                    doSwap(b315,b320);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button16sgl3:
                if(b311.getText().toString().equals("0")){
                    doSwap(b316,b311);
                }
                else if(b317.getText().toString().equals("0")){
                    doSwap(b316,b317);
                }
                else if(b321.getText().toString().equals("0")){
                    doSwap(b316,b321);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button17sgl3:
                if(b312.getText().toString().equals("0")){
                    doSwap(b317,b312);
                }
                else if(b316.getText().toString().equals("0")){
                    doSwap(b317,b316);
                }
                else if(b318.getText().toString().equals("0")){
                    doSwap(b317,b318);
                }
                else if(b322.getText().toString().equals("0")){
                    doSwap(b317,b322);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button18sgl3:
                if(b313.getText().toString().equals("0")){
                    doSwap(b318,b313);
                }
                else if(b317.getText().toString().equals("0")){
                    doSwap(b318,b317);
                }
                else if(b319.getText().toString().equals("0")){
                    doSwap(b318,b319);
                }
                else if(b323.getText().toString().equals("0")){
                    doSwap(b318,b323);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button19sgl3:
                if(b314.getText().toString().equals("0")){
                    doSwap(b319,b314);
                }
                else if(b318.getText().toString().equals("0")){
                    doSwap(b319,b318);
                }
                else if(b320.getText().toString().equals("0")){
                    doSwap(b319,b320);
                }
                else if(b324.getText().toString().equals("0")){
                    doSwap(b319,b324);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button20sgl3:
                if(b315.getText().toString().equals("0")){
                    doSwap(b320,b315);
                }
                else if(b319.getText().toString().equals("0")){
                    doSwap(b320,b319);
                }
                else if(b325.getText().toString().equals("0")){
                    doSwap(b320,b325);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button21sgl3:
                if(b316.getText().toString().equals("0")){
                    doSwap(b321,b316);
                }
                else if(b322.getText().toString().equals("0")){
                    doSwap(b321,b322);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button22sgl3:
                if(b317.getText().toString().equals("0")){
                    doSwap(b322,b317);
                }
                else if(b321.getText().toString().equals("0")){
                    doSwap(b322,b321);
                }
                else if(b323.getText().toString().equals("0")){
                    doSwap(b322,b323);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button23sgl3:
                if(b318.getText().toString().equals("0")){
                    doSwap(b323,b318);
                }
                else if(b322.getText().toString().equals("0")){
                    doSwap(b323,b322);
                }
                else if(b324.getText().toString().equals("0")){
                    doSwap(b323,b324);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button24sgl3:
                if(b319.getText().toString().equals("0")){
                    doSwap(b324,b319);
                }
                else if(b323.getText().toString().equals("0")){
                    doSwap(b324,b323);
                }
                else if(b325.getText().toString().equals("0")){
                    doSwap(b324,b325);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
            case R.id.button25sgl3:
                if(b320.getText().toString().equals("0")){
                    doSwap(b325,b320);
                }
                else if(b324.getText().toString().equals("0")){
                    doSwap(b325,b324);
                }
                else{
                    vibel3.vibrate(200);
                }
                break;
        }
        if (b31.getText().toString().equals("1")
                && b32.getText().toString().equals("2")
                && b33.getText().toString().equals("3")
                && b34.getText().toString().equals("4")
                && b35.getText().toString().equals("5")
                && b36.getText().toString().equals("6")
                && b37.getText().toString().equals("7")
                && b38.getText().toString().equals("8")
                && b39.getText().toString().equals("9")
                && b310.getText().toString().equals("10")
                && b311.getText().toString().equals("11")
                && b312.getText().toString().equals("12")
                && b313.getText().toString().equals("13")
                && b314.getText().toString().equals("14")
                && b315.getText().toString().equals("15")
                && b317.getText().toString().equals("16")
                && b318.getText().toString().equals("17")
                && b319.getText().toString().equals("18")
                && b320.getText().toString().equals("19")
                && b321.getText().toString().equals("20")
                && b322.getText().toString().equals("21")
                && b323.getText().toString().equals("22")
                && b324.getText().toString().equals("23")
                && b324.getText().toString().equals("24")){
            congol3.setVisibility(View.VISIBLE);
            //next.setVisibility(View.VISIBLE);
        }
    }

    public void doSwap(Button from,Button to){
        to.setText(from.getText());
        from.setText("0");
        to.setBackgroundResource(getId(Integer.parseInt(to.getText().toString())));
        from.setBackgroundResource(getId(0));
    }
}