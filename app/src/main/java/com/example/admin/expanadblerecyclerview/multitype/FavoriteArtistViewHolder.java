package com.example.admin.expanadblerecyclerview.multitype;

import android.view.View;
import android.widget.TextView;

import com.example.admin.expanadblerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class FavoriteArtistViewHolder extends ChildViewHolder {
    private TextView favoriteArtistName;

    public FavoriteArtistViewHolder(View itemView) {
        super(itemView);
        favoriteArtistName = (TextView) itemView.findViewById(R.id.list_item_favorite_artist_name);
    }

    public void setArtistName(String name) {
        favoriteArtistName.setText(name);
    }
}
