package com.hello;

public class App {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = String.join(", ", args);
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}
