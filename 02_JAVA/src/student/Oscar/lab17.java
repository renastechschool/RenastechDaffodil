package student.Oscar;

import java.util.ArrayList;

public class lab17 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        System.out.println("sort(arr) = " + sort(arr));
    }

    public static ArrayList<Integer> sort(int[] a)
    {

        int count =0;
        ArrayList<Integer> second = new ArrayList<>();
        for(int i =0;i<a.length;i++)
        {
            if(a[i] ==0)
            {
                count++;
                continue;
            }
            else
            {
                second.add(a[i]);
            }
        }
        int min = second.get(0);
        for(int i =0;i<second.size()-1;i++)
        {
            int temp=0;
            if(second.get(i)> second.get(i+1))
            {
                temp = second.get(i);
                second.set(i,second.get(i+1));
                second.set(i+1,temp);
            }
        }
        for(int i=0;i<count;i++)
        {
            second.add(0);
        }
        return second;
    }


}


