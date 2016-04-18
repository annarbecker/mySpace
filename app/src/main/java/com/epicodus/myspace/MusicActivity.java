package com.epicodus.myspace;

import java.util.ArrayList;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MusicActivity extends ListActivity {

    ArrayList<String> list = new ArrayList<String>();

    ArrayAdapter<String> adapter;

//
//    private Button mAddSongButton;
//    private EditText mMusicEditText;
//    private ListView mSongListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        Button addSongButton = (Button)findViewById(R.id.addSongButton);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText musicEditText = (EditText)findViewById(R.id.musicEditText);
                list.add(musicEditText.getText().toString());
                musicEditText.setText("");
                adapter.notifyDataSetChanged();
            }
        };

        addSongButton.setOnClickListener(listener);
        setListAdapter(adapter);

    }
}
