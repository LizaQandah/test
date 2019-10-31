
public class ListOfStringTest {

    public static void main(String[] args){
        System.out.println("changed");
 System.out.println("hub changed");
        ListOfStrings lst = new ListOfStrings();

        lst.add("mohammad");
        lst.add("adam");
        lst.add("idris");
        lst.add("sulaiman");
        lst.add("elias");
        lst.add("ibrahim");

        System.out.println("numbe of strings in the list is " + lst.size());
        System.out.println(lst.remove() + " is removed from the list");
        System.out.println(lst.remove() + " is removed from the list");
        System.out.println(lst.remove() + " is removed from the list");
        System.out.println(lst.remove() + " is removed from the list");
        System.out.println(lst.remove() + " is removed from the list");
        System.out.println(lst.remove() + " is removed from the list");

    }
}
