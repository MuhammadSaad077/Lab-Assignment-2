class School {
    String name;
    String address;
    Principal principal;
    ClassRoom[] classrooms;
    int classCount;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new ClassRoom[10];
        this.classCount = 0;
    }

    public void addClassroom(ClassRoom classroom) {
        if (classCount < 10) {
            classrooms[classCount++] = classroom;
        }
    }

    @Override
    public String toString() {
        return "School: " + name + ", Address: " + address + ", Principal: " + principal.toString();
    }
}
