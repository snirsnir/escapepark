package com.example.cabeloni.epcomp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import java.util.concurrent.TimeUnit;

public class MyFragment2 extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myLayout2 = inflater.inflate(R.layout.my_fragment_layout2, container, false);
        final ImageButton chatb = (ImageButton)myLayout2.findViewById(R.id.chatb);
        chatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), chat.class);
                startActivity(myIntent);
            }
        });


        return myLayout2;
    }
}

