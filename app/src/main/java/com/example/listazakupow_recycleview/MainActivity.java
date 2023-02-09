package com.example.listazakupow_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList <String> produkty = new LinkedList<>();
    private RecyclerView shoppingRecyclerView;
    private ShoppingAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wypelnijListe();
        shoppingRecyclerView = findViewById(R.id.recyclerView);
        adapter = new ShoppingAdapter(this,produkty);
        shoppingRecyclerView.setAdapter(adapter);
        shoppingRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void wypelnijListe(){
        produkty.addLast("jablka");
        produkty.addLast("ciasto");
        produkty.addLast("pepsi");
        produkty.addLast("jaja");
        produkty.addLast("chleb");
        produkty.addLast("kielbasa");
        produkty.addLast("nudle");
        produkty.addLast("ser");
        produkty.addLast("gorzka_czekolada");
    }
}