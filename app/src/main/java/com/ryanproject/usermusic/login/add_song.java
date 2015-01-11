package com.ryanproject.usermusic.login;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import ryanproject.usermusic.R;


public class add_song extends Activity {

    ImageButton mVetoButton;
    Button mAddButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veto_page);

        mVetoButton = (ImageButton)findViewById(R.id.veto_button);
        mVetoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                new SendVeto().execute();
            }});

        mAddButton = (Button)findViewById(R.id.add_button);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // intent = (Add_Song.this, UserSong.class);
            }
        });
    }

    private class SendVeto extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try{
                URL url = new URL("http://sluglug.soe.ucsc.edu/~keith/play/server.php?command=void&lat=36.999855&lon=-122.054198");
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                InputStream in = new DataInputStream(conn.getInputStream());
                in.close();
                conn.disconnect();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }
}