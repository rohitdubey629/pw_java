import java.io.*;

class File2 {
    public static void main(String[] args) {
        String folderName = "pwJava";
        File dir = new File(folderName);
        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir in refering to directory pwJava : " + dir.isDirectory());

        String fileName = "pwSkill.txt";
        File file = new File(dir, fileName);
        try {
            file.createNewFile();
        } catch (Exception e) {

        }
        System.out.println("File in refering to puSkill.txt : " + file.isFile());

        // counting file in here
        int count = 0;
        File f = new File("FileHandling");
        String str[] = f.list();
        for (String name : str) {
            count++;
            System.out.println(name);
        }
        System.out.println("No of file are " + count);
    }
}