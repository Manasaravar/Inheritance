public class Main {
    public static void main(String[] args) {
        Human human = new Human("Montana","Antonio", 30);
        System.out.println(human);
        Student student = new Student("Pinkman","Jessie", 25, "java",
                "gr_326", 5,4);
        System.out.println(student.toString());
        Teacher teacher = new Teacher("Ivanov", "Petr", 55, "C++", 25);
        System.out.println(teacher);
        Graduate graduate = new Graduate("Petrov", "Sergei",40, "programmist",
                "gr_355", 70, 50, "How to catch fish");
        System.out.println(graduate);
        Student student1 = new Student(student, "Thert", "Vice", 90,25);
        System.out.println(student1);
        Specialist specialist = new Specialist("Kozlov", "Ivan",42, "programmist",
                "gr_355", 70, 50, "How to catch fish", "Programmist");
        System.out.println(specialist);
        Bookkeeper bookkeeper = new Bookkeeper(human, "Head_bookkeeper");
        System.out.println(bookkeeper);
        Master master = new Master(human, "Medic", 23, "Doctor");
        System.out.println(master);
    }
}