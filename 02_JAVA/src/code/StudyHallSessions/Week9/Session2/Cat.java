package code.StudyHallSessions.Week9.Session2;

public class Cat {
//    cat class:
//    data/attributes: instance variables
//    name, color, age
//    actions: instance methods
//    sleep(), eat(), drink() , move()

    String name;
    String color;
    Double age;

    String setName(String name){
        this.name=name;
        return name;
    }
    String setColor(String color){
        this.color=color;
        return color;
    }
    Double setAge(Double age){
        this.age=age;
        return age;
    }

    void sleep(){
        System.out.println(name+"is sleeping now");
    }
    void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    void drink(String drink){
        System.out.println(color+" "+name+" is drinking "+drink);
    }
    void move(String action){
        System.out.println(color+" "+name+" "+action);
    }

    public String toString(){

        return "Name is "+name+" Age is "+age+" Color is "+color;
    }
}
