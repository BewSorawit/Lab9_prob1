public class Main {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 };
        try {
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());   
        }
        for (int i : num) {
            System.out.println(i);
        }

    }
}