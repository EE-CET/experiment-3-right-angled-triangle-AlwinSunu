public class Triangle {
    public static void main(String[] args) {
        int height = 3;

        for (int i = 0; i < height; i++) {
            int num = 2 * i + 1;
            for (int j = 0; j < num; j++) {
                System.out.print("*");
                if (j < num - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
