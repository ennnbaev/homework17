package com.company;

public class ImpossibleNameException extends Exception {
    String input;

    ImpossibleNameException(String input) {
        this.input = input;
    }
}