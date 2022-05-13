package student.EgeGunege;

public class lab16 {
    public static boolean password(String pass){
        boolean b1=false;
        boolean b2=false;
        boolean b3=false;
        boolean b4=false;

        if(pass.length()>=6&&!pass.contains(" ")){
            for (int i = 0; i < pass.length(); i++) {
                if(pass.charAt(i)>=65&&pass.charAt(i)<=95){
                    b1=true;
                }
                if(pass.charAt(i)>=97&&pass.charAt(i)<=122){
                    b2=true;
                }
                if((pass.charAt(i)>=33&&pass.charAt(i)<=47)||(pass.charAt(i)>=58&&pass.charAt(i)<=64)||(pass.charAt(i)>=91&&pass.charAt(i)<=96)||(pass.charAt(i)>=123&&pass.charAt(i)<=126)){
                    b3=true;
                }
                if (pass.charAt(i)>=48&&pass.charAt(i)<=57){
                    b4=true;
                }
            }
        }else {
            return false;
        }
        return b1&&b2&&b3&&b4;


    }

    public static void main(String[] args) {
        System.out.println(password("1234EgGu?"));
        System.out.println(password("123456"));
        System.out.println(password("Halil4"));
    }
}
