package student.Murat.erinc;

import java.util.Arrays;

public class lab15 {

    public static void main(String[] args) {

        String name="DC501GCCCA098911";

        String name1=name.substring(0,2);
        String name2=name.substring(2,5);
        String name3=name.substring(5,10);
        String name4=name.substring(10,16);


        String[] split1=name1.split("");
        String[] split2=name2.split("");
        String[] split3=name3.split("");
        String[] split4=name4.split("");

        Arrays.sort(split1);
        Arrays.sort(split2);
        Arrays.sort(split3);
        Arrays.sort(split4);


        String [] newList=new String[split1.length+split2.length+split3.length+split4.length];

        for (int i = 0; i <split1.length ; i++) {
            newList[i]=split1[i];
        }
        for (int i = 0; i < split2.length ; i++) {
            newList[split1.length+i]=split2[i];
        }
        for (int i = 0; i < split3.length ; i++) {
            newList[split2.length+split1.length+i]=split3[i];
        }
        for (int i = 0; i < split4.length; i++) {
            newList[split3.length+ split2.length+ split1.length+i]=split4[i];
        }
        System.out.println(Arrays.toString(newList));



















    }
}
