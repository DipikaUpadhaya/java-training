package day28;

import java.util.*;
import java.util.logging.Logger;

//these List.of, Set.of, Map.of collections are unmodifiable
public class ImmutableCollectionPractice {
    public static void main(String[] args) {

        //though we make constant using final keyword here we can add any data as well as remove
       final ArrayList<String> names= new ArrayList<>();
       names.add("ABC");
       names.add("DEF");
       names.add("GHI");
        Logger.getGlobal().info(names.toString());

        //but here we can neither add nor remove by using this List.of i.e. it is made constant (cannot modify)
        //used for small numbers of data
        List<String> immutableNames= List.of("ABC", "DEF", "GHI");
        //immutableNames.add("JKL");// we cannot edit/add/remove in immutable
        //immutableNames.removeAll(immutableNames); // so it gives error
        Logger.getGlobal().info(immutableNames.toString());

        //if we want to make mutable to immutable for larger numbers of data then we use Collections.unmodifiableCol..
        Collections.unmodifiableCollection(names);

        final Collection<String> setNames= new HashSet<>();// this set gives output removing duplicate
        setNames.add("M");
        setNames.add("N");
        setNames.add("O");
        setNames.add("O");
        Logger.getGlobal().info(setNames.toString());

        Set<Integer> numbers= Set.of(1, 2, 3);// but this gives error if duplicate element persists
       // numbers.add(4);// this is immutable i.e we cannot edit or modify anything in this type of set. so give error
        Logger.getGlobal().info(numbers.toString());

        Map<String ,Integer> scores= Map.of("John",5,"Peter", 6, "Steve",4);
        //scores.put("Adi", 7);// this map.of is also immutable
        Logger.getGlobal().info(scores.toString());

        // we can also write immutable maps like this
        Map<String, Integer> scores1=Map.ofEntries(Map.entry("John",5),Map.entry("Peter", 6));
        Logger.getGlobal().info(scores1.toString());


        //if we want to make changes(mutable) in immutable collection sets then we can pass immutable collection to constructor
        ArrayList<String> mutableNames= new ArrayList<>(immutableNames);
        mutableNames.add("JKL");//now we can modify this list
        Logger.getGlobal().info(mutableNames.toString());

        //if we want to make multiple copies of data then we can use Collections.nCopies()method
        List<String> copy= Collections.nCopies(50,"Dipika");
        Logger.getGlobal().info(copy.toString());

        Collection<String> synchronizedNames = Collections.synchronizedCollection(names);

    }
}
