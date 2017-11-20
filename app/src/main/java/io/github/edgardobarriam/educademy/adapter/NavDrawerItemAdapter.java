package io.github.edgardobarriam.educademy.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.NavDrawerItemModel;

/**
 * Created by Edgardo Barría Melián on 19-11-2017.
 */

public class NavDrawerItemAdapter  extends ArrayAdapter<NavDrawerItemModel> {

    Context context;
    int layoutResourceId;
    NavDrawerItemModel data[] = null;

    public NavDrawerItemAdapter(Context context, int layoutResourceId, NavDrawerItemModel[] data) {

        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);

        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewItemIcon);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewItemName);

        NavDrawerItemModel folder = data[position];

        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return listItem;
    }
}
