package com.company;

public class TooSmallSalaryException extends Exception {

    double salary;

    TooSmallSalaryException(double salary) {
        this.salary = salary;
    }
}
