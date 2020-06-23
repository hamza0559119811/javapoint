package com.javapoint;

class TestStudent6 {
    int id;
    String name;
    //parameterized  constructor
    TestStudent6(int i, String n){
        id = i;
        name = n;
    }   
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        TestStudent6 s1 = new TestStudent6(45, "Natasha");
        TestStudent6 s2 = new TestStudent6(46, "Peter");

        s1.display();
        s2.display();
    }
}