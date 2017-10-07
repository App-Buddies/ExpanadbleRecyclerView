package com.example.admin.expanadblerecyclerview.single;

import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;

import com.example.admin.expanadblerecyclerview.R;
import com.thoughtbot.expandablecheckrecyclerview.viewholders.CheckableChildViewHolder;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class SingleCheckArtistViewHolder extends CheckableChildViewHolder {
    private CheckedTextView childCheckedTextView;

    public SingleCheckArtistViewHolder(View itemView) {
        super(itemView);
        childCheckedTextView =
                (CheckedTextView) itemView.findViewById(R.id.list_item_singlecheck_artist_name);
    }

    @Override
    public Checkable getCheckable() {
        return childCheckedTextView;
    }

    public void setArtistName(String artistName) {
        childCheckedTextView.setText(artistName);
    }
}
