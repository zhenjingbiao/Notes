package com.example.notes;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ExpressGridAdapter extends BaseAdapter
{
    private Context context;

    public  List<Integer> mExpressImages ;

    public ExpressGridAdapter(Context context,List<Integer> expressImages)
    {
        this.context = context;
        if(expressImages==null){
            mExpressImages=new ArrayList<Integer>();
        }else {
            mExpressImages=expressImages;
        }
    }



    @Override
    public int getCount()
    {
        return mExpressImages.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mExpressImages.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = View.inflate(context, R.layout.item_express, null);
            holder = new ViewHolder();
            holder.mImageView = (ImageView) convertView.findViewById(R.id.express_iv);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mImageView.setImageResource(mExpressImages.get(position));
        return convertView;
    }

    private class ViewHolder
    {
        ImageView mImageView;
    }
}
