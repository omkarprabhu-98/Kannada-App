package com.adminomkar.kanadaapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 26-Jan-17.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView= convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentword= getItem(position);
        ImageView imageView=(ImageView) listItemView.findViewById(R.id.img) ;
        if(currentword.hasImage())
        {
            imageView.setImageResource(currentword.getImage());
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        TextView kannadTextView=(TextView) listItemView.findViewById(R.id.kannadatext);
        kannadTextView.setText(currentword.getKannadTrans());
        TextView engTextView=(TextView)listItemView.findViewById(R.id.engtext);
        engTextView.setText(currentword.getEnglishTrans());

        return listItemView;
    }
}
