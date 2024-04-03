package com.app.junit.project;

import java.util.ArrayList;
import java.util.List;

public class MultiplosDeTresOrCinco {

    public List<String> getNumbers(){

        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            if (i%3==0){
                numbers.add("Fizz");
            }else {
                numbers.add(""+i);
            }

        }
        return numbers;
    }
}
