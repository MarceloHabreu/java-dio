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

//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devMarcelo = new Dev();
        devMarcelo.setName("Marcelo");
        devMarcelo.RegisterBootcamp(bootcamp);
        System.out.println("Contents subscribes Marcelo =>" + devMarcelo.getContentSubscribers());
        devMarcelo.progress();
        devMarcelo.progress();
        devMarcelo.progress();
        System.out.println("Contents subscribes Marcelo =>" + devMarcelo.getContentSubscribers());
        System.out.println("Contents completed Marcelo =>" + devMarcelo.getContentCompleted());
        System.out.println("XP Marcelo: " + devMarcelo.calculatedTotalXp());

        System.out.println();

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.RegisterBootcamp(bootcamp);
        System.out.println("Contents subscribes Camila => " + devCamila.getContentSubscribers());
        devCamila.progress();
        System.out.println("Contents subscribes Camila =>" + devCamila.getContentSubscribers());
        System.out.println("Contents completed Camila =>" + devCamila.getContentCompleted());
        System.out.println("XP Camila: " + devCamila.calculatedTotalXp());

    }
}
