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
public class OperasiSederhanaTest {
     @Test
    public void testPenjumlahan() {
        int a = 5, b = 3;
        int expected = 8;
        assertEquals(expected, a + b);
    }

    @Test
    public void testPengurangan() {
        int a = 10, b = 4;
        int expected = 6;
        assertEquals(expected, a - b);
    }

    @Test
    public void testPerkalian() {
        int a = 7, b = 6;
        int expected = 42;
        assertEquals(expected, a * b);
    }

    @Test
    public void testPembagian() {
        double a = 12, b = 4;
        double expected = 3.0;
        assertEquals(expected, a / b);
    }

    @Test
    public void testPangkat() {
        int basis = 2, eksponen = 3;
        double expected = 8.0;
        assertEquals(expected, Math.pow(basis, eksponen));
    }
}
