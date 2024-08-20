package br.com.dio.challenge.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Course Java");
        course1.setDescription("Description course Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course Js");
        course2.setDescription("Description course Js");
        course2.setWorkload(4);



        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring Java");
        mentoring.setDescription("Description mentoring Java");
        mentoring.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);
    }
}
