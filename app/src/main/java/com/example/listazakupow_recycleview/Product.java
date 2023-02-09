package com.example.listazakupow_recycleview;

public class Product {
   private String nazwa;
   private boolean czyZaznaczony;

    public Product(String nazwa) {
        this.nazwa = nazwa;
        this.czyZaznaczony = false;
    }


    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyZaznaczony() {
        return czyZaznaczony;
    }

    public void setCzyZaznaczony(boolean czyZaznaczony) {
        this.czyZaznaczony = czyZaznaczony;
    }
}

