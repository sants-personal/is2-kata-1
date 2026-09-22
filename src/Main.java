import software.ulpgc.Person;

import static java.lang.IO.println;

void main() {
    Person person = new Person("santi",LocalDate.of(2004,9,10));
    println(person);
    person.setName("other name");
    person.setBirthday(LocalDate.now().plusDays(1).minusYears(2));
    println(person);
}