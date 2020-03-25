package com.karolm.qrcodegenerator;

import java.util.HashMap;
import java.util.Map;

public class AlphanumericTable {
    public static final Map<Character, Integer> alphanumericTable = new HashMap<Character, Integer>() {{
        put('0', 0);   put('1', 1);   put('2', 2);   put('3', 3);
        put('4', 4);   put('5', 5);   put('6', 6);   put('7', 7);
        put('8', 8);   put('9', 9);   put('A', 10);  put('B', 11);
        put('C', 12);  put('D', 13);  put('E', 14);  put('F', 15);
        put('G', 16);  put('H', 17);  put('I', 18);  put('J', 19);
        put('K', 20);  put('L', 21);  put('M', 22);  put('N', 23);
        put('O', 24);  put('P', 25);  put('Q', 26);  put('R', 27);
        put('S', 28);  put('T', 29);  put('U', 30);  put('V', 31);
        put('W', 32);  put('X', 33);  put('Y', 34);  put('Z', 35);
        put(' ', 36);  put('$', 37);  put('%', 38);  put('*', 39);
        put('+', 40);  put('-', 41);  put('.', 42);  put('/', 43);
        put(':', 44);
    }};
}
