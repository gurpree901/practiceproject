package day1;

public class duplicatearrayj {

    public static void main(String[] args) {
        
        String a[] = {"aman", "java", "gagan", "aman"};
        
        System.out.println("Duplicate elements are:");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
