package com.example.prayerbook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContentsAdapter extends RecyclerView.Adapter<ContentsAdapter.ContentsViewHolder> {
    private int numberItems;
    private Context parent;
    private ContentResource resource;
    private int viewHolderCount;


    public ContentsAdapter(int numberOfItems, Context parent) {
        numberItems = numberOfItems;
        this.parent = parent;
        resource = new ContentConstructor().makeResource(numberOfItems, (MainActivity) parent);
        viewHolderCount = 0;
    }

    @NonNull
    @Override
    public ContentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForContentsItem = R.layout.contents_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForContentsItem, parent, false);
        ContentsViewHolder viewHolder = new ContentsViewHolder(view);
        viewHolder.contentsItemView.setText(resource.getPrayerName(viewHolderCount));
        viewHolderCount++;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContentsViewHolder holder, int position) {
        holder.bind(resource.getPrayerName(position));
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    class ContentsViewHolder extends RecyclerView.ViewHolder {
        TextView contentsItemView;

        public ContentsViewHolder(@NonNull View itemView) {
            super(itemView);
            contentsItemView = itemView.findViewById(R.id.tv_contents_item);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int positionIndex = getAdapterPosition();
                    String prayerText = resource.getPrayerText(positionIndex);
                    Context context = parent;
                    Class destinationActivity = ShowTextActivity.class;
                    Intent showTextActivityIntent = new Intent(context, destinationActivity);
                    showTextActivityIntent.putExtra(Intent.EXTRA_TEXT, prayerText);
                    parent.startActivity(showTextActivityIntent);
                }
            });
        }

        void bind (String contentsItemName) {
            contentsItemView.setText(contentsItemName);
        }
    }
}
