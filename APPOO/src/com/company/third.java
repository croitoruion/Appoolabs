package com.company;

import java.util.*;

/**
 * Created by Ion C on 11.04.2017.
 */
public class third {

    private Vector<Laptop> laptopvec;

    private void AddVector(Vector<Laptop> data, int size){
        System.out.println("Introduceti" + size + " elemente: ");
        for(int i = 0; i < size; i++) {
            Laptop tmp = new Laptop();
            System.out.println("Introduceti Laptopul " + (i+1) + " :");
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


    private Vector<Laptop> FindBrand(Vector<Laptop> brand , String s){
       Vector<Laptop> result = new Vector<>();
        Iterator iter = brand.iterator();
         while(iter.hasNext()){
     Laptop temp = (Laptop) iter.next();
     if(temp.getBrand().equals(s))
         result.add(temp);
 }
 return result;
    }
    private Boolean PretScump(Laptop obj) {
        return ((obj.getPrice()>12000));
    }
    private void CopyEl(Vector<Laptop> v, List<Laptop> list) {
        for(int i= 0; i<v.size(); i++){
          if(PretScump(v.elementAt(i))){
              list.add(v.elementAt(i));
              v.remove(i);
          }
        }
    }
    private void count(Vector<Laptop> v){
        int count =0;
        for(int i = 0 ; i<v.size(); i++){
            if(PretScump(v.elementAt(i))){
               count+=1; }
        }
        System.out.print("Au fost gasite: "+count+" Laptop-uri scumpe");
        }

    private Vector<Laptop> concat(Vector<Laptop> vec, List<Laptop> list) {
        Vector<Laptop> vec2= new Vector<>(vec);
        for (int i = 0; i < list.size(); i++) {
            vec2.addAll(list);
        }
        return vec2;
    }

    public void run() {
      //  Scanner in = new Scanner(System.in);
        String brand;
        int nrobj,deleteobj;
        Vector<Laptop> v = new Vector<>();
//1.introducere
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente: ");
        nrobj = scanner.nextInt();
        AddVector(v, nrobj);
//2.Sortare descrescator(dupa pret)
        Collections.sort(v);
//3.Afisarea vectorului sortat
        PrintVector(v);
//4.Cautarea in vector
      //  System.out.println("Indicati Brand-ul cautat");
        brand = ("Toshiba");


       Vector<Laptop> tmpFind = FindBrand(v,brand);
        if (tmpFind!=null) {
            System.out.println("Elementele gasite:");
            for(Laptop t:tmpFind){
                System.out.println(t.toString());
            }

        }
        System.out.println();

//5.Crearea unui noi container(List) si mutarea unor elemente
        List<Laptop> list = new LinkedList<Laptop>();
        CopyEl(v, list);
//6.Afisarea listei dupa mutarea conditionata
        System.out.println("Afisarea listei:");
        System.out.println(Arrays.toString(list.toArray()));
//7.Sortarea containerelor crescator
v.sort(new comparatorASC());
list.sort(new comparatorASC());
//8.Afisarea listei si vectorului
        System.out.println("Afisarea vectorului si listei sortate:");
        PrintVector(v);
        System.out.println("lista:");
        System.out.println(Arrays.toString(list.toArray()));
//9.Crearea unui nou vector si adaugarea vectorului 1 + lista
        Vector<Laptop> finalVec = concat(v, list);
        System.out.println("Vector + lista :");
//10.Afisarea vectorului final
                PrintVector(finalVec);
//11.Count
        count(finalVec);
//12.Daca exista element in vectorul 3
        //System.out.println("Check :- "+v.contains(10000,"Toshiba","x555"));
    }
}



