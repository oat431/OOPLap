package app;

public class grade {
    public static void main(String args[]) {
        int i;

        if (i >= 80) {
            System.out.print("A");
        } else if (i >= 75 && i < 79) {
            System.out.print("B+");
        } else if (i >= 70 && i < 74) {
            System.out.print("B");
        } else if (i >= 65 && i < 69 {
            System.out.print("C+");
        }  else if (i >= 60  && i < 64) {
            System.out.print("C");
        } else if (i >= 55 && i < 59) {
            System.out.print("D+");
        } else if (i >= 50 && i < 54) {
            System.out.print("D");
        }else {
            System.out.print("F");
        }
    }
}