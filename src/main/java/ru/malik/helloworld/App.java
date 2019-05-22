package ru.malik.helloworld;

public class App {
    public static void main(String[] args) {
        final App app = new App();
        System.out.println(app.msg());
    }

    String msg() {
        return "Hello world!!!";
    }
}
