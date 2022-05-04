package code.StudyHallSessions.Week9.Session3;

public class JavaInterviewQuestionPractice {
    public static void main(String[] args) {
        //    (String) Frequency of Characters
        //    String -- Frequency of Characters
        //    Write a return method that can find the frequency of characters
        //
        //    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        // A=3People
        // B=5 people
        String str="AAABBCDD";
        // First we wanna capture unique letters >>> "ABCD"
        System.out.println(frequencyOfChars(str)); //Solution 1
        System.out.println(frequencyofChars2(str));//Solution 2

    }
    //Solution 1
    public static String frequencyOfChars(String str){
        String nonDup="";//null
        for(int i=0; i< str.length(); i++){// A A
            if(!nonDup.contains(""+str.charAt(i))){//A // A
                nonDup+=""+str.charAt(i);//A ...
            }
        }
        String expectedResult="";
        for (int j=0; j < nonDup.length(); j++){
            int count=0;
            for( int i=0; i<str.length(); i++){
                if(str.charAt(i)==nonDup.charAt(j)){
                    count++;
                }
            }
            expectedResult+=nonDup.charAt(j)+""+count;
        }
        return expectedResult;
    }
    //Solution 2 - Incomplete
    public static String frequencyofChars2(String str){
        String expectedResult="";
        for(int j=0; j<str.length(); j++){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(j)){
                count++;//3
            }
        }//AAABBCDD
        expectedResult+=str.charAt(j)+""+count;//A3
            System.out.println(str);
                str=str.replace(""+str.charAt(j),"");//BBCDD
        }
        return expectedResult;
    }
}
