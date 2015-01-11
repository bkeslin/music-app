package com.ryanproject.usermusic.login;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import ryanproject.usermusic.R;


public class playlist_page_two extends ListActivity {

    ImageButton mVetoButton;
    Button mAddButton;
    Intent intent;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        final ListView listview = (ListView) findViewById(R.id.playlists);
        String[] JukeBoxes = new String[] { "HACKUCSC", "Merrill", "East Campus", "Santa Cruz"};

        final ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<JukeBoxes.length; ++i){
            list.add(JukeBoxes[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

    }
}