package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class GameByAge {
    public static void main(String[] args) {
        int[] ageArray = {19,20,21,22,18,23,24};
        System.out.println(gameByAgeSolution(ageArray));
    }
    public static ArrayList<ArrayList<Integer>> gameByAgeSolution(int[] ageArray){
        Arrays.sort(ageArray);
        ArrayList<ArrayList<Integer>> listOfAgeCollection = new ArrayList<ArrayList<Integer>>();
        int k = 0;
        for(int i=0; i<ageArray.length;i=k+1){
            ArrayList<Integer> ageCollection = new ArrayList<>();
            for(int j=i;j<ageArray.length;j++){
                if((ageArray[j] -ageArray[i])<=2){
                    k = j;
                    ageCollection.add(ageArray[j]);
                }
            }
            listOfAgeCollection.add(ageCollection);
        }
        return listOfAgeCollection;
    }
}
