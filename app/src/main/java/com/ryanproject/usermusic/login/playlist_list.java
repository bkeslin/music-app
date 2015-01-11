package com.ryanproject.usermusic.login;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;


import ryanproject.usermusic.R;


public class playlist_list extends ListActivity {


    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;

    Button AddSong;
    Intent jintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_playlist);
        final ListView listview = (ListView) findViewById(R.id.playlist);
        String[] JukeBoxes = new String[] { "HACKUCSC", "Merrill", "East Campus", "Santa Cruz"};

        final ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<JukeBoxes.length; ++i){
            list.add(JukeBoxes[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);

      /*  AddSong = (Button)findViewById(R.id.add_song_button);
        AddSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jintent = new Intent(playlist_list.this, add_song.class);
                startActivity(jintent);
            }
        });*/
    }

    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
    }*/

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_veto_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}

