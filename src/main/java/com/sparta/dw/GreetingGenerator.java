package com.sparta.dw;

public class GreetingGenerator {

    public String getGreeting(int timeOfDay1) {
        int timeOfDay= timeOfDay1;
        if (timeOfDay >=5 && timeOfDay <=12) {
            return("Good morning");
        }else if (timeOfDay >=12 && timeOfDay <=18) {
           return ("Good afternoon");
        }else {
            return ("Good evening");

        }
    }
}
