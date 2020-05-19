package com.example.shreyashrivastavaproject2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {

    String name[];
    String year[];
    int [] image;
    Context context;

    public MyAdapter(Context context, String[] name, String[] year, int[] image){
        super(context, R.layout.row);
        this.name = name;
        this.year = year;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView==null) {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.row, parent, false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.icon);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.name);
            mViewHolder.mYear = (TextView) convertView.findViewById(R.id.year);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder= (ViewHolder)convertView.getTag();
        }
        mViewHolder.mImage.setImageResource(image[position]);
        mViewHolder.mName.setText(name[position]);
        mViewHolder.mYear.setText(year[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mName;
        TextView mYear;

    }
}
