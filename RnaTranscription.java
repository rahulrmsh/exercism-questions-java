public class RnaTranscription {
    public static void main(String[] args) {
        String RNA = "";

        if (args[0].isEmpty())
            System.out.println("");

        for (int i = 0; i < args[0].length(); i++) {

            if (args[0].charAt(i) == 'C')
                RNA = RNA + "G";

            else if (args[0].charAt(i) == 'G')
                RNA = RNA + "C";

            if (args[0].charAt(i) == 'A')
                RNA = RNA + "U";

            if (args[0].charAt(i) == 'T')
                RNA = RNA + "A";

        }

        System.out.println(RNA);
    }
}
