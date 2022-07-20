package student.Oscar;

public class lab13 {

        //String -- Frequency of Characters
        //Write a return method that can find the frequency of characters
        public static void main(String[] args) {
                String str = "sccchhhhooooll";
                int[]array = new int[str.length()];
                int i, j;
                char string[]= str.toCharArray();
                for ( i = 0; i<str.length(); i++){
                        array[i]=1;
                        for( j=i+1; j<str.length(); j++){
                                if (string[i]==string[j]){
                                        array[i]++;
                                        string[j]='0';
                                }

                        }

                }
                for ( i = 0; i< array.length; i++){
                        if (string[i]!=' '&& string[i]!='0'){
                                System.out.println(string[i]+ "=" + array[i]);
                        }
                }


        }

    }
