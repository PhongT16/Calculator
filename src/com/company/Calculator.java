package com.company;

public class Calculator {
    final private int numberLength = 3;
    private double numberOne = 0;
    private double numberTwo = 0;
    private String operation;

    private String userInput;
    public Calculator() {
        userInput = "None";
    }

    public double calculate(String input) throws Exception {

        if (parseInput(input)) {
            if (operation.equals("+")) {
                return add();
            } else if (operation.equals("-")) {
                return subtract();
            } else if (operation.equals("*")) {
                return multiply();
            } else {
                return divide();
            }
        }
        return 0;
    }

    private boolean parseInput(String input) throws Exception {
        String[] inputArray = input.split(" ");

        try {
            numberOne = Integer.parseInt(inputArray[0]);
            numberTwo = Integer.parseInt(inputArray[2]);
        } catch (Exception e) {
            throw new Exception("Exception found");
        }
        operation = inputArray[1];
        return true;

    }

    private double add() {
        return numberOne + numberTwo;
    }

    private double subtract() {
        return numberOne - numberTwo;
    }

    private double multiply() {
        return numberOne * numberTwo;
    }

    private double divide() {
        return numberOne / numberTwo;
    }
}
