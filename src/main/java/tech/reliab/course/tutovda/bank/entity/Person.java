package tech.reliab.course.tutovda.bank.entity;

import java.time.LocalDate;

public class Person {
    protected int id = (int) (1 + Math.random() * 10000);
    protected String name = "-";
    protected LocalDate birthdayDate = null;

    public Person() {}

    public Person(Person person) {
        id = person.id;
        name = person.name;
        birthdayDate = person.birthdayDate;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name, LocalDate birthdayDate) {
        this.id = id;
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public String toString() {
        return "*** Person Info ***\n" +
                "id -> " + id + '\n' +
                "name -> " + name + '\n' +
                "birthday date -> " + birthdayDate + '\n' +
                "*** *********** ***";
    }

    // ============== getters & setters ==============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
