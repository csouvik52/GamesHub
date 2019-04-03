package com.abc.gameshub;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Arena extends AppCompatActivity {
    ImageView music;
    int storedPreference;
    AlertDialog alert;
    SharedPreferences preferences;
    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arena);

        music = (ImageView)findViewById(R.id.music);
        /* Getting app music settings icon **/
        preferences = PreferenceManager.getDefaultSharedPreferences(Arena.this);
        /*End Getting app music settings icon**/

    }

    public void settings(View v){

    }
    public void music(View v){
        storedPreference = preferences.getInt("storedInt",0);
        changeMusicIcon();
    }
    public void changeMusicIcon(){
        if(storedPreference==-1){
            startService(new Intent(Arena.this,MyService.class));
            music.setImageResource(R.drawable.unmute);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("storedInt", 0); // value to store
            editor.commit();
            Toast.makeText(getApplicationContext(),"Music Started...",Toast.LENGTH_SHORT).show();

        }
        else{
            stopService(new Intent(Arena.this,MyService.class));
            music.setImageResource(R.drawable.mutee);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("storedInt", -1); // value to store
            editor.commit();
            Toast.makeText(getApplicationContext(),"Music Stopped...",Toast.LENGTH_SHORT).show();
        }
    }
    public void colorgame(View v){
        startActivity(new Intent(Arena.this,ColourGameL1.class));
    }
    public void slidegame(View v){
        startActivity(new Intent(Arena.this,SlideGameL1.class));
    }
    public void spinthebottle(View v){
        startActivity(new Intent(Arena.this,SpinTheBottle.class));
    }
    public void crosswords(View v){
        startActivity(new Intent(Arena.this,CrossWordsL1.class));
    }
    public void tictactoe(View v){
        startActivity(new Intent(Arena.this,TicTacToe.class));
    }
    public void quiz(View v){
        startActivity(new Intent(Arena.this,QuizL1.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(new Intent(Arena.this,MyService.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        storedPreference = preferences.getInt("storedInt",0);
        if(storedPreference==-1) {
            stopService(new Intent(Arena.this,MyService.class));
            music.setImageResource(R.drawable.mutee);
        }
        else {
            startService(new Intent(Arena.this,MyService.class));
            music.setImageResource(R.drawable.unmute);
        }
    }
    @Override
    public void onBackPressed(){
        if(backPressedTime+2000> System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else {
            backToast=Toast.makeText(getApplicationContext(),"Press again to close GamesHub",Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime= System.currentTimeMillis();
    }

}
