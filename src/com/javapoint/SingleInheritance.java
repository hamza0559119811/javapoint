package com.javapoint;

class Animal{
    void eat(){
        System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}
class GermanShepherd extends Dog {
    void name(){
        System.out.println("German Shepherd");
    }
}


class SingleInheritance {
    public static void main(String args[]){
        GermanShepherd d=new GermanShepherd();
        d.bark();
        d.eat();
        d.name();
    
}