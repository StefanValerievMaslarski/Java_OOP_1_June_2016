package Files;


import java.io.*;

public class ReadingWriting {
    public static void main(String[] args) throws IOException {

//        File file = new File("C:\\Users\\Stefan_Petq_Valeriq\\Desktop\\proba123.txt");
        File file = new File("res\\proba1234.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {


            //writing to file
//            bw.newLine();
//            bw.write("Stefan");
//            bw.newLine();
//            bw.write("Stefan");
//            bw.newLine();
//            bw.write("Stefan");
//            bw.newLine();

            int counter = 1;
            String line = null;
            while (((line = br.readLine()) != null)) {
                if (counter % 2 != 0) {
                    System.out.println(line);
                }
                counter++;
//            bw.newLine();
//
//            bw.write("oste nesto");
            }

        }

    }
}
