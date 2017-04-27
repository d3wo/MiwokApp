package com.example.android.miwok.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;


import java.util.ArrayList;

/**
 * Created by Dewo on 4/26/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView defaultLanguage = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultLanguage.setText(currentWord.getDefaultTranslation());
        TextView miwokLanguage = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokLanguage.setText(currentWord.getMiwokTranslation());
        ImageView image = (ImageView) listItemView.findViewById(R.id.image_icon);
        if (currentWord.hasImage() ){
            image.setImageResource(currentWord.getImageResourceId());
        }
        else {
            image.setVisibility(View.GONE);

        }

        return listItemView;

    }
}
