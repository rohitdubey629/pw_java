import java.io.*;

public class PrintWrite1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        File file = new File(dir, "pw.text");

        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("\n");
        pw.write("java");
        pw.write("\n");
        pw.println("java");
        pw.print(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);
        pw.flush();
        pw.close();
        System.out.println("Data is save");
    }
}
