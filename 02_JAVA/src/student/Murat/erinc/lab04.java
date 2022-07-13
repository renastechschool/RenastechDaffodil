package student.Murat.erinc;

public class lab04 {
    public static void main(String[] args) {

        unique("AAABBBCCCDEF");


    }



    public static void unique(String name){
        String [] split=name.split("");
        for (int i = 0; i < split.length ; i++) {
            int count=0;
            for (int j = 0; j < split.length ; j++) {
                if (split[i].equals(split[j])){
                    count++;
                }

            }
            if (count==1){
                System.out.println(split[i]+ " is unique");
            }

        }
    }


}
