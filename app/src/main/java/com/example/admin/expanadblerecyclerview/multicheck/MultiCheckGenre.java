package com.example.admin.expanadblerecyclerview.multicheck;

import com.example.admin.expanadblerecyclerview.Artist;
import com.thoughtbot.expandablecheckrecyclerview.models.MultiCheckExpandableGroup;

import java.util.List;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class MultiCheckGenre extends MultiCheckExpandableGroup {
    public int iconResid;

    public MultiCheckGenre(String title, List<Artist> items, int iconResId) {
        super(title, items);
        this.iconResid = iconResId;
    }

    public int getIconResid() {
        return iconResid;
    }
}
