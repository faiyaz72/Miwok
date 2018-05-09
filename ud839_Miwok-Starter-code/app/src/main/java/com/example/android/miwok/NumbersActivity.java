package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        final ArrayList<Miwok> miwoks = new ArrayList<Miwok>();

        miwoks.add(new Miwok("One", "Gaga", R.drawable.number_one, R.raw.number_one ));
        miwoks.add(new Miwok("Two", "Jojo",R.drawable.number_two, R.raw.number_two ));
        miwoks.add(new Miwok("Three", "Fshc",R.drawable.number_three, R.raw.number_three ));
        miwoks.add(new Miwok("Four", "Jjkce", R.drawable.number_four, R.raw.number_four));
        miwoks.add(new Miwok("Five", "sjos", R.drawable.number_five, R.raw.number_five));
        miwoks.add(new Miwok("Six", "Ldjif", R.drawable.number_six, R.raw.number_six));
        miwoks.add(new Miwok("Seven", "Ldjif", R.drawable.number_seven, R.raw.number_seven));
        miwoks.add(new Miwok("Eight", "Ldjif", R.drawable.number_eight, R.raw.number_eight));
        miwoks.add(new Miwok("Nine", "Ldjif", R.drawable.number_nine, R.raw.number_nine));
        miwoks.add(new Miwok("Ten", "Ldjif", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, miwoks);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                Miwok number = miwoks.get(position);

                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, number.getAudioRedource());
                mMediaPlayer.start();
            }
        });


        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
