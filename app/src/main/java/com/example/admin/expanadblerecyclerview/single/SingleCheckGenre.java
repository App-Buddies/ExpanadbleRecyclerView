package com.example.admin.expanadblerecyclerview.single;

import android.os.Parcel;

import com.thoughtbot.expandablecheckrecyclerview.models.SingleCheckExpandableGroup;

import java.util.List;

/**
 * Created by ADMIN on 02-10-2017.
 */

public class SingleCheckGenre extends SingleCheckExpandableGroup {
    private int iconResId;

    public SingleCheckGenre(String title, List items, int iconResId) {
        super(title, items);
        this.iconResId = iconResId;
    }

    public SingleCheckGenre(Parcel in) {
        super(in);
        iconResId = in.readInt();

    }

    public int getIconResId() {
        return iconResId;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(iconResId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SingleCheckGenre> CREATOR = new Creator<SingleCheckGenre>() {
        @Override
        public SingleCheckGenre createFromParcel(Parcel in) {
            return new SingleCheckGenre(in);
        }

        @Override
        public SingleCheckGenre[] newArray(int size) {
            return new SingleCheckGenre[size];
        }
    };
}
