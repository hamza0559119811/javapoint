package com.javapoint;


class Bank{
    int getRateOfInterest(){
        return 5;
    }
}
class HBL extends Bank{
    int getRateOfInterest()
    {return 9;}
}
class NBP extends Bank{
    int getRateOfInterest()
    {return 4;}
}
class UBL extends Bank{
    int getRateOfInterest(){
        return 3;
    }
}
class TestMethodOverriding {
    public static void main(String[] args) {
        
    
    HBL s=new HBL();
    NBP a=new NBP();
    UBL w=new UBL();
    
    System.out.println("HBL rate of interest is "+s.getRateOfInterest());
    System.out.println("NBP rate of interest is "+a.getRateOfInterest());
    System.out.println("UBL rate of interest is "+w.getRateOfInterest());
}
}