import software.ulpgc.Person;

import static java.lang.IO.println;

void main() {
    Person person = new Person("persona",LocalDate.now());
    println(person);
    person.setName("hi");
    person.setBirthday(LocalDate.now().minusYears(10).plusDays(1));
    println(person);
    person.setBirthday(LocalDate.now().minusYears(10));
    println(person);
}