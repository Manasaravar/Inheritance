import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Inheritance
/*        {
            Human human = new Human("Montana", "Antonio", 30);
            System.out.println(human);
            Student student = new Student("Pinkman", "Jessie", 25, "java",
                    "gr_326", 5, 4);
            System.out.println(student.toString());
            Teacher teacher = new Teacher("Ivanov", "Petr", 55, "C++", 25);
            System.out.println(teacher);
            Graduate graduate = new Graduate("Petrov", "Sergei", 40, "programmist",
                    "gr_355", 70, 50, "How to catch fish");
            System.out.println(graduate);
            Student student1 = new Student(student, "Thert", "Vice", 90, 25);
            System.out.println(student1);
            Specialist specialist = new Specialist("Kozlov", "Ivan", 42, "programmist",
                    "gr_355", 70, 50, "How to catch fish", "Programmist");
            System.out.println(specialist);
            Bookkeeper bookkeeper = new Bookkeeper(human, "Head_bookkeeper");
            System.out.println(bookkeeper);
            Master master = new Master(human, "Medic", 23, "Doctor");
            System.out.println(master);
        }*/
        // Polymorphism
        // ad-hoc polymorphism
        // upcast
        /*Specialist leo = new Specialist("Pushkin", "Alexander", 33, "Poet", "Teacher", 33, 44,
                "Writer", "Universal");
        Human[] group = new Human[]{
                new Student("Pinkman", "Jessie", 25, "java", "gr_326", 5, 4),
                new Teacher("Ivanov", "Petr", 55, "C++", 25),
                new Specialist("Kozlov", "Ivan", 42, "programmist", "gr_355", 70, 50, "How to catch fish", "Programmist"),
                new Teacher("van_Dame", "Jean-Claude", 55, "Figther", 25), leo
        };
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }
        File file = new File("group.text");
        System.out.println(file.getAbsolutePath());
        file.delete();
        if (file.createNewFile()) {
            System.out.println("File created");
        } else
        {
            System.out.println("File exist");
        }
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < group.length; i++) {
            writer.write(group[i].toString() + "\n");

        }
        writer.close(); // поток принято закрывать*/
        int n = 5;
        Human groupHuman [] = new Human[n];
        String [] group = new String[n];
        File file =  new File("group.txt");
        System.out.println(file.getAbsolutePath());
        Scanner scanner = new Scanner(file);

            for (int i = 0; i < group.length; i++) {
            String items[] = scanner.nextLine().split(" ");
            groupHuman[i] = new Human(items[0], items[1], Integer.parseInt(items[2]));
            System.out.println(groupHuman[i]);
        }
        scanner.close();
    }
}