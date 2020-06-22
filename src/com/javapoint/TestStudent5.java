package com.javapoint;
// default constructor class
 class TestStudent5 {
     int id;
     String name;
     void display(){
         System.out.println(id+" "+name);
     }

     public static void main(String args[]){
         TestStudent5 s1=new TestStudent5();
         TestStudent5 s2=new TestStudent5();
         s1.display();
         s2.display();
     }
    
}