package com.example.cabeloni.epcomp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import static com.example.cabeloni.epcomp.groups.flag;
import static com.example.cabeloni.epcomp.madrih.adminflag;
import static com.example.cabeloni.epcomp.groups.nameone;
import static com.example.cabeloni.epcomp.groups.nametwo;
import static com.example.cabeloni.epcomp.groups.namethree;
import static com.example.cabeloni.epcomp.groups.namefour;
import static com.example.cabeloni.epcomp.groups.namefive;
import org.w3c.dom.Text;


public class chat extends AppCompatActivity {

    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        final ImageButton closeb = (ImageButton) findViewById(R.id.back);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .9), (int) (height * .7));
        closeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        final TextView myText = findViewById(R.id.textchat);
        if (flag == 1) {
            myText.setBackgroundColor(Color.parseColor("#99FFFF"));
            mDatabase = FirebaseDatabase.getInstance().getReference("messageBlue");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String[] Messages = dataSnapshot.getValue().toString().split(",");
                        myText.setText("");
                        for (int i = 0; i < Messages.length; i++) {
                            String[] finalMsg = Messages[i].split("=");
                            myText.append(finalMsg[i] + "\n");

                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }

            });
        }
        else if (flag == 2) {
            myText.setBackgroundColor(Color.parseColor("#26ce00"));
            mDatabase = FirebaseDatabase.getInstance().getReference("messageGreen");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String[] Messages = dataSnapshot.getValue().toString().split(",");
                        myText.setText("");
                        for (int i = 0; i < Messages.length; i++) {
                            String[] finalMsg = Messages[i].split("=");
                            myText.append(finalMsg[1] + "\n");
                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }

            });
        }
        else if (flag == 3) {
            myText.setBackgroundColor(Color.parseColor("#fd6f6f"));
            mDatabase = FirebaseDatabase.getInstance().getReference("messageRed");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String[] Messages = dataSnapshot.getValue().toString().split(",");
                        myText.setText("");
                        for (int i = 0; i < Messages.length; i++) {
                            String[] finalMsg = Messages[i].split("=");
                            myText.append(finalMsg[1] + "\n");
                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }

            });
        }
        else if (flag == 4) {
            myText.setBackgroundColor(Color.parseColor("#e999ff"));
            mDatabase = FirebaseDatabase.getInstance().getReference("messagePurple");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String[] Messages = dataSnapshot.getValue().toString().split(",");
                        myText.setText("");
                        for (int i = 0; i < Messages.length; i++) {
                            String[] finalMsg = Messages[i].split("=");
                            myText.append(finalMsg[1] + "\n");
                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }

            });
        }
        else {
            myText.setBackgroundColor(Color.parseColor("#fffb99"));
            mDatabase = FirebaseDatabase.getInstance().getReference("messageYellow");
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String[] Messages = dataSnapshot.getValue().toString().split(",");
                        myText.setText("");
                        for (int i = 0; i < Messages.length; i++) {
                            String[] finalMsg = Messages[i].split("=");
                            myText.append(finalMsg[1] + "\n");
                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }

            });
        }
    }
    public void sendMessage(View view){
        EditText myEditText = findViewById(R.id.editText);
        String txtval = myEditText.getText().toString();
        if(!txtval.isEmpty()) {
            if (adminflag == 1){
                mDatabase.child(Long.toString(System.currentTimeMillis())).setValue( "מנהל הפעילות: " + myEditText.getText().toString());
                myEditText.setText("");
            }
            else {
                if (flag == 1) {
                    mDatabase.child(Long.toString(System.currentTimeMillis())).setValue(nameone + ": " + myEditText.getText().toString());
                    myEditText.setText("");
                }
                else if (flag == 2){
                    mDatabase.child(Long.toString(System.currentTimeMillis())).setValue(nametwo + ": " + myEditText.getText().toString());
                    myEditText.setText("");
                }
                else if (flag == 3){
                    mDatabase.child(Long.toString(System.currentTimeMillis())).setValue(namethree + ": " + myEditText.getText().toString());
                    myEditText.setText("");
                }
                else if (flag == 4){
                    mDatabase.child(Long.toString(System.currentTimeMillis())).setValue(namefour + ": " + myEditText.getText().toString());
                    myEditText.setText("");
                }
                else {
                    mDatabase.child(Long.toString(System.currentTimeMillis())).setValue(namefive + ": " + myEditText.getText().toString());
                    myEditText.setText("");
                }
            }
        }
    }
}
