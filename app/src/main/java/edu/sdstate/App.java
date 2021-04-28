package edu.sdstate;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class App
{
    public static int numOfColor = 3; //TODO whats the answer when the num of color is 1
    public static int maxLength = 100;

    public static ArrayDeque<String> stack = new ArrayDeque<>();
    public static HashMap<Integer, ArrayList<Integer>> solutions = new HashMap<>(); //TODO Make it ArrayList of ArrayList

    public static void main(String[] args)
    {
        // building the dictionary
        for (int x = 1; x <= maxLength; x++)
        {
            solutions.put(x, new ArrayList<>());

            for (int i = 1; i <= x / 2; i++)
                for (int j = 1; j <= x; j++)
                {
                    if (i + j == x)
                    {
                        solutions.get(x).add(i);
                        solutions.get(x).add(j);
                    }
                }
        }
//        System.out.println(Arrays.asList(solutions));
        System.out.println("Completed building solutions.");


        // Possible cause of slowdown
        // Using string
        for(int i = numOfColor-1 ; i>=0; i--)
            stack.push(Integer.toString(i));

        ArrayList<String> avoidMC = new ArrayList<>();
        while (!stack.isEmpty())
        {
            // check monochromatic
            String temp = stack.pop();
            if (isMonochromatic(temp))
                continue;
            else
            {
                if(avoidMC.isEmpty() || temp.length() == avoidMC.get(0).length()) // if the list is empty continue, otherwise compare length with the first item
                    avoidMC.add(temp);
                else if(temp.length() > avoidMC.get(0).length()) // the new one could be smaller hence the if condition
                {
                    avoidMC.clear();
                    avoidMC.add(temp);
                }
            }

            // continue building the tree
            for(int j = numOfColor-1 ; j>=0; j--){
                stack.push(temp + j);
            }

            if(stack.peek().length() >= maxLength) // TODO: test if the inequality is accurate; NPE warning - investigate
                break;
        }

        // print the result
        System.out.println(avoidMC);
    }

    public static boolean isMonochromatic(String str)
    {
        ArrayList<Integer> positions = solutions.get(str.length());
        if (positions.size() != 0)
            for (int i = 0 ;i < positions.size(); i = i+2)
            {
                // check c(x1) == c(x2) and c(x2) == c(x3)
                if(str.charAt(positions.get(i)-1) == str.charAt(positions.get(i+1)-1) &&
                        str.charAt(positions.get(i)-1) == str.charAt(str.length()-1))
                    return true;
            }
        return false;
    }
}
