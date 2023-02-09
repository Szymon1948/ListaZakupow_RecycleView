package com.example.listazakupow_recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

//3-Implement Methods
public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ProduktViewHolder> {

    private LayoutInflater inflater;
    private final LinkedList<String> listaZakupow; //Generuj Konstruktor

    public ShoppingAdapter(Context context, LinkedList<String> listaZakupow) {
        inflater = LayoutInflater.from(context);
        this.listaZakupow = listaZakupow;
    }

    @NonNull
    @Override
    public ProduktViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = inflater.inflate(R.layout.item_product, parent, false);
        return new ProduktViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProduktViewHolder holder, int position) {
        holder.productItemView.setText(listaZakupow.get(position));
    }

    @Override
    public int getItemCount() {
        return listaZakupow.size();
    }

    //1-Create class 'ProduktViewHolder'
                                   //2-Create constructor matching super
                                                                        //4-Implement Methods
    public class ProduktViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView productItemView;
    public final ShoppingAdapter shoppingAdapter;
    public ProduktViewHolder(@NonNull View itemView, ShoppingAdapter adapter) {
        super(itemView);
        productItemView = itemView.findViewById(R.id.textView);
        shoppingAdapter = adapter;
        itemView.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            int shoppingPosition = getLayoutPosition();
            String prod = listaZakupow.get(shoppingPosition);
            prod = "Kupione "+prod;
            listaZakupow.set(shoppingPosition,prod);
            shoppingAdapter.notifyDataSetChanged();
            //todo: zrobić żeby po drugim kliknięciu nie dopisywało się kupione

            Toast.makeText(inflater.getContext(), prod, Toast.LENGTH_SHORT).show();
        }
    }
}
