package student.Gulistan;
 //Swap two variable' values without using a third variable
public class lab20 {

  public static void main(String[] args) {
   int first = 5;
   int second = 10;

   System.out.println(first+" " + second);

   first = first + second;
   second = first- second;
   first = first - second;

   System.out.println(first+" " + second);

  }
}
