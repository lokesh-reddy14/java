import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of names separated by commas: ");
        String input = scanner.nextLine();

        String[] names = input.split(",");
        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
