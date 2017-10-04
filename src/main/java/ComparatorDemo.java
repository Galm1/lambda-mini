import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.sun.tools.doclint.Entity.lambda;
import static jdk.nashorn.internal.objects.Global.print;


public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));


        System.out.println("Before sorting");
        print(addresses);

        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address address1, Address address2) {
                String address1State = address1.getState();
                String address22State = address2.getState();
                int compare = address1State.compareTo(address22State;
                return compare;
            }
        });

        System.out.println("\nAfter sorting by state");
        print(addresses);

        // !! - Write a lambda to sort by city alphabetically
        Collections.sort(addresses, /* lambda here */);

        System.out.println("\nAfter sorting by city");
        print(addresses);
    }

    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}
