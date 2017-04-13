package com.leet.www;

import java.util.Iterator;
import java.util.List;

public class MedTriangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        Iterator<List<Integer>> outer = triangle.iterator();
        //Iterator List<Integer> inner = outer.getIterator();
        //get the minimum in each inner list
        int path1 = 0;
        List<Integer> last = triangle.get(triangle.size()-1);
        int min1 = 999;
        int initial_position = 0;
        int counter = 0;
        for(Integer i : last)
        {
            if(i < min1)
            {    
                min1 = i;
                initial_position = counter;
            }
            counter++;
        }
        path1+=min1;
        int size = triangle.size()-1;
        int n2 = 999;
        int n1 = 999;
        while(size > 0)
        {
            List<Integer> innerNow = triangle.get(size);
            List<Integer> innerPrev = triangle.get(size-1);
            System.out.println(initial_position);
            System.out.println(innerNow);
            System.out.println(innerPrev);
            if(initial_position == 0)
            {
                n2 = innerPrev.get(initial_position);
                //no n1
                n1 = 99;
            }
            else if(initial_position == innerPrev.size())
            {
                n1 = innerPrev.get(initial_position-1);
                //no n2
                n2 = 99;
            }
                
            else
            {
                n1 = innerPrev.get(initial_position-1);
                n2 = innerPrev.get(initial_position);
            }
            //int n1 = innerPrev.get(initial_position);
            System.out.println(initial_position);
            //if(initial_position > 0)
            //    n2 = innerPrev.get(initial_position-1);
            int min = Math.min(n1,n2);
            path1+= min;
            System.out.println("down to up min-- "+min);
            initial_position = innerPrev.indexOf((Integer) min);
            size--;
        }
        
        int path2 = 0;
        path2+= triangle.get(0).get(0);
        initial_position = 0;
        counter = 0;
        while(outer.hasNext() && counter< triangle.size() - 1)
        {
            //get the i and i+1 position and check which is minimum
            List<Integer> innerNow = triangle.get(counter);
            List<Integer> innerNext = triangle.get(counter+1);
            n1 = innerNext.get(initial_position);
            n2 = innerNext.get(initial_position+1);
            int min = Math.min(n1,n2);
            path2+= min;
            System.out.println("up to down min--  "+min);
            initial_position = innerNext.indexOf((Integer) min);
            counter++;
        }
        return Math.min(path1,path2);
    }
}
