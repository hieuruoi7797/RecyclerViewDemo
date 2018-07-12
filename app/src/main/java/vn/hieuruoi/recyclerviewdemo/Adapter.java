package vn.hieuruoi.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    protected ArrayList<Data> mDataList;
    protected Context mContext;

    public Adapter(ArrayList<Data> arrayList, Context applicationContext) {
        this.mDataList = arrayList;
        this.mContext = applicationContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDataList.get(position).getName());
        holder.imageView.setImageResource(mDataList.get(position).getmImage());
    }

    @Override
    public int getItemCount() {
        return mDataList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_name);
            imageView = itemView.findViewById(R.id.iv_heroes);

        }
    }
}
