public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", new int[]{80, 90, 85});
        System.out.println(s.calculateAverage());
    }
}