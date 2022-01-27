package com.example.test;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeChallenge {

    public static void main(String[] args) {


        /*
        NOTE 1 !!!
        In the first equals() method compaarison, the result is true because the
        state of the object is exactly the same nd the hashcode() method returns
        the same value for both objects.
         */
        System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));

        Simpson overriddenHomer = new Simpson("Homer") {
            public int hashCode() {
                return (43 + 777) + 1;
            }
        };

        /*
        NOTE 2 !!!
        In the second equals() method comparison, the hashcode() method is being
        overriden for the overridenHomer variable. The name is "Homer" for both
        Simpson objects, but the hashcode() method returns a different value for
        overriddenHomer. In this case, the final result from the equals() method will be false
        because the method contains a comparison with the hashcode.
         */
        System.out.println(new Simpson("Homer").equals(overriddenHomer));

        Set set = new HashSet(Set.of(new Simpson("Homer"), new Simpson("Merge")));
        set.add(new Simpson("Homer"));
        set.add(overriddenHomer);

        System.out.println(set.size());
        /*
        NOTE 3 !!!
        You might notice that the size of the collection is set to hold three
        Simpson objects. Let's check this in a detailed way.
        The first object in the set will be inserted normally:
        new Simpson("Homer")
        The next object will be inserted normaally as well, because it holds a
        different value from the previous object:
        new Simpson("Marge");
        Finally, the following Simpson object has the same value as the first
        object.In this case the object won't be inserted:
        set.add(new Simpson("Homer"));
        As we know, the overriddenHomer object uses a different hashcode value
        from the normal Simpson("Homer") instantiation. For this reason, this
        element will be inserted into the collection:
        set.add(overriddenHomer);
         */
    }

    static class Simpson {
        String name;

        public Simpson(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            Simpson otherSimpson = (Simpson) obj;
            return this.name.equals(otherSimpson.name) && this.hashCode() == otherSimpson.hashCode();
        }

        @Override
        public int hashCode() {
            return (43 + 777);
        }
    }


}
