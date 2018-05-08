package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by FaiyazHuq on 2018-05-06.
 */

public class WordAdapter extends ArrayAdapter<Miwok> {

    public WordAdapter(Activity context, ArrayList<Miwok> miwoks) {
        super(context, 0, miwoks);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;

        if(listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Miwok currentMiwok = getItem(position);

        TextView defaultName = (TextView) listitemView.findViewById(R.id.english_text_view);
        defaultName.setText(currentMiwok.getDefaultTranslation());

        TextView miwokName = (TextView) listitemView.findViewById(R.id.miwok_text_view);
        miwokName.setText(currentMiwok.getMiwokTranslation());

        ImageView image = (ImageView) listitemView.findViewById(R.id.image);
        image.setImageResource(currentMiwok.getImageResourceID());

        return listitemView;


    }
}
