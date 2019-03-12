package com.tytarenko;

public interface NumberOperations<T extends Number> extends Operations<T> {

    T subtraction();
    T multiplication();
    T division();

}
