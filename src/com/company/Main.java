// Write a program which creates and initializes all primitive data types.
//      All primitives data type should be created and initialized.
//      There are 8 primitive data types.



package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 127;                             // (целые числа, 1 байт) от -128 до 127
        short myShort = -32768;                        // (целые числа, 2 байта) от -32768 до 32767
        int  myInt = 2147483647;                       // (целые числа, 4 байта) от -2147483648 до 2147483647
        long myLong = 9223372036854775807L;            //(целые числа, 8 байтов) от -9223372036854775808L до 9223372036854775807L
        float myFloat = 4564.12123f;                   //(вещественные числа, 4 байта) от 1.4e-45f до 3.4e+38f
        double myDouble = 42234234.4234234d;           //(вещественные числа, 8 байтов) от 4.9e-324 до 1.7e+308
        char myChar = 'a';                             //(символ Unicode, 2 байта)
        boolean myBoolean = true;                      // (значение истина/ложь, 1 байт)
    }
}
