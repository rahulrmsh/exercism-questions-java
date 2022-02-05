import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {
    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        int c = 0;
        int n = Integer.parseInt(args[0]);
        List<Integer> vals = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                a = i;
                b = j;
                c = n - (a + b);
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    vals.add(a);
                    vals.add(b);
                    vals.add(c);
                }
            }
        }
        System.out.println(vals);
    }

}
