class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, String address, int rollNumber) {
        super(name, age, address);
        this.rollNumber = rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll Number: " + rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.rollNumber == other.rollNumber;
    }
}