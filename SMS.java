public class SMS {
    public static void main(String[] args) {
        Principal principal = new Principal("Saad", 50, "Main Street", 20);
        School school = new School("LGS", "123 Main Boulevard", principal);

        Teacher teacher1 = new Teacher("Ali", 35, "Gulberg", "Mathematics");
        Teacher teacher2 = new Teacher("Bobzi", 40, "Johar Town", "Science");

        ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1, new Student[5]);
        ClassRoom class2 = new ClassRoom("Grade 9", "G9", teacher2, new Student[5]);

        school.addClassroom(class1);
        school.addClassroom(class2);

        class1.addStudent(new Student("Imran", 15, "Town", 201));
        class1.addStudent(new Student("Khubaib", 16, "Town", 202));
        class1.addStudent(new Student("Osama", 15, "Town", 203));
        class1.addStudent(new Student("Noman", 16, "Town", 204));
        class1.addStudent(new Student("Subhan", 15, "Town", 205));
        class1.addStudent(new Student("Naseer", 16, "Town", 206));

        System.out.println(school);

        Teacher anotherTeacher = new Teacher("Alice Smith", 35, "Gulberg", "Mathematics");
        System.out.println("Teacher comparison: " + teacher1.equals(anotherTeacher));

        Student student1 = new Student("Nisar", 15, "Town", 201);
        Student duplicateStudent = new Student("Nisar", 15, "Town", 201);
        System.out.println("Student comparison: " + student1.equals(duplicateStudent));
    }
}
