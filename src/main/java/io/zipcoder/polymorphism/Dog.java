package io.zipcoder.polymorphism;

public class Dog extends Pet{


    ;

    public Dog(String name) {
        super(name);
//        this.name = "Dog";
    }
//    public Dog(String name){
//
//        this.name = name;
//    }
//
////    public  void setName(String name){
////        this.name = name;
////    }
//
//    public String getName(){
//
//        return name;
//    }
@Override
    public String speak(){
        return "Bark";
    }

}
