package com.javapoint;

class TestStudent8 {
    int id;
    String name;
    //constructor to initialize integer and String
    TestStudent8(int i, String n){
        id = i;
        name = n;
    }
    //constructor to initialize another object 
    TestStudent8(TestStudent8 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        TestStudent8 s1 = new TestStudent8(87,"Aquaman");
        TestStudent8 s2 = new TestStudent8(s1);
        s1.display();
        s2.display();
    }
}