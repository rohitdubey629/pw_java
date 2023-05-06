import java.io.*;

class File3 {
    public static void main(String[] args) {

        File dir = new File("pw");
        File file = new File(dir, "pw.text");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("java\n");
            fw.write(65);
            fw.write("\n");
            fw.write(97);
            fw.write("\n");
            char ch[] = { 'j', 'a', 'v', 'a' };
            fw.write(ch);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File in writing successfully");
    }
}