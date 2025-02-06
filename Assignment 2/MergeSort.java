// Piotr Slezak
// Comp 363-001
// 2025 January 31

import java.util.*;
public class MergeSort{
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> initialList){

        //if empty, list is already sorted
        if(initialList.isEmpty()){
            return initialList;
        }

        //separates list into list of lists
        LinkedList<LinkedList<Integer>> listOfLists = separate(initialList);

        //merges lists
        LinkedList<Integer> sortedList = merge(listOfLists);

        return sortedList;
    }

    public static LinkedList<LinkedList<Integer>> separate(LinkedList<Integer> list){
        LinkedList<LinkedList<Integer>> listOfLists = new LinkedList<>();

        for(int i = 0; i < list.size(); i++){ //creates lists with one int
            LinkedList<Integer> alone = new LinkedList<>();
            alone.add(list.get(i));
            listOfLists.add(alone);
        }
        return listOfLists;
    }

    public static LinkedList<Integer> merge(LinkedList<LinkedList<Integer>> listOfL) {

        while (listOfL.size() > 1) {
            LinkedList<Integer> first = listOfL.poll();
            LinkedList<Integer> second = listOfL.poll();
            LinkedList<Integer> sorted = new LinkedList<>();

            while(!first.isEmpty() && !second.isEmpty()){
                if (first.peek() >= second.peek()){
                    sorted.add(first.poll());
                } else {
                    sorted.add(second.poll());
                }
            }

            if(!first.isEmpty()){ //adds remaining lists to sorted list
                sorted.addAll(first);
            }
            if(!second.isEmpty()){  //adds remaining lists to sorted list
                sorted.addAll(second);
            }
            listOfL.add(sorted); //adds the sorted list to the end of the listoflists
        }

        return listOfL.poll(); //returns only if one list remains
    }

}