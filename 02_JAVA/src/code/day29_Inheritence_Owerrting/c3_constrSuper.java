package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting;

class test3{
    int number=25;

    public test3(int i){
        System.out.println("i = " + i );
    }
    public test3(){
        System.out.println("test3 default");
    }

    public void method1(){
        System.out.println("hello method1");
    }


}
public class c3_constrSuper extends test3{
    // inherited
    // number , method1 , test3 const

    public c3_constrSuper(){
        super(2);
        System.out.println("default c3 cons");
    }

    public static void main(String[] args) {
        c3_constrSuper obj=new c3_constrSuper();
    }

}

///this keyword is used for calling in same class
//super keyword help us to call from parent