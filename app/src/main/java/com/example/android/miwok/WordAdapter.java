package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private ArrayList<Word> mWords;
    private String mWordsBackgroundColor;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words, String wordsBackgroundColor) {
        super(context, 0, words);

        mWordsBackgroundColor = wordsBackgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false
            );
        }

        LinearLayout wordsLayout = (LinearLayout) listItemView.findViewById(R.id.wordsLayout);
        wordsLayout.setBackgroundColor(Color.parseColor(mWordsBackgroundColor));

        Word currentWord = getItem(position);

        TextView defaultTranslation = (TextView)listItemView.findViewById(R.id.defaultTextView);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = (TextView)listItemView.findViewById(R.id.miwokTextView);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
