## Lab 01 - //(String) Reverse
            //Write a return method that can reverse  String
            //Ex: Reverse("ABCD"); ==> DCBA   

ublic class lab1 {
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA
public static void main(String[] args) {

            Scanner elements = new Scanner(System.in);
            System.out.println("Enter String Word : ");

            String  word = elements.nextLine();

            for(int i=word.length()-1 ; i>=0; i--) {

                System.out.print(word.charAt(i));
            }
        }
    }
