package com.example.admin.expanadblerecyclerview.multitype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.expanadblerecyclerview.Artist;
import com.example.admin.expanadblerecyclerview.Genre;
import com.example.admin.expanadblerecyclerview.R;
import com.example.admin.expanadblerecyclerview.expand.ArtistViewHolder;
import com.example.admin.expanadblerecyclerview.expand.GenreViewHolder;
import com.thoughtbot.expandablerecyclerview.MultiTypeExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.ExpandableListPosition;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import java.util.List;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class MultiTypeGenreAdapter extends MultiTypeExpandableRecyclerViewAdapter<GenreViewHolder,ChildViewHolder> {

    public static final int FAVORITE_VIEW_TYPE = 3;
    public static final int ARTIST_VIEW_TYPE = 4;
    public MultiTypeGenreAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_genre, parent, false);
        return new GenreViewHolder(view);
    }

    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ARTIST_VIEW_TYPE:
                View artist =LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_artist, parent, false);
                return new ArtistViewHolder(artist);
            case FAVORITE_VIEW_TYPE:
                View favorite =
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_favorite_artist, parent, false);
                return new FavoriteArtistViewHolder(favorite);
            default:
                throw new IllegalArgumentException("Invalid viewType");
        }
    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        int viewType = getItemViewType(flatPosition);
        Artist artist = ((Genre) group).getItems().get(childIndex);
        switch (viewType) {
            case ARTIST_VIEW_TYPE:
                ((ArtistViewHolder) holder).setArtistName(artist.getName());
                break;
            case FAVORITE_VIEW_TYPE:
                ((FavoriteArtistViewHolder) holder).setArtistName(artist.getName());
        }
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreTitle(group);

    }
    @Override
    public int getChildViewType(int position, ExpandableGroup group, int childIndex) {
        if (((Genre) group).getItems().get(childIndex).isFavorite()) {
            return FAVORITE_VIEW_TYPE;
        } else {
            return ARTIST_VIEW_TYPE;
        }
    }

    @Override
    public boolean isGroup(int viewType) {
        return viewType == ExpandableListPosition.GROUP;
    }

    @Override
    public boolean isChild(int viewType) {
        return viewType == FAVORITE_VIEW_TYPE || viewType == ARTIST_VIEW_TYPE;
    }
}
