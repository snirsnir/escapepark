package com.example.cabeloni.epcomp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class stats extends AppCompatActivity {
    private TextView blueT;
    private TextView greenT;
    private TextView redT;
    private TextView purpleT;
    private TextView yellowT;
    private TextView blueTt;
    private TextView greenTt;
    private TextView redTt;
    private TextView purpleTt;
    private TextView yellowTt;
    private TextView blueTc;
    private TextView greenTc;
    private TextView redTc;
    private TextView purpleTc;
    private TextView yellowTc;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        blueT = (TextView) findViewById(R.id.textblue);
        blueTt = (TextView) findViewById(R.id.textbluet);
        blueTc = (TextView) findViewById(R.id.textbluec);
        greenT = (TextView) findViewById(R.id.textgreen);
        greenTt = (TextView) findViewById(R.id.textgreent);
        greenTc = (TextView) findViewById(R.id.textgreenc);
        redT = (TextView) findViewById(R.id.textred);
        redTt = (TextView) findViewById(R.id.textredt);
        redTc = (TextView) findViewById(R.id.textredc);
        purpleT = (TextView) findViewById(R.id.textpurple);
        purpleTt = (TextView) findViewById(R.id.textpurplet);
        purpleTc = (TextView) findViewById(R.id.textpurplec);
        yellowT = (TextView) findViewById(R.id.textyellow);
        yellowTt = (TextView) findViewById(R.id.textyellowt);
        yellowTc = (TextView) findViewById(R.id.textyellowc);
        final ImageButton closeb = (ImageButton) findViewById(R.id.back);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.9),(int)(height*.7));
        closeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("blue").child("Name");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    blueT.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("blue").child("stage");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    blueTc.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("blue").child("bluep");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    blueTt.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("green").child("Name");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    greenT.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("green").child("stage");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    greenTc.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("green").child("greenp");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    greenTt.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("red").child("Name");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    redT.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("red").child("stage");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    redTc.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("red").child("redp");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    redTt.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("purple").child("Name");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    purpleT.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("purple").child("stage");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    purpleTc.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("purple").child("purplep");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    purpleTt.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("yellow").child("Name");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    yellowT.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("yellow").child("stage");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    yellowTc.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference("yellow").child("yellowp");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()) {
                    String name = dataSnapshot.getValue().toString();
                    yellowTt.setText(name);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
}
