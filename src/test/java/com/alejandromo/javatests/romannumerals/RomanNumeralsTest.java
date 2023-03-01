package com.alejandromo.javatests.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void return_number_roman_I() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
    }
    @Test
    public void return_number_roman_II() {
        assertEquals("II", RomanNumerals.arabicToRoman(2));
    }
    @Test
    public void return_number_roman_III() {
        assertEquals("III", RomanNumerals.arabicToRoman(3));
    }
    @Test
    public void return_number_roman_IV() {
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
    }
    @Test
    public void return_number_roman_V() {
        assertEquals("V", RomanNumerals.arabicToRoman(5));
    }
    @Test
    public void return_number_roman_VI() {
        assertEquals("VI", RomanNumerals.arabicToRoman(6));
    }
    @Test
    public void return_number_roman_VII() {
        assertEquals("VII", RomanNumerals.arabicToRoman(7));
    }
    @Test
    public void return_number_roman_X() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));
    }
    @Test
    public void return_number_roman_XI() {
        assertEquals("XI", RomanNumerals.arabicToRoman(11));
    }
    @Test
    public void return_number_roman_XIV() {
        assertEquals("XIV", RomanNumerals.arabicToRoman(14));
    }
    @Test
    public void return_number_roman_XV() {
        assertEquals("XV", RomanNumerals.arabicToRoman(15));
    }
    @Test
    public void return_number_roman_XVI() {
        assertEquals("XVI", RomanNumerals.arabicToRoman(16));
    }
    @Test
    public void return_number_roman_L() {
        assertEquals("L", RomanNumerals.arabicToRoman(50));
    }
    @Test
    public void return_number_roman_LI() {
        assertEquals("LI", RomanNumerals.arabicToRoman(51));
    }
    @Test
    public void return_number_roman_LV() {
        assertEquals("LV", RomanNumerals.arabicToRoman(55));
    }
    @Test
    public void return_number_roman_LVI() {
        assertEquals("LVI", RomanNumerals.arabicToRoman(56));
    }
    @Test
    public void return_number_roman_LX() {
        assertEquals("LX", RomanNumerals.arabicToRoman(60));
    }
    @Test
    public void return_number_roman_LXX() {
        assertEquals("LXX", RomanNumerals.arabicToRoman(70));
    }
    @Test
    public void return_number_roman_LXXX() {
        assertEquals("LXXX", RomanNumerals.arabicToRoman(80));
    }
    @Test
    public void return_number_roman_LXXXI() {
        assertEquals("LXXXI", RomanNumerals.arabicToRoman(81));
    }
    @Test
    public void return_number_roman_LXXXV() {
        assertEquals("LXXXV", RomanNumerals.arabicToRoman(85));
    }
    @Test
    public void return_number_roman_LXXXVI() {
        assertEquals("LXXXVI", RomanNumerals.arabicToRoman(86));
    }
    @Test
    public void return_number_roman_CXXVI() {
        assertEquals("CXXVI", RomanNumerals.arabicToRoman(126));
    }
    @Test
    public void return_number_roman_CD() {
        assertEquals("CD", RomanNumerals.arabicToRoman(400));
    }
    @Test
    public void return_number_roman_MMDVII() {
        assertEquals("MMDVII", RomanNumerals.arabicToRoman(2507));
    }
}