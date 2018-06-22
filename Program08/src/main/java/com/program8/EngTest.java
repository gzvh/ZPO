package com.program8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class EngTest {

    private EngTestQuest[] questions = new EngTestQuest[10];
    private EngTestAnsw[] answers = new EngTestAnsw[5];
    private List<Integer> numberOfQuestions = new ArrayList<Integer>();

    EngTest(){
        for(int i=0; i<10;i++) {
            this.questions[i] = new EngTestQuest();
            if(i%2==0)
                this.answers[i/2] = new EngTestAnsw();
        }
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader("PolEndTest.json");
            this.questions = gson.fromJson(reader, EngTestQuest[].class);
            reader.close();
        } catch (IOException | IllegalStateException | JsonSyntaxException e){
            System.out.println("Error: " +e);
        }

        this.randQuestion();
    }

    void startTest(){

        String dane;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie i naziwsko: ");
        dane = input.nextLine().toLowerCase();
        System.out.println("Test has started");

        long startTime = System.nanoTime();
        for(int i = 0; i < 5; i++){
            this.getQuestion(this.numberOfQuestions.get(i),i);
        }
        long passedTime = System.nanoTime() - startTime;

        System.out.println("Score: " +Integer.toString(this.calcScore()));
        System.out.println("Completing the test took " + (TimeUnit.SECONDS.convert(passedTime, TimeUnit.NANOSECONDS)) + " seconds");
        System.out.println("Test is finished");
        this.JSWriter(dane +".json");
    }

    private void randQuestion(){

        Random rand = new Random();
        while(this.numberOfQuestions.size() < 5){
            int out = rand.nextInt(10);
            if(!this.numberOfQuestions.contains(out))
                this.numberOfQuestions.add(out);
        }
    }

    private void getQuestion(Integer number, Integer answerNumber){

        String answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Question: " +this.questions[number].question +" \n Answer: ");
        answer = input.nextLine().toLowerCase();
        this.answers[answerNumber].number = answerNumber+1;
        this.answers[answerNumber].question = this.questions[number].question;
        this.answers[answerNumber].answers = this.questions[number].answers;
        this.answers[answerNumber].answered = answer;
        this.answers[answerNumber].isCorrect = this.answers[answerNumber].answers.contains(answer);
    }

    private Integer calcScore(){

        Integer score = 0;
        for(int i = 0; i < 5; i++){
            if(this.answers[i].isCorrect)
                score++;
        }
        return score;
    }

    private void JSWriter(String result){

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(result));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this.answers,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("Error: " +e);
        }
    }

}
