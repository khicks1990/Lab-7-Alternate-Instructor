import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Create a HashSet to store Car objects.
        Set<Instructor> iset;  

       // Create a Set to hold Instructor objects
       iset = new HashSet<>();

       // Add some Instructor objects to the Set.
       iset.add(new Instructor("Kramer", "Shawn", "RH431"));
       iset.add(new Instructor("Looney", "Joe", "RH432"));
       iset.add(new Instructor("Krupnow", "Barret", "RH433"));
       iset.add(new Instructor("Kelly", "Marcia", "RH434"));

        // Display the elements in the HashSet.
        System.out.println("Here are the instructors in the set:");
        for (Instructor c : iset)
        {
            System.out.println(c);
        }
        System.out.println();

        // Search for a specific instructor. This one is in the set.
       Instructor instructor = new Instructor("Looney", "Joe", "RH432");
        System.out.println("Searching for " + instructor);
        if (iset.contains(instructor))
        {
            System.out.println("The Instructor is in the set.");
        } else
        {
            System.out.println("The Instructor is NOT in the set.");
        }

        // Search for another car. This one is not in the set.
        Instructor instructor2 = new Instructor("Craddock", "Lionel", "DH228");
        System.out.println("Searching for " + instructor2);
        if (iset.contains(instructor2))
        {
            System.out.println("The instructor is in the set.");
        } else
        {
            System.out.println("The instructor is NOT in the set.");
        }
    }
}
