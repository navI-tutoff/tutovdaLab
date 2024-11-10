package tech.reliab.course.tutovda.bank.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class Person {
    protected int id = (int) (1 + Math.random() * 10000);
    protected String name = "-";
    protected LocalDate birthdayDate = null;

    public Person(Person person) {
        id = person.id;
        name = person.name;
        birthdayDate = person.birthdayDate;
    }

    public Person(String name) {
        this.name = name;
    }
}
