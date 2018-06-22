package com.program8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

class CreateQA {

    static void createQuestions(){

        EngTestQuest[] questions = new EngTestQuest[10];

        List<String> questionList = new ArrayList<>();
        questionList.add("Krzyczec to?");
        questionList.add("Zamek to?");
        questionList.add("Zepsuć to?");
        questionList.add("Basen to?");
        questionList.add("Sedzia to?");
        questionList.add("Kubek to?");
        questionList.add("Wakacje to?");
        questionList.add("Owca to?");
        questionList.add("Pilka nozna to?");
        questionList.add("Morze to?");

        for(int i=0; i<10; i++){
            questions[i] = new EngTestQuest();
            questions[i].number = i+1;
            questions[i].question = questionList.get(i);
        }

        ArrayList[] answerList = new ArrayList[10];

        answerList[0] = new ArrayList<String>();
        answerList[0].add("scream");
        answerList[0].add("shout");
        answerList[0].add("cry");
        questions[0].answers = answerList[0];
        answerList[1] = new ArrayList<String>();
        answerList[1].add("lock");
        answerList[1].add("castle");
        questions[1].answers = answerList[1];
        answerList[2] = new ArrayList<String>();
        answerList[2].add("break");
        answerList[2].add("mess");
        answerList[2].add("screw up");
        questions[2].answers = answerList[2];
        answerList[3] = new ArrayList<String>();
        answerList[3].add("pool");
        answerList[3].add("swimming pool");
        answerList[3].add("basin");
        questions[3].answers = answerList[3];
        answerList[4] = new ArrayList<String>();
        answerList[4].add("judge");
        answerList[4].add("referee");
        answerList[4].add("arbiter");
        questions[4].answers = answerList[4];
        answerList[5] = new ArrayList<String>();
        answerList[5].add("cup");
        answerList[5].add("mug");
        answerList[5].add("jug");
        questions[5].answers = answerList[5];
        answerList[6] = new ArrayList<String>();
        answerList[6].add("vacation");
        answerList[6].add("holiday");
        questions[6].answers = answerList[6];
        answerList[7] = new ArrayList<String>();
        answerList[7].add("sheep");
        answerList[7].add("ewe");
        questions[7].answers = answerList[7];
        answerList[8] = new ArrayList<String>();
        answerList[8].add("football");
        answerList[8].add("soccer");
        questions[8].answers = answerList[8];
        answerList[9] = new ArrayList<String>();
        answerList[9].add("sea");
        answerList[9].add("water");
        answerList[9].add("deep");
        questions[9].answers = answerList[9];

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("PolEndTest.json"));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(questions,writer);
            writer.close();

        }catch(IOException e){
            System.out.println("Error: "+e);
        }



    }
}
