package software.ulpgc;

import java.time.LocalDate;

public class Person {
    private String Name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        Name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return Name;
    }

    public void changeName(String name) {
        Name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int age() {
        LocalDate now = LocalDate.now();
        int years = now.getYear() - this.birthday.getYear();
        if (
                now.getMonthValue() < birthday.getMonthValue() ||
                (now.getMonthValue() == this.birthday.getMonthValue() && now.getDayOfMonth() < birthday.getDayOfMonth())
        ) return years - 1;
        return years;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age()+
                '}';
    }
}
