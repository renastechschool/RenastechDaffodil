package student.Bora;

import java.lang.reflect.Array;
import java.util.*;

public class lab00All {public static void main(String[] args) {} }
class lab01{
    public static void main(String[] args) {
        String a="MBA";
        String rev="";
       for (int i=a.length()-1;i>=0;i--){
           rev+=a.charAt(i);
       }
        System.out.println(rev);
    }
}



class lab02{
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
    }
    public static boolean same(String a, String b){
        boolean b1=false;
        int count=0;
        for (int i=0;i<=a.length()-1;i++){
            for (int j=0;j<=b.length()-1;j++){
                if (a.charAt(i)==b.charAt(j)){
                    count++;
                    break;
                }}}
        if (count==a.length()){
            b1=true;
        }
        return b1;
    }}





class lab03{
    public static void main(String[] args) {
            System.out.println( dublicate("BAAABBBCCC"));
        }
        public static String dublicate (String name) {
            String ww="";
            for (int i =0; i< name.length(); i++){
                if(ww.contains(name.charAt(i)+"")){
                }else {
                    ww+=name.charAt(i);
                }
            }
            return ww;
    }
}


class lab04{

    public static void main(String[] args) {
        System.out.println( dublicate("BAAABBBCCCDEF"));
    }
    public static String dublicate (String name) {
        String ww="";
        for (int i =0; i< name.length(); i++){
            int tem=0;
            for (int j=0;j<name.length();j++){
            if(name.charAt(i)==name.charAt(j)){
                tem++;
             }
            }
            if (tem==1){
                ww+=name.charAt(i);
            }
        }
        return ww;
    }
}



class lab05{
    public static void main(String[] args) {
        int[] arr={123,545,76,5644,5};
        int max=arr[0];
        for (int maxr:arr) {
            if (max<=maxr){
                max=maxr;
            }
        }
        System.out.println(max);
    }
}



class lab06{
    public static void main(String[] args) {
        int[] arr={123,545,76,5644,5};
        int min=arr[0];
        for (int minr:arr) {
            if (min>=minr){
                min=minr;
            }
        }
        System.out.println(min);
    }
}



class lab07{
    public static void main(String[] args) {
        String[] arr1={"h","el","lo"};
        String[] arr2={"m","s","k"};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }
public static String[] concat(String[] a,String[] b){
    String[] c=new String[a.length+b.length];
    for(int i=0; i<a.length;i++){
        c[i]=a[i];
    }
    for (int i=a.length;i<a.length+b.length;i++){
        c[i]=b[i-a.length];
    }
    return c;
}
}




class lab08{
    public static void main(String[] args) {
        int[] arr={324,34,453,32,432};
        System.out.println(Arrays.toString(sor(arr)));
    }
public static int[] sor(int[] arr){
        Arrays.sort(arr);
        return arr;
}
}



class lab09{
    public static void main(String[] args) {
        int[] arr={324,34,453,32,432};
        System.out.println(Arrays.toString(sor(arr)));
    }
    public static int[] sor(int[] arr){
        int max=arr[0];
       for (int i=0; i< arr.length ;i++){
           for (int j=0;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   max=arr[i];
                   arr[i]=arr[j];
                   arr[j]=max;
               }
           }
       }
        return arr;
    }



}




class lab10{
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("Let me see your number");
            int a=input.nextInt();
            if(a%3==0&&a%5==0){
                System.out.println("FinRa");
            }else if((a%3==0)){
                System.out.println("Fin");
            }else if((a%5==0)){
                System.out.println("Ra");
            }
        }}





class lab11{
    public static void main(String[] args) {
        System.out.println("Divisibleby15");
        int i = 0;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Divisibleby3");
        i = 0;
        while (i <= 100) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Divisibleby5");
        i = 0;
        while (i <= 100) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }}



class lab12{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Gimme your number");
            int number = input.nextInt();

            System.out.println(evod(number));
        }
            public static String evod(int number){
            String result="";
            if(number%2==0){
                result="number even";
            }else{
                result="number odd";
            }
            return result;
        }
}



class lab13{
    public static void main(String[] args) {
        String name="how often we do";
        freq(name);
    }
    public static int freq(String a){
        for (int i=0;i<a.length();i++){
            int count=0;
            for (int j=0;j<a.length();j++){
                if (a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }System.out.println(a.charAt(i)+" freq is ="+count);
        }
        int c=0;
        return c;
    }


}


class lab14{
    public static void main(String[] args) {
        String some="6there7are6somany3";
        System.out.println(sum(some));
    }
    public static int sum(String a){
        int sum=0;
        for (int i=0; i<a.length();i++) {
         if (a.charAt(i)>=48&&a.charAt(i)<=57){
             sum+=Integer.parseInt(a.charAt(i)+"");
         }
        }
        return sum;
    }


}


class lab15{
    /*
    public static void main(String[] args) {
        String some="6there7are6somany3";
        System.out.println(sum(some));
    }
    public static int sum(String a){

        int max=0;
        for (int i=0; i< a.length() ;i++){
            for (int j=0;j<a.length();j++){
                if(a.charAt(i)>a.charAt(j)){
                    max=a.charAt(i);
                    a.charAt(i)=a.charAt(j);
                    a.charAt(j)=max;
        return max;
    }
}}}*/}
class lab16{
    public static void main(String[] args) {
        String psw="Ar*512435";
        System.out.println(psw(psw));
    }
    public static boolean psw(String a){
        boolean bo=true;
    if (!(a.length()>=6)){
        bo=false;
    }
    int tem=0;
    for (int i=0;i<a.length();i++){
        if (a.charAt(i)>=65&&a.charAt(i)<=90){
            tem++;
        }
    }
    if (tem==0){
        bo=false;
    }


        int tem2=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)>=97&&a.charAt(i)<=122){
                tem2++;
            }
        }
        if (tem2==0){
            bo=false;
        }



        int tem3=0;
        for (int i=0;i<a.length();i++){
            if ((a.charAt(i)>=32&&a.charAt(i)<=47)||(a.charAt(i)>=58&&a.charAt(i)<=64)||(a.charAt(i)>=91&&a.charAt(i)<=96)||(a.charAt(i)>=123&&a.charAt(i)<=126)){
                tem3++;
            }
        }
        if (tem3==0){
            bo=false;
        }



        int tem4=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)>=48&&a.charAt(i)<=57){
                tem4++;
            }
        }
        if (tem4==0){
            bo=false;
        }



        return bo;
    }
}
class lab17{

    public static void main(String[] args) {
        int[] zer={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(zero(zer)));
    }
    public static int[] zero(int[]a){
        int count=0;
        int[] arr2=new int[a.length];
        for (int i=0; i<a.length;i++){
            if (a[i]==0){
                count++;
            }else {
                arr2[i-count]=a[i];
            }

        }

        for (int i=a.length-1; i>=a.length-count;i--){
            arr2[i]=0;
        }
        return arr2;
    }
}
class lab18{
    public static void main(String[] args) {
        int numb=4;
        System.out.println(fak(numb));
    }
    public static int fak(int a) {
        int fak=1;
        for (int i = a;i>=1;i-- ){
            fak*=i;
        }
        return fak;
    }
}
class lab19{
    public static void main(String[] args) {
        int a=0; int b=1; int sum=1;
        System.out.println(sum);
        for (int i=0;i<=44;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
}}}
class lab20{
  public static void main(String[]args){
      int a=2;
      int b=3;
      a=a*b;
      b=a/b;
      a=a/b;
      System.out.println(a);
      System.out.println(b);
  }

}
class  lab21{
    public static void main(String[] args) {
        System.out.println(div(6,2));
    }
    public static int div(int a, int b){
        int result=0;
        for (int i=a;i>=0;i--){
            if(a>=b){
                a=a-b;
                result++;
            }
        }
        return result;
    }
}
class  lab22{
   // Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        System.out.println(absulute(-4));
    }
    public static int absulute(int a){
        return Math.abs(a);
    }
}
class  lab23{
    //    Given a list of people' names: "Amed",  "Eric""John", "Eric", "Amed" , "Eric" .
    //        Write a java operation to remove all the names named , "Eric"
    public static void main(String[] args) {
       // String[] peoplenames={"Amed", "Eric", "John", "Eric", "Amed", "Eric"};

    ArrayList<String> pnames=new ArrayList<>();
    pnames.addAll(Arrays.asList("Amed", "Eric", "John", "Eric", "Amed", "Eric"));
    pnames.removeAll(Arrays.asList("Eric"));


        System.out.println(pnames);
    }
}

class lab24{
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
                list.addAll(Arrays.asList(3,45532,325,2,3,3243,102));
       for (int i=0;i<list.size();i++) {
          if (list.get(i)>100){
              System.out.println(list.get(i));
              list.remove(i);
              i--;
          }

       }
        System.out.println(list);
    }
}

class lab25{
    // Write a method that can sort the ArrayList in Ascending order without using the sort method
    public static void main(String[] args) {
       List<Integer> mixList=new ArrayList<>();
        mixList.addAll(Arrays.asList(34,14,4452,2340,45,425,12));

        System.out.println(order(mixList));
    }
   public static List<Integer> order(List<Integer> ord){
       for (int j=0;j<ord.size();j++){
           for (int i=ord.size()-1;i>j;i--) {
               if (ord.get(j)>ord.get(i)){
                   int min=ord.get(j);
                   ord.set(j,ord.get(i)) ;
                   ord.set(i,min);
               }}}
        return ord; }

}

class lab26{
    //Write a method that can sort the ArrayList in descending order without using the sort method
    public static void main(String[] args) {
        List<Integer> mixList=new ArrayList<>();
        mixList.addAll(Arrays.asList(34,14,4452,2340,45,425,12));

        System.out.println(order(mixList));
    }
    public static List<Integer> order(List<Integer> ord){
        for (int j=0;j<ord.size();j++){
            for (int i=ord.size()-1;i>j;i--) {
                if (ord.get(j)>ord.get(i)){
                    int min=ord.get(j);
                    ord.set(j,ord.get(i)) ;
                    ord.set(i,min);
                }}}
        return ord; }

    }
