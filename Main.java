import java.io.FileWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int max = 5;
        int min = 1;
        int range = max - min + 1;

        Scanner sc = new Scanner(System.in);
        // long start = System.currentTimeMillis();
        // long end = start + 180 * 1000;

        try {
            FileWriter file = new FileWriter("logfile.logs", true);
            // while (System.currentTimeMillis() < end) {
            while (true) {
                String s;
                int rand = (int) (Math.random() * range) + min;
                if (rand == 3) {
                    s = "ERROR: Input 3 not expected..\n";
                    System.out.println(s);
                } else {
                    s = "Program runnning OK...\n";
                    System.out.println(s);
                }
                file.write(s);
                file.flush();
                Thread.sleep(2000);
                // }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        sc.close();
    }
}