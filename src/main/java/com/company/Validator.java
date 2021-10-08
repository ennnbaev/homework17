package com.company;

public class Validator {
    public static void checkSalary(double salary) throws TooSmallSalaryException {
        if (salary < 0) {
            throw new TooSmallSalaryException(salary);
        }
    }
    public static void checkFio(String input) throws ImpossibleNameException {
        String regex = "[A-z]*";
        if (!input.matches(regex)||input.equals("")) {
            throw new ImpossibleNameException(input);
        }
    }
}