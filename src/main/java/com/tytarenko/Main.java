package com.tytarenko;

public class Main
{
    public static void main( String[] args ) {
        Operations s = new StringOperations("First", "Second");
        System.out.println(s.add());

        Operations i = new IntegerOperation(1,2);
        System.out.println(i.add());

        NumberOperations no = new IntegerOperation(1,0);
        System.out.println(no.division());
        System.out.println(no.add());
        System.out.println(no.multiplication());
        System.out.println(no.subtraction());
    }
}
