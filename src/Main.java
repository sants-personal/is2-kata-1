import software.ulpgc.Person;

import static java.lang.IO.println;

void main() {
    Person person = new Person("name",LocalDate.of(2004,9,10));
    println(person);
    person.setBirthday(LocalDate.now().minusYears(4).plusDays(2));
    println(person);
    person.changeName("name2");
    person.setBirthday(LocalDate.now().minusYears(4));
    println(person);

}