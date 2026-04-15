package com.devxp.analyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link App}.
 */
class AppTest {

    @Test
    void testGetName() {
        App app = new App("TestApp");
        assertEquals("TestApp", app.getName());
    }

    @Test
    void testGreet() {
        App app = new App("World");
        assertEquals("Hello from DevXP Analyzer: World", app.greet());
    }

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(0, App.add(0, 0));
        assertEquals(-1, App.add(2, -3));
    }
}
