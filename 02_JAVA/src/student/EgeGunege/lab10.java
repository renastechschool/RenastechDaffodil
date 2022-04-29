package student.EgeGunege;

public class lab10 {
    public static void FINRA(int i,int k){
        String result="";
        for (int j=i;j<=k;j++){
            if((j%3==0)&&(j%5==0)){
                result=j+". FINRA";
            }else if(j%3==0){
                result=j+". FIN";
            }else if(j%5==0){
                result=j+". RA";
            }else{
                result=""+j;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        FINRA(1,30);
    }
}
