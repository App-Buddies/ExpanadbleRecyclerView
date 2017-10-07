package com.example.admin.expanadblerecyclerview.multicheck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.expanadblerecyclerview.Artist;
import com.example.admin.expanadblerecyclerview.R;
import com.example.admin.expanadblerecyclerview.expand.GenreViewHolder;
import com.thoughtbot.expandablecheckrecyclerview.CheckableChildRecyclerViewAdapter;
import com.thoughtbot.expandablecheckrecyclerview.models.CheckedExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class MultiCheckGenreAdapter extends CheckableChildRecyclerViewAdapter<GenreViewHolder, MultiCheckArtistViewHolder> {
    public MultiCheckGenreAdapter(List<? extends CheckedExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public MultiCheckArtistViewHolder onCreateCheckChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_multicheck_artist, parent, false);
        return new MultiCheckArtistViewHolder(view);    }

    @Override
    public void onBindCheckChildViewHolder(MultiCheckArtistViewHolder holder, int flatPosition, CheckedExpandableGroup group, int childIndex) {
        final Artist artist = (Artist) group.getItems().get(childIndex);
        holder.setArtistName(artist.getName());
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_genre, parent, false);
        return new GenreViewHolder(view);
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreTitle(group);
    }
}
