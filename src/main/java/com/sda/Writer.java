package com.sda;

import org.apache.commons.lang3.StringUtils;

public class Writer {
    public String sayHello(String name){

        String nameInMessage = name;
        String greeting = "Hello";
        if(StringUtils.isAllUpperCase(nameInMessage)){
            greeting = StringUtils.upperCase(greeting);

        }
      //  if (nameInMessage==null || "".equals(nameInMessage)){ //porównujemy stałe do wartości w których może wystąpić NullPOinter
        if (StringUtils.isBlank(nameInMessage)){
            nameInMessage = "my friend";
        }
        return greeting+", "+ nameInMessage+ "!";
    }
}
