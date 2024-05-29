package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task07 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Enter student info (firstName lastName age hometown) or 'end' to finish:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] studentData = input.split(" ");
            if (studentData.length == 4) {
                String firstName = studentData[0];
                String lastName = studentData[1];
                int age = Integer.parseInt(studentData[2]);
                String hometown = studentData[3];

                Student student = new Student(firstName, lastName, age, hometown);
                students.add(student);
            } else {
                System.out.println("Invalid input. Please enter the student information in the correct format.");
            }
        }

        System.out.println("Enter the city name:");
        String cityName = sc.nextLine();

        System.out.println("Students from " + cityName + ":");
        for (Student student : students) {
            if (student.getHometown().equalsIgnoreCase(cityName)) {
                System.out.println(student.studentInfo());
            }
        }

        sc.close();
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String studentInfo() {
            return String.format("%s %s is %d years old", firstName, lastName, age);
        }
    }
}
