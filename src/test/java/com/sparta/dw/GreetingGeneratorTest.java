package com.sparta.dw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GreetingGeneratorTest {

    @Test
    public void goodMorning() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(8);
        //assert
                Assertions.assertEquals("Good morning",actualResult);
    }
    @Test
    public void goodAfternoon() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(14);
        //assert
        Assertions.assertEquals("Good afternoon",actualResult);

    }
    @Test
    public void goodEvening() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(20);
        //assert
        Assertions.assertEquals("Good evening",actualResult);

    }


}
