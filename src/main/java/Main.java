import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    public static void main(String[] args) {

        Runnable anonymousRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("my anonymous class");
            }
        };
        anonymousRun.run();


        Runnable lambdaRun = (() -> {
            System.out.println("anonymous lambda function");
        });
        lambdaRun.run();

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));

        System.out.println("Before sorting");
        System.out.println(addresses);

        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address address1, Address address2) {
                String address1State = address1.getState();
                String address2State = address2.getState();
                int compare = address1State.compareTo(address2State);
                return compare;
            }
        });

        System.out.println("\nAfter sorting by state");
        System.out.println(addresses);

        Collections.sort(addresses, (Address address1, Address address2) ->
                address1.getCity().compareTo(address2.getCity())
        );

        System.out.println("\nAfter sorting by city");
        System.out.println(addresses);
    }
}
