package com.mainacad.service;

public class Multiplication {
    public static int getNumberByMultiplication(int number1,int number2){
     return number1*number2;
    }
    public static String getDownLine(int result){
     String symbol="-";
     int remainder=0;
     while(result>0){
         result=result/10;
         remainder++;
     }
     for(int i=0;i<remainder-1;i++){
         symbol=symbol.concat("-");
     }
     return symbol;
    }
    public static String getFreeSpaceBetweenTwoNumbers(int number1,int number2){
        String symbol=" ";
        int remainder1=0;
        int remainder2=0;
        while(number1>0){
            number1=number1/10;
            remainder1++;
        }
        while(number2>0){
            number2=number2/10;
            remainder2++;
        }
        remainder1-=remainder2;
        for(int i=0;i<remainder1-1;i++){
            symbol=symbol.concat(" ");
        }
        return symbol;
    }

}
