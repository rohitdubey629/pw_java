import java.io.*;

public class BufferedWriter1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        File file = new File(dir, "pw.text");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = { 'a', 'b', 'c' };
        bw.write(ch);
        bw.newLine();
        bw.flush();
        bw.close();
        System.out.println("Data is save");

    }
}
