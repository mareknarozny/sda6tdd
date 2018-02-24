package com.sda;

import org.apache.commons.lang3.StringUtils;

public class Writer {

    private String convertToMessage(String[] names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length ; i++) {
            sb.append(names[i]);
            if(i<names.length-2){
                sb.append(", ");
            }else if(i == names.length-2){
                sb.append(" and ");
            }
        }
        return sb.toString();
    }

    public String sayHello(String name) {

        String [] names = name !=null ? name.split(",") : new String[1];
        String nameSection = names.length==1 ? name : convertToMessage(names);
        String greeting = "Hello";
        if (StringUtils.isAllUpperCase(nameSection)) {
            greeting = StringUtils.upperCase(greeting);

        }
        //  if (nameSection==null || "".equals(nameSection)){ //porównujemy stałe do wartości w których może wystąpić NullPOinter
        if (StringUtils.isBlank(nameSection)) {
            nameSection = "my friend";
        }
        return greeting + ", " + nameSection + "!";
    }
}
