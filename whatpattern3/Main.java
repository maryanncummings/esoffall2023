import whoknows.MyModel;
import whoknows.MyModel.Person;

public class Main {

    public static void main(String[] args) {
        MyModel model = new MyModel();
        MyWhoKnows whoknows = new MyWhoKnows(model);
        // we change the last name of the person, observer will get notified
        for (Person person : model.getPersons()) {
            person.setLastName(person.getLastName() + "1");
        }
        // we change the name of the person, observer will get notified
        for (Person person : model.getPersons()) {
            person.setFirstName(person.getFirstName() + "1");
        }
    }
}
