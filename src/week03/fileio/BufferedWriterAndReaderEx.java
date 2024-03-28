package week03.fileio;

import java.io.*;

public class BufferedWriterAndReaderEx {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("buffered.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        BufferedWriter bw2 = new BufferedWriter(bw);
        bw2.write("gamze çok konuştu");
        bw2.newLine();
        bw2.close();
        fw.close();

        fw.close();


        FileReader fr = new FileReader("buffered.txt");
        BufferedReader br = new BufferedReader(fr);

        String data = null;
        while((data = br.readLine()) != null) {
            System.out.println(data);
        }
        fr.close();
        br.close();
    }
}
// buffered reader= input, writer=output