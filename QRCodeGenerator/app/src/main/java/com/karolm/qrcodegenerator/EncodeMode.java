package com.karolm.qrcodegenerator;

/**
 * When the input string consists only decimal digits (0-9) use numeric.
 *
 * When numeric mode is not applicable, use alphanumeric. Lowercase cannot be
 *  encoded in alphanumeric. Only uppercase.
 *
 * When can be encoded in ISO 8859-1 but can't be encoded in above ways use
 *  byte mode.
 *
 * When all characters are in Shift JIS use Kanji.
 */

public enum EncodeMode {
    NUMERIC,        //7089 CHARACTERS   0001 1
    ALPHANUMERIC,   //4296 CHARACTERS   0010 2
    BYTE,           //2953 CHARACTERS   0100 4
    KANJI,          //1817 CHARACTERS   1000 8
    ECI             //                  0111 7
}
