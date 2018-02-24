package com.sda;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

public class WriterTest {

    @Test
    public void sayHelloWithGivenNameTest() {
        Writer writer = new Writer();
        String name = "Szymon";
        String result = writer.sayHello(name);

        Assert.assertEquals("Expected hello message is invalid","Hello, Szymon!", result);

    }
    @Test
    public void sayHelloWithNoNameSpecified(){
        Writer writer = new Writer();
        String name = "";

        String result = writer.sayHello(name);

        Assert.assertEquals("Message for empty name should be different","Hello, my friend!", result);

    }

    @Test
    public void sayHelloWithNullName(){
        Writer writer = new Writer();
        String name = null;

        String result = writer.sayHello(name);

        Assert.assertEquals("Hello, my friend!", result);
    }
}
