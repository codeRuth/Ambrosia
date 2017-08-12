package com.coderuth.ambrosia.ambrosia.adapter;

import android.view.View;
import android.widget.TextView;

import com.coderuth.ambrosia.ambrosia.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ChangeViewHolder extends ChildViewHolder {
    private TextView subTitleTextView;

    public ChangeViewHolder(View itemView) {
        super(itemView);
        subTitleTextView = (TextView) itemView.findViewById(R.id.subtitle);
    }

    public void setSubTitletName(String name) {
        subTitleTextView.setText(name);
    }
}
