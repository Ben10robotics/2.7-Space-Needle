public class Main {
    public static final int size = 4;

    public static void main(String[] args) {
        needle();

    }

    public static void needle () {
        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                System.out.print("   ");
            }
            System.out.println("||");
        }
    }
}
