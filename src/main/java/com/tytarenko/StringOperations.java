package com.tytarenko;

public class StringOperations implements Operations<String> {

    private String a;
    private String b;

    public StringOperations(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String add() {
        return a.concat(b);
    }
}
