package com.desafiolatam.fundamentalandroiddemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desafiolatam.fundamentalandroiddemo.R;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder>{

    private final String[] localDataSet = {"Pepe", "John", "Bob", "Ale"};

    @NonNull
    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_simple, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.ViewHolder holder, int position) {
        holder.getTextViewName().setText(localDataSet[position]);
        holder.getTextViewEmail().setText(localDataSet[position] + "@demo.cl");
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewName;
        private final TextView textViewEmail;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewName = (TextView) view.findViewById(R.id.tvName);
            textViewEmail = view.findViewById(R.id.tvEmail);
        }

        public TextView getTextViewName() {
            return textViewName;
        }

        public TextView getTextViewEmail() {
            return textViewEmail;
        }
    }
}