package list.Ordination.Test;
import list.Ordination.Domain.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdinationPerson {
    // Attributes
    private List<Person> personList;
    // Constructor
    public OrdinationPerson() {
        this.personList = new ArrayList<>();
    }

    // Methods
    public void addPerson(String name, int age, double height){
        personList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(personList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(personList);
        Collections.sort(peopleByHeight, new Person.ComparatorByHeight() {
        });
        return peopleByHeight;
    }

    public static void main(String[] args) {
        OrdinationPerson ordinationPerson = new OrdinationPerson();

        ordinationPerson.addPerson("Marcelo", 18, 1.69);
        ordinationPerson.addPerson("Marcos", 12, 1.62);
        ordinationPerson.addPerson("Francisco", 13, 1.54);
        ordinationPerson.addPerson("Guilherme", 17, 1.65);

        System.out.println(ordinationPerson.sortByAge());
        System.out.println(ordinationPerson.sortByHeight());
    }

}
