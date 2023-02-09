package com.example.listazakupow_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//3-Implement Methods
public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ProduktViewHolder> {

    private LayoutInflater inflater;

    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = inflater.inflate(R.layout.item_product, parent, false);
        return new ProduktViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //1-Create class 'ProduktViewHolder'
                                   //2-Create constructor matching super
    public class ProduktViewHolder extends RecyclerView.ViewHolder {
    public final TextView productItemView;
    public final ShoppingAdapter shoppingAdapter;
    public ProduktViewHolder(@NonNull View itemView, ShoppingAdapter adapter) {
        super(itemView);
        productItemView = itemView.findViewById(R.id.textView);
        shoppingAdapter = adapter;
    }
}
}
