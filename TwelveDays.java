import java.util.ArrayList;
import java.util.List;

public class TwelveDays {
    public static void main(String[] args) {
        String[] days = { "first", "second", "third", "fourth", "fifth",
                "sixth", "seventh", "eighth", "ninth", "tenth",
                "eleventh", "twelfth" };
        String[] lastLyrics = { "a Partridge in a Pear Tree",
                "two Turtle Doves",
                "three French Hens",
                "four Calling Birds",
                "five Gold Rings",
                "six Geese-a-Laying",
                "seven Swans-a-Swimming",
                "eight Maids-a-Milking",
                "nine Ladies Dancing",
                "ten Lords-a-Leaping",
                "eleven Pipers Piping",
                "twelve Drummers Drumming" };
        String string1 = "On the ";
        String string2 = " day of Christmas my true love gave to me: ";
        List<String> lines = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            lines.add(string1 + days[i] + string2 + lastLyrics[i]);
        }
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }

}
