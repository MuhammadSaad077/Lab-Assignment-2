class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String address, String subject) {
        super(name, age, address);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher other = (Teacher) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.subject.equals(other.subject);
    }
}
