package student.Yousef;

public class Lab3 {
    public static void main(String[] args) {
        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC


        String answer="";

        String name ="AAABBBCCC";

        for (int i = 0; i < name.length(); i++) {

            int count=0;
            for (int j = 0; j < name.length();j ++) {

                if(name.charAt(i)==name.charAt(j)){

                    count++;
                }

            }
            if(count==3){

                answer+=name.charAt(i);
            }

        }
        System.out.println(answer);

        }

    }