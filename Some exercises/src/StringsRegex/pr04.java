package StringsRegex;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


public class pr04 {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        while (! line.equals("end")){
            builder.append(line);
            line = reader.readLine();
        }

        String rezult = builder.toString().replaceAll("<a","[URL");
        rezult = rezult.replace("</a>","[/URL]");
        System.out.println(rezult);

    }
}
