package com.mainacad;

import com.mainacad.service.Multiplication;

import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER=Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {
        Multiplication result=new Multiplication();
        Multiplication downLine=new Multiplication();
        int number1=12345;
        int number2=123;
        Multiplication freeSpace=new Multiplication();
        LOGGER.info("Multiplication result of 12345 by 123 is \n"
                +freeSpace.getFreeSpaceBetweenTwoNumbers(result.getNumberByMultiplication(number1,number2),number1)+number1+"\n"
                +freeSpace.getFreeSpaceBetweenTwoNumbers(result.getNumberByMultiplication(number1,number2),number2)+number2+"\n"
                +freeSpace.getFreeSpaceBetweenTwoNumbers(result.getNumberByMultiplication(number1,number2),number1)+downLine.getDownLine(number1)+"\n"
                +freeSpace.getFreeSpaceBetweenTwoNumbers(result.getNumberByMultiplication(number1,number2),number1)+result.getNumberByMultiplication(number1,3)+"\n"
                +" "+result.getNumberByMultiplication(number1,2)+" \n"
                +result.getNumberByMultiplication(number1,1)+"\n"
                + downLine.getDownLine(result.getNumberByMultiplication(number1,number2))
                +"\n"
                +result.getNumberByMultiplication(number1,number2));
    }
}
