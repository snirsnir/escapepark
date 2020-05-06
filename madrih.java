package com.example.cabeloni.epcomp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.cabeloni.epcomp.startv2.musicFlg;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import static com.example.cabeloni.epcomp.groups.flag;

public class madrih extends AppCompatActivity {
    private static final int TIME_LIMIT = 1500;
    public static int adminflag= 0;
    private static long backPressed;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrih);
        final ImageView code = (ImageView) findViewById(R.id.code);
        final TextView haster = (TextView) findViewById(R.id.textView9);
        final TextView hare = (TextView) findViewById(R.id.textView11);
        final ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        final ImageButton removeb = (ImageButton) findViewById(R.id.removedb);
        final ImageButton stats = (ImageButton) findViewById(R.id.stats);
        final ImageButton chatblue = (ImageButton) findViewById(R.id.chatBlue);
        final ImageButton chatgreen = (ImageButton) findViewById(R.id.chatGreen);
        final ImageButton chatred = (ImageButton) findViewById(R.id.chatRed);
        final ImageButton chatpuprle = (ImageButton) findViewById(R.id.chatPurple);
        final ImageButton chatyellow = (ImageButton) findViewById(R.id.chatYellow);
        final MediaPlayer But  = MediaPlayer.create(this,R.raw.soundbut);
        final ImageView notblue = (ImageView) findViewById(R.id.notBlue);
        final ImageView notgreen = (ImageView) findViewById(R.id.notGreen);
        final ImageView notred = (ImageView) findViewById(R.id.notRed);
        final ImageView notpurple = (ImageView) findViewById(R.id.notPurple);
        final ImageView notyellow = (ImageView) findViewById(R.id.notYellow);
        Switch switch1 = (Switch)findViewById(R.id.switch1);
        musicFlg = 0;
        adminflag = 1;
        mDatabase = FirebaseDatabase.getInstance().getReference("admin");
        mDatabase.child("Name").setValue("admin");
        switch1.setChecked(true);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    code.setVisibility(View.VISIBLE);
                    haster.setVisibility(View.VISIBLE);
                    hare.setVisibility(View.INVISIBLE);

                }
                else {
                    code.setVisibility(View.INVISIBLE);
                    haster.setVisibility(View.INVISIBLE);
                    hare.setVisibility(View.VISIBLE);
                }
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                But.start();
                backbutton.setImageResource(R.drawable.backmenup);
                Intent myIntent = new Intent(madrih.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        removeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                But.start();
                removeb.setImageResource(R.drawable.dbcleanp);
                new AlertDialog.Builder( madrih.this )
                        .setTitle( "האם אתה בטוח?" )
                        .setMessage( "האם אתה בטוח שברצונך למחוק את כל נתוני הקבוצות?" )
                        .setPositiveButton( "כן", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                mDatabase = FirebaseDatabase.getInstance().getReference();
                                mDatabase.setValue(null);
                            }
                        })
                        .setNegativeButton( "לא", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        } )
                        .show();
                removeb.setImageResource(R.drawable.dbclean);
            }
        });

        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(madrih.this, stats.class);
                startActivity(myIntent);

            }
        });

        chatblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notblue.setVisibility(View.GONE);
                flag = 1;
                Intent myIntent = new Intent(madrih.this, chat.class);
                startActivity(myIntent);

            }
        });
        chatgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notgreen.setVisibility(View.GONE);
                flag = 2;
                Intent myIntent = new Intent(madrih.this, chat.class);
                startActivity(myIntent);

            }
        });
        chatred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notred.setVisibility(View.GONE);
                flag = 3;
                Intent myIntent = new Intent(madrih.this, chat.class);
                startActivity(myIntent);

            }
        });
        chatpuprle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notpurple.setVisibility(View.GONE);
                flag = 4;
                Intent myIntent = new Intent(madrih.this, chat.class);
                startActivity(myIntent);

            }
        });
        chatyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notyellow.setVisibility(View.GONE);
                flag = 5;
                Intent myIntent = new Intent(madrih.this, chat.class);
                startActivity(myIntent);
            }
        });
    }

        @Override
        public void onBackPressed() {
            if(TIME_LIMIT+backPressed > System.currentTimeMillis()){
                Intent myIntent = new Intent(madrih.this,MainActivity.class);
                startActivity(myIntent);
            }
            else{
                Toast.makeText(getApplicationContext(),"לחץ חזור שוב כדי להגיע לתפריט הראשי",Toast.LENGTH_SHORT).show();
            }
            backPressed = System.currentTimeMillis();
        }
    }




