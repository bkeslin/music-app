package com.ryanproject.usermusic.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ryanproject.usermusic.R;

public class the_playlist extends Activity {

    Button moveon;
    Intent intent;

      /*  class Node{
            public Song song;
            public double rating;
            public Node next;
            public Node prev;
        }
        private Node cursor;
        private Node first;
        private Node last;

        public void insert_queue(Song song){
            Node n = new Node();
            if(queue_is_empty()){
                n.song = song;
                first = n;
                last = n;
            }else{
                n.song = song;
                n.next = first;
                first.prev = n;
                first = n;
            }
        }

        public boolean queue_is_empty(){
            return first == null;
        }

        public Song queue_play(){
            if(queue_is_empty()){
                System.out.println("The queue is empty");
                return null;
            }else{
                Node n = new Node();
                n = last;
                last = last.prev;
                return n.song;
            }
        }
        public List displaySong(){
            cursor = first;
            List<String> list = new ArrayList<String>();
            while(cursor != null && !(queue_is_empty())){
                list.add(cursor.song.title+" , "+cursor.song.artist_name);
            }
            return list;
        }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_playlist);


       /* final List<String> list = new ArrayList<String>();
        for(int i = 0; i<list.size(); ++i){
            list.add([i]);
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

        });*/

        moveon = (Button)findViewById(R.id.move_on_button);
        moveon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(the_playlist.this, add_song.class);
                startActivity(intent);
            }
        });


    }
}
