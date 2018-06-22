package com.program10;

import com.google.common.collect.ComparisonChain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program10 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Marek", "Kowalski", 1994, 180));
        studentList.add(new Student("Rafal", "Kowalczyk", 1994, 160));
        studentList.add(new Student("Marcin", "Olczyk", 1994, 150));
        studentList.add(new Student("Janusz", "Nowak", 1994, 170));
        studentList.add(new Student("Przemek", "Wisniewski", 1993, 185));
        studentList.add(new Student("Artur", "Wozniak", 1993, 165));

        System.out.println("List before sorting: ");
        for (Student student : studentList) {

            System.out.println(student.getName());
        }
        System.out.println("-----------");

        Collections.sort(studentList, new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                if (o1.dateOfBirth > o2.dateOfBirth) return 1;
                else if(o1.dateOfBirth < o2.dateOfBirth) return -1;
                    if (o1.surname.substring(0, 1).compareTo(o2.surname.substring(0, 1)) > 0) return 1;
                    else if (o1.surname.substring(0, 1).compareTo(o2.surname.substring(0, 1)) < 0) return -1;
                    else{
                        if (o1.height > o2.height) return 1;
                        else if (o1.height < o2.height) return -1;
                        else return 0;
                    }
                }
        });

        System.out.println("List after jdk sort: ");
        for (Student student : studentList) {

            System.out.println(student.getName());
        }
        System.out.println("-----------");

        Collections.shuffle(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return ComparisonChain.start()
                        .compare(o1.dateOfBirth, o2.dateOfBirth)
                        .compare(o1.surname.substring(0, 1), o2.surname.substring(0, 1))
                        .compare(o1.height, o2.height).result();
            }
        });

        System.out.println("List after comparison chain sort: ");
        for (Student student : studentList) {

            System.out.println(student.getName());
        }
    }
}