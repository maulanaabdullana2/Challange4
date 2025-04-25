package day34;

public abstract class Person {
    private  String nationalId;
    private String fullname;

    //cnstruktor
    public Person(String nationalId, String fullname) {
        this.nationalId = nationalId;
        this.fullname = fullname;
    }

    //method
    abstract String Infoperson();

}
