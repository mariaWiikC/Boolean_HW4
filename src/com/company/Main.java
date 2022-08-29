package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int i = 1;
        boolean found = false;

        while (!found)
        {
            if (i % 387 == 0 && i % 6381 == 0)
            {
                System.out.println(i);
                found = true;
            }
            else
                i++;
        }
    }
}
