package com.company;

import java.util.*;

/**
 * Created by Ion C on 10.04.2017.
 */
public class first {


    public void run() {

//1.introducere
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        for (int i=0; i<10; i++){
            v.addElement(i);
        }

//2.afisare
        System.out.println("Vectorul initial este:");
        Enumeration e = v.elements();
      while (e.hasMoreElements()){
          System.out.print(e.nextElement() + " ");
      }
//3.Stergere si update
        System.out.println();
        System.out.println("A fost sters primele 3 elemente si a fost adaugate atitea zerouri la sfirsitul vectorului");
        System.out.println("Vectorul modificat este:");
        v.subList(0,3).clear();
        for (int i=0; i<3; i++){
                      v.addElement(0);
        }
        Enumeration d = v.elements();
        while (d.hasMoreElements()){
            System.out.print(d.nextElement() + " ");
        }
//4.Afisarea cu ajutorul iteratorilor
        System.out.println();
        System.out.println("Afisarea vectorului cu ajutorul iteratorilor");
        Iterator iter = v.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+ " ");
        }
//5.De creat inca un vector de int si de introdus elemente

        Vector<Integer> v2 = new Vector<>();
        for (int i=1; i<=5; i++){
            v2.addElement(i*100);
        }
      /*  System.out.println();
        System.out.println("Al doilea vector");
       Iterator iter2 = v2.iterator();
        while (iter2.hasNext()) {
            System.out.print(iter2.next()+ " ");
        }*/

//6.De sters n elemente din primu vector apoi de copiet elementele  din al 2 vector in primul

        System.out.print("Introduceti numarul de elemente ce vor fi sterse");
       int numar = scanner.nextInt();
        v.subList(0,numar).clear();
//v.setSize(v.size()+v2.size());
   //     Collections.copy(v,v2);
        v.addAll(v2);
        System.out.println();
        System.out.println("Copierea elemetelor din al 2 vector in primul");

//7.Afisarea vectorilor

        System.out.println("Primul vector");
        Iterator iter2 = v.iterator();
        while (iter2.hasNext()) {
            System.out.print(iter2.next()+ " ");
        }
        System.out.println();
        System.out.println("Al 2 vector");
        Iterator iter3 = v2.iterator();
        while (iter3.hasNext()) {
            System.out.print(iter3.next()+ " ");
        }
}

}
