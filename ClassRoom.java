class ClassRoom {
    private String name;
    private String classCode;
    private Student[] students;
    private Teacher teacher;
    private int studentCount;

    public ClassRoom(String name, String classCode, Teacher teacher, Student[] students) {
        this.name = name;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5];
        this.studentCount = students.length;

        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("ClassRoom is full");
        }
    }
}
