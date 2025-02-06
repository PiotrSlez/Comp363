//Piotr Slezak
//COMP 363 - 001
//
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(23);
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(2);
        list.add(67);
        list.add(8);
        System.out.println("list before: " + list);
        list = MergeSort.mergeSort(list);
        System.out.println("list sorted: " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        System.out.println("list before: " + list2);
        list2 = MergeSort.mergeSort(list2);
        System.out.println("list sorted: " + list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        System.out.println("list before: " + list3);
        list3 = MergeSort.mergeSort(list3);
        System.out.println("list sorted: " + list3);



    }
}