package com.tytarenko;

public class IntegerOperation implements NumberOperations<Integer> {

    private Integer a;
    private Integer b;

    public IntegerOperation(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer add() {
        return a + b;
    }

    @Override
    public Integer subtraction() {
        return a - b;
    }

    @Override
    public Integer multiplication() {
        return a * b;
    }

    @Override
    public Integer division() {
        return a / b;
    }
}
