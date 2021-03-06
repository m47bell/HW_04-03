package nyc.c4q.m47bell;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-marbella on 4/1/15.
 * Access Code 2-1
 * Marbella Vidals
 *
 *  Write a class called LinearSearch which implements a static method search which accepts as
 *  input an ArrayList alist and an integer x, and returns the first index it sees of x in alist.
 *  If the integer is not present return in the list return -1
 */
public class LinearSearch {

    // static method search which accepts as
   // input an ArrayList alist and an integer x
    public static Integer search(ArrayList<Integer> alist, int x) {

        // if integer x is found in array list alist, return index
        if (alist.contains(x)) {

            return alist.indexOf(x);

        // if not found, return -1
        } else {

            return -1;
        }

    }

    public static void main(String[] args) {

        //made HW example list
        ArrayList<Integer> alist = new ArrayList<Integer>();
        //Eg. 3, 45, 1, 2, 99
        alist.add(3);
        alist.add(45);
        alist.add(1);
        alist.add(2);
        alist.add(99);

        Scanner input= new Scanner(System.in);

        System.out.println("Enter an integer value for x:");

        int x = input.nextInt();

        // return value based on the search method output
        System.out.println("Returns: " + search(alist,x));


        }


    }
