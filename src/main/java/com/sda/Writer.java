package com.sda;

public class Writer {
    public String sayHello(String name){
        String nameInMessage = name;
        if (nameInMessage==null || "".equals(nameInMessage)){ //porównujemy stałe do wartości w których może wystąpić NullPOinter
            nameInMessage = "my friend";
        }
        return "Hello, "+ nameInMessage+ "!";
    }
}
