package com.abc.gameshub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CrossWordsL1 extends AppCompatActivity {

    TextView count,score,lastscore;
    EditText bit1,bit2,bit3,bit4,bit5,bit6;
    Button submit;
    ImageView start,nextl1;
    LinearLayout l1;
    AlertDialog alert;
    String arr[] = {"zigzag","friend","garden","mumbai","rhythm","search","kerala","rabbit","mobile","school"};
    char a[] = new char[6];
    int coun = 1, point = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_words_l1);

        count = (TextView)findViewById(R.id.cw1tvcount);
        score = (TextView)findViewById(R.id.cw1tvscore);
        lastscore = (TextView)findViewById(R.id.cw1tvlastscore);
        bit1 = (EditText)findViewById(R.id.cw1bit1);
        bit2 = (EditText)findViewById(R.id.cw1bit2);
        bit3 = (EditText)findViewById(R.id.cw1bit3);
        bit4 = (EditText)findViewById(R.id.cw1bit4);
        bit5 = (EditText)findViewById(R.id.cw1bit5);
        bit6 = (EditText)findViewById(R.id.cw1bit6);
        submit = (Button)findViewById(R.id.cw1but);
        start = (ImageView)findViewById(R.id.cw1imgstart);
        nextl1 = (ImageView)findViewById(R.id.cwnextlevell1);
        l1 = (LinearLayout)findViewById(R.id.cw1ll1);

        l1.setVisibility(View.INVISIBLE);
        lastscore.setVisibility(View.INVISIBLE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bit1.getText().toString().equals(Character.toString(a[0])) && bit2.getText().toString().equals(Character.toString(a[1])) && bit6.getText().toString().equals(Character.toString(a[5]))){
                    point++;
                    score.setText("Score: "+point);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
                }
                if(bit1.getText().toString().equals("") || bit2.getText().toString().equals("") || bit6.getText().toString().equals("")){

                    if (coun <= 10) {
                        bit1.setText("");
                        bit2.setText("");
                        bit6.setText("");
                        startgame(coun);
                    } else {
                        lastscore.setText("Score: "+point);
                        coun = 1;
                        point = 0;
                        count.setText("Count: ");
                        score.setText("Score: ");
                        bit1.setText("");
                        bit2.setText("");
                        bit6.setText("");
                        l1.setVisibility(View.INVISIBLE);
                        start.setImageResource(R.drawable.restarticon);
                        start.setVisibility(View.VISIBLE);
                        lastscore.setVisibility(View.VISIBLE);
                    }

                }
                else {
                    if (coun <= 10) {
                        bit1.setText("");
                        bit2.setText("");
                        bit6.setText("");
                        startgame(coun);
                    } else {
                        lastscore.setText("Score: "+point);
                        coun = 1;
                        point = 0;
                        count.setText("Count: ");
                        score.setText("Score: ");
                        bit1.setText("");
                        bit2.setText("");
                        bit6.setText("");
                        l1.setVisibility(View.INVISIBLE);
                        start.setImageResource(R.drawable.restarticon);
                        start.setVisibility(View.VISIBLE);
                        lastscore.setVisibility(View.VISIBLE);
                        nextl1.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.VISIBLE);
                start.setVisibility(View.INVISIBLE);
                lastscore.setVisibility(View.INVISIBLE);
                score.setText("Score: 0");
                startgame(coun);
                bit3.setEnabled(false);
                bit4.setEnabled(false);
                bit5.setEnabled(false);
            }
        });

        nextl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(CrossWordsL1.this,CrossWordsL2.class);
                startActivity(in);
                finish();
            }
        });

        AlertDialog.Builder build = new AlertDialog.Builder(this);
        build.setTitle("Exit Application");
        build.setMessage("Do you wamt to exit?");
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
    }

    public void startgame(int n){
        switch (n){

            case 1: a = arr[0].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 2: a = arr[1].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 3: a = arr[2].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 4: a = arr[3].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 5: a = arr[4].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 6: a = arr[5].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 7: a = arr[6].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 8: a = arr[7].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 9: a = arr[8].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;
            case 10: a = arr[9].toCharArray();
                bit3.setText(a[2]+"");
                bit4.setText(a[3]+"");
                bit5.setText(a[4]+"");
                count.setText("Count: "+coun);
                coun++;
                break;

        }
    }

    @Override
    public void onBackPressed() {
        alert.show();
    }
}