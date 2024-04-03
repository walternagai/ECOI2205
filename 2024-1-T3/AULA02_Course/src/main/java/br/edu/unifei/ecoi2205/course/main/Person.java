package br.edu.unifei.ecoi2205.course.main;

public class Person {
    private final String CPF;
    private String name;
    protected String birthDate;

    public Person(String CPF, String name) {
        this.CPF = CPF;
        this.name = name;
    }
    public String getCPF() {
        return this.CPF;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getBirthDate() {
        return this.birthDate;
    }
    @Override
    public String toString()
    {
        return new String(this.CPF + "\t" + this.name);
    }
}
