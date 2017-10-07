package com.example.admin.expanadblerecyclerview.expand;

import android.view.View;
import android.widget.TextView;

import com.example.admin.expanadblerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class ArtistViewHolder extends ChildViewHolder {

    private TextView childTextView;

    public ArtistViewHolder(View itemView) {
        super(itemView);
        childTextView = (TextView) itemView.findViewById(R.id.list_item_artist_name);
    }

    public void setArtistName(String name) {
        childTextView.setText(name);
    }
}
