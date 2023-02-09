package com.example.listazakupow_recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList <String> produkty = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wypelnijListe();
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