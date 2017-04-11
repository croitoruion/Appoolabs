package com.company;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Ion C on 04.04.2017.
 */
public class Laptop implements Comparable<Laptop> {
    String brand;
    private String model;
    private  int price;

    @Override
    public int compareTo(Laptop that) {
        return that.price - this.price;
    }



    Laptop() {
        brand = "Default";
        model="Default";
        price = 0;

    }
    Laptop(int Price, String Brand, String Model) {
        brand = Brand;
        model = Model;
        price = Price;
    }

    public void Brand(String Brand) {
        brand = Brand;
    }
    public void Model(String Model) {
        model = Model;
    }
    public void Price(int pret) {
        price = pret;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public void print() {
        System.out.println("Brand   : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Pret : " + price);
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti brandul Laptopului   : ");
        brand = scanner.nextLine();
        System.out.print("Introduceti modelul Laptopului   : ");
        model = scanner.nextLine();
        System.out.print("Introduceti pretul Laptopului    : ");
        price = scanner.nextInt();
}
    public String toString(){
        String obj = "Brand: "+ this.brand + ". Model:" + this.model + ". Pret:" + price;
        System.out.println();
        return obj;
}


}
