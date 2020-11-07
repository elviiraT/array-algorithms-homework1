package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] array = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;
        int lo = 0;
        int hi = array.length-1;
        boolean found = false;
        while (!found && lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int midval = array[mid];
            System.out.println(midval);
            if (midval == key)
                found = true;
            else if (midval > key)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        System.out.println(found);
    }
}
