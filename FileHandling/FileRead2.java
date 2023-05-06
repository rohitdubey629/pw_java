import java.io.*;

class FileRead2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        File file = new File(dir, "pw.text");

        FileReader fr = new FileReader(file);

        char ch[] = new char[(int) file.length()];
        fr.read(ch);
        for (char data : ch) {
            System.out.print(data);
        }
    }
}