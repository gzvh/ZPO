package com.program8;

import static com.program8.CreateQA.createQuestions;

public class Program8 {

    public static void main(String[] args) {

        createQuestions();
        EngTest gra1 = new EngTest();
        gra1.startTest();

    }
}
