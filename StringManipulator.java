public class StringManipulator {
  private String text;

  public StringManipulator(String text) {
    this.text = text;
  }

  public String toLowerCase() {
    return text.toLowerCase();
  }

  public String toUpperCase() {
    return text.toUpperCase();
  }

  public String trim() {
    return text.trim();
  }

  public String replace(char oldChar, char newChar) {
    return text.replace(oldChar, newChar);
  }

  public boolean equals(String otherText) {
    return text.equals(otherText);
  }

  public boolean equalsIgnoreCase(String otherText) {
    return text.equalsIgnoreCase(otherText);
  }

  public int length() {
    return text.length();
  }

  public char charAt(int index) {
    return text.charAt(index);
  }

  public int compareTo(String otherText) {
    return text.compareTo(otherText);
  }

  public String concat(String otherText) {
    return text.concat(otherText);
  }

  public String substring(int beginIndex) {
    return text.substring(beginIndex);
  }

  public String substring(int beginIndex, int endIndex) {
    return text.substring(beginIndex, endIndex);
  }

  public String valueOf() {
    return String.valueOf(text);
  }

  public String toString() {
    return text;
  }

  public int indexOf(char ch) {
    return text.indexOf(ch);
  }

  public int indexOf(char ch, int fromIndex) {
    return text.indexOf(ch, fromIndex);
  }
}

public class StringManipulatorDemo {
  public static void main(String[] args) {
    StringManipulator text1 = new StringManipulator("Hello World");
    System.out.println("Original Text: " + text1.toString());
    System.out.println("ToLowercase: " + text1.toLowerCase());
    System.out.println("ToUppercase: " + text1.toUpperCase());
    System.out.println("Trim: " + text1.trim());
    System.out.println("Replace 'l' with 'x': " + text1.replace('l', 'x'));
    System.out.println("Length: " + text1.length());
    System.out.println("Char at position 6: " + text1.charAt(6));
    System.out.println("Equals 'hello world': " + text1.equals("hello world"));
    System.out.println("EqualsIgnoreCase 'HELLO WORLD': " + text1.equalsIgnoreCase("HELLO WORLD"));
    System.out.println("CompareTo 'hello world': " + text1.compareTo("hello world"));
    System.out.println("Concat ' from Java Program': " + text1.concat(" from Java Program"));
    System.out.println("Substring from position 2: " + text1.substring(2));
    System.out.println("Substring from position 2 to 7: " + text1.substring(2, 7));
    System.out.println("ValueOf: " + text1.valueOf());
    System.out.println("IndexOf 'o': " + text1.indexOf('o'));
    System.out.println("IndexOf 'o' starting from position 5: " + text1.indexOf('o', 5));
  }
}
