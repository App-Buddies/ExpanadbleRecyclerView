package com.example.admin.expanadblerecyclerview.multicheck;

import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;

import com.example.admin.expanadblerecyclerview.R;
import com.thoughtbot.expandablecheckrecyclerview.viewholders.CheckableChildViewHolder;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class MultiCheckArtistViewHolder extends CheckableChildViewHolder {
    private CheckedTextView childCheckedTextView;

    public MultiCheckArtistViewHolder(View itemView) {
        super(itemView);
        childCheckedTextView =
                (CheckedTextView) itemView.findViewById(R.id.list_item_multicheck_artist_name);
    }

    @Override
    public Checkable getCheckable() {
        return childCheckedTextView;
    }

    public void setArtistName(String name) {
        childCheckedTextView.setText(name);
    }
}
