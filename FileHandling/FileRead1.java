import java.io.*;

class FileRead1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        File file = new File(dir, "pw.text");

        FileReader fr = new FileReader(file);
        int i = fr.read();
        System.out.println((char) i);

        while (i != -1) {
            System.out.print(i + "--->");
            System.out.println((char) i);
            i = fr.read();
        }
    }
}