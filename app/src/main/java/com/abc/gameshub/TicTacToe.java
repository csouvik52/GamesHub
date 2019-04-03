package com.abc.gameshub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,home;
    ImageView congo;
    int arr[][] = new int[3][3];
    int player = 1;
    boolean status;
    AlertDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        b1 = (Button)findViewById(R.id.ticb1);
        b2 = (Button)findViewById(R.id.ticb2);
        b3 = (Button)findViewById(R.id.ticb3);
        b4 = (Button)findViewById(R.id.ticb4);
        b5 = (Button)findViewById(R.id.ticb5);
        b6 = (Button)findViewById(R.id.ticb6);
        b7 = (Button)findViewById(R.id.ticb7);
        b8 = (Button)findViewById(R.id.ticb8);
        b9 = (Button)findViewById(R.id.ticb9);
        congo = (ImageView)findViewById(R.id.congotictac);
       // home = (Button)findViewById(R.id.hometictac);


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


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }
    public boolean checkRowWin(int player){
        for(int i=0;i<3;i++){
            if(arr[i][0]==player && arr[i][1]==player && arr[i][2]==player)
                return true;
        }
        return false;
    }
    public boolean checkColWin(int player){
        for(int i=0;i<3;i++){
            if(arr[0][i]==player && arr[1][i]==player && arr[2][i]==player)
                return true;
        }
        return false;
    }
    public boolean checkDiagonalWin(int player){
        if(arr[0][0]==player && arr[1][1]==player && arr[2][2]==player)
            return true;
        else if(arr[2][0]==player && arr[1][1]==player && arr[0][2]==player)
            return true;

        return false;
    }



    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ticb1:
                status = doMove(0,0,player,b1);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb2:
                status = doMove(0,1,player,b2);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb3:
                status = doMove(0,2,player,b3);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb4:
                status = doMove(1,0,player,b4);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb5:
                status = doMove(1,1,player,b5);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb6:
                status = doMove(1,2,player,b6);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb7:
                status = doMove(2,0,player,b7);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb8:
                status = doMove(2,1,player,b8);
                if(status)
                    player = player==1?2:1;
                break;
            case R.id.ticb9:
                status = doMove(2,2,player,b9);
                if(status)
                    player = player==1?2:1;
                break;
        }

    }
    public boolean doMove(int i,int j,int player,Button b){
        if(arr[i][j]==0){
            arr[i][j] = player;
            if(player==1)
                b.setBackgroundResource(R.drawable.ticx);
            else
                b.setBackgroundResource(R.drawable.tico);

            if(checkRowWin(player) || checkColWin(player) || checkDiagonalWin(player)){
                Toast.makeText(this, "Player: "+player+" Wins...", Toast.LENGTH_LONG).show();
                congo.setVisibility(View.VISIBLE);

            }
            return true;
        }
        return false;
    }

    @Override
    public void onBackPressed(){
        alert.show();
    }
}