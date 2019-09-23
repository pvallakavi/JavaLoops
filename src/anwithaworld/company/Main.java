package anwithaworld.company;

public class Main {

    public static void main(String[] args) {
        //simple while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //simple do-while loop
        int j = 0;
        do {
            System.out.println("j=" + j);
            j++;
        } while (j < 5);
        String s = null;

        //simple for loops
        for (int k = 0; k < 5; k++) {
            if (k==0) {
                s = Integer.toString(k); //converting int into string
            }
            else
                {
                    s=s+","+Integer.toString(k);
                }
            System.out.println(s);
        }
        // For-each loops. The following example outputs all elements in the cars array, using a "for-each" loop:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
        //This example jumps out of the loop when i is equal to 4:
        for (int b = 0; b < 10; b++) {
            if (b == 4) {
                break;
            }
            System.out.println(b);
        }
        // continue will skip the iteration if the condition is met
        for (int sk = 0; sk < 6; sk++) {
            if (sk == 4) {
                continue; //skip & continue
            }
            System.out.println(sk);
        }
    }
}