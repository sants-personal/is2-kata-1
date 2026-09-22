import software.ulpgc.Person;

import static java.lang.IO.println;

void main() {
    Person person = new Person("santi",LocalDate.of(2004,9,10));
    println(person);
    person.setBirthday(LocalDate.now().minusYears(4).plusDays(2));
    println(person);
    person.setName("santi2");
    person.setBirthday(LocalDate.now().minusYears(4));
    println(person);

}