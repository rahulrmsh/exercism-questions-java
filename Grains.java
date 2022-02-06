import java.util.*;

public class Grains {
    public static void main(String[] args) {
        List<Long> grains = new ArrayList<Long>();
        long grainCount = 1;
        for (int i = 0; i < 64; i++) {
            grains.add(grainCount);
            grainCount *= 2;
        }
        if (Integer.parseInt(args[0]) > 64) {
            System.out.println("Enter a number smaller than 64");
        } else if (Integer.parseInt(args[0]) <= 0) {
            System.out.println("Enter a number greater than 0");
        } else {
            System.out.println(grains);
            System.out.println("Number of grains at " + args[0] + " : " + grains.get(Integer.parseInt(args[0]) - 1));
        }
    }
}