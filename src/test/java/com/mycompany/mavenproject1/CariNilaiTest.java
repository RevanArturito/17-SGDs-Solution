/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CariNilaiTest {
    
    @Test
    public void testCariMax() {
        int a = 10, b = 20;
        int expected = 20;
        assertEquals(expected, Math.max(a, b));
    }

    @Test
    public void testCariMin() {
        int a = 10, b = 20;
        int expected = 10;
        assertEquals(expected, Math.min(a, b));
    }

    @Test
    public void testCekGanjil() {
        int angka = 7;
        assertTrue(angka % 2 != 0);
    }

    @Test
    public void testCekGenap() {
        int angka = 8;
        assertTrue(angka % 2 == 0);
    }

    @Test
    public void testCekPositifNegatif() {
        int angka = -5;
        assertTrue(angka < 0);
    }
    
}
