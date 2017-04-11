package com.company;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Ion C on 10.04.2017.
 */
public class second {
    private void AddVector(Vector<Laptop> data, int size){
        System.out.println("Introduceti" + size + " elemente: ");
        for(int i = 0; i < size; i++) {
            Laptop tmp = new Laptop();
            System.out.println("Introduceti Laptopul: ");
            tmp.read();
            data.addElement(tmp);
        }
    }
    private void PrintVector(Vector<Laptop> data) {
        for (int i = 0; i < data.size(); i++) {
            data.elementAt(i).print();
        }
        System.out.println();
    }

    public void run() {
        int nrobj,deleteobj;
        Vector<Laptop> v = new Vector<>();

//1.introducerea vectorului
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente: ");
        nrobj = scanner.nextInt();
        AddVector(v, nrobj);
//2.afisarea vectorului
        PrintVector(v);
//3.Stergere si update
        System.out.println();
        System.out.println("A fost sters primul obiect a clasei si adaugat altele 2 in loc");
        System.out.println("Vectorul modificat este:");
        v.remove(0);
        Laptop lap1 = new Laptop(13000,"Toshiba","GTX9000");
        Laptop lap2 = new Laptop(7500,"Lenova","Ideapad2");
        v.addElement(lap1);
        v.addElement(lap2);
        PrintVector(v);

//4.Afisarea cu ajutorul iteratorilor
        System.out.println();
        System.out.println("Afisarea vectorului cu ajutorul iteratorilor");
        Iterator iter = v.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+ " ");
        }
//5.De creat inca un vector de int si de introdus elemente
        Vector<Laptop> v2 = new Vector<>();
        System.out.println();
        System.out.print("Introduceti numarul de elemente pentru al doilea vector: ");
        nrobj = scanner.nextInt();
        AddVector(v2, nrobj);
//6.De sters n elemente din primu vector apoi de copiet elementele  din al 2 vector in primul
        System.out.print("Introduceti numarul de elemente ce vor fi sterse:  ");

        int numar = scanner.nextInt();
        v.subList(0,numar).clear();
        v.addAll(v2);
        System.out.println();
        System.out.println("Copierea elemetelor din al 2 vector in primul");
//7.Afisarea vectorilor
        PrintVector(v);
        PrintVector(v2);
    }
    }

