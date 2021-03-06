package com.ryanproject.usermusic.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import ryanproject.usermusic.R;


public class playlist_page_two extends Activity {

    Button AddSong;
    Intent intent;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        final ListView listview = (ListView) findViewById(R.id.playlists);
        String[] jukeBoxes = new String[] { "HACKUCSC", "Merrill", "East Campus", "Santa Cruz", "California", "USA", "World"};

        final ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<jukeBoxes.length; ++i){
            list.add(jukeBoxes[i]);
        }


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                view.animate().setDuration(1000).alpha(0).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                                intent = new Intent(playlist_page_two.this, the_playlist.class);
                                startActivity(intent);
                            }
                        });
            }

        });

        AddSong = (Button)findViewById(R.id.add_song_button);
        AddSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(playlist_page_two.this, make_playlist.class);
                startActivity(intent);
            }
        });

    }
}