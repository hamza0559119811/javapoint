package com.javapoint;

public class TestEncapsulation {
    public static void main(String[] args) {
        TestEnc s= new TestEnc();
        s.SetId("one");
        s.SetName("tony");
        System.out.println(s.GetName());
        System.out.println(s.GetId());
    }
}