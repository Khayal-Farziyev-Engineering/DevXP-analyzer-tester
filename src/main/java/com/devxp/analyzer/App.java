package com.devxp.analyzer;

/**
 * Main application entry point for DevXP Analyzer.
 */
public class App {

    private final String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String greet() {
        return "Hello from DevXP Analyzer: " + name;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App("DevXP");
        System.out.println(app.greet());
        System.out.println("2 + 3 = " + add(2, 3));
    }
}
