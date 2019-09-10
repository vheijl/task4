public class Rectangle {
    public static void main(String[] args) {

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        if (height > 0 && height <= 20) {
            for(int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                    /* 
                        These if-statements could be combined to one if statement, however
                        I chose to divide them up to increase readability of the code (I hope).
                    */

                    if (i > 0 && i < height - 1 && j > 0 && j < width  - 1) {
                        if (i > 1 && i < height - 2 && j > 1 && j < width  - 2) {
                            if (i > 2 && i < height - 3 && j > 2 && j < width -3) {
                                System.out.print(" "); // Inner "hole"
                            } else {
                                System.out.print("#"); // Inner "ring"
                            }
                        } else {
                            System.out.print(" "); // Outer "hole"
                        }
                    } else {
                        System.out.print("#"); // Outer "ring"
                    }
                }
                System.out.println(); // Newline after every row
            }
        }
    }
} 