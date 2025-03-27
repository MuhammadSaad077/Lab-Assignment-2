class Principal extends Person {
    private int experience;

    public Principal(String name, int age, String address, int experience) {
        super(name, age, address); 
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience: " + experience + " years";
    }
}
