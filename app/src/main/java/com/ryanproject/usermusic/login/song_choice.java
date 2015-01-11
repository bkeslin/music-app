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

public class song_choice extends Activity {

    Button moveon;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_playlist);

        final ListView listview = (ListView) findViewById(R.id.playlists);
        String[] Songs = new String[] {"Ramble On -Led Zeppelin", "Pigs -Pink Floyd", "Born to Run -Bruce Springsteen", "Nebraska -Bruce Springsteen",
        "California Gurls -Katy Perry", "Shabba -ASAP Ferg", "See Me -Disclosure"};

        final ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<Songs.length; ++i){
            list.add(Songs[i]);
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
                        startActivity(intent);
                    }
                });
            }

        });

        moveon = (Button)findViewById(R.id.move_on_button);
        moveon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(song_choice.this, add_song.class);
                startActivity(intent);
            }
        });


    }
}
