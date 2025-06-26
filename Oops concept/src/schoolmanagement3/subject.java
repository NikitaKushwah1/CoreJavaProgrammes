package schoolmanagement3;

import java.util.Scanner;

class Subject {
    private String[] subjects;

    public void addSubjects(Scanner sc) {
        System.out.print("How many subjects are in school? ");
        int n = sc.nextInt();
        sc.nextLine();
        subjects = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }
    }

    public void displaySubjects() {
        if (subjects == null || subjects.length == 0) {
            System.out.println("No subjects added.");
            return;
        }
        System.out.println("Subjects offered:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }

    public String[] getSubjects() {
        return subjects;
    }
}

