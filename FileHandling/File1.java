import java.io.*;

class File1 {
    public File1(String string) {
    }

    public static void main(String[] args) {

        // File file = new File("pw");
        // System.out.println(file.exists());
        // try {
        // file.createNewFile();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // System.out.println(file.exists());

        File dir = new File("pw");
        System.out.println(dir.exists());
        dir.mkdirs();
        System.out.println(dir.exists());

    }
}