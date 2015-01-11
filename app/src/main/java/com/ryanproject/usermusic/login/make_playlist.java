package com.ryanproject.usermusic.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ryanproject.usermusic.R;


public class make_playlist extends Activity {

    Button CreateButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_playlist);
        CreateButton = (Button)findViewById(R.id.creat_button);
        CreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(make_playlist.this, the_playlist.class);
                //intent.putExtra()
                startActivity(intent);
            }
        });

    }
}