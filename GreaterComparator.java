public class GreaterComparator {
    
    public void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
    
    public void compare(char a, char b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
    
    public void compare(String a, String b) {
        if (a.compareTo(b) > 0) {
            System.out.println(a + " is greater than " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
    
    public static void main(String[] args) {
        GreaterComparator comparator = new GreaterComparator();
        
        // test integer comparison
        comparator.compare(3, 5);
        
        // test character comparison
        comparator.compare('a', 'z');
        
        // test string comparison
        comparator.compare("hello", "world");
    }
}
