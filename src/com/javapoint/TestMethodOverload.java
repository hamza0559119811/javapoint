package com.javapoint;
class Adder{
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a , int b , int c){
        return a+b+c;
    }
    static double add(double a , double b){
        return a+b;
    }
}
class TestMethodOverload {
    public static void main(String[] args) {
        System.out.println(Adder.add(16, 34));
        System.out.println(Adder.add(16, 34, 54));
        System.out.println(Adder.add(16, 34.4));
    }
    
}