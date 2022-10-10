package person;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.parseInt(o1.getPhone())-Integer.parseInt(o2.getPhone());
    }
}
