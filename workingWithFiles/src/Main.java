import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      // creatFile();
        // getFileInfo();
        readFile();
        writeFile();
        readFile();

    }
    public static void creatFile(){
        File file = new File("C:\\Users\\enes\\javaprojects\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluşturuldu");
            }
            else {
                System.out.println("dosya oluşturulamadı");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\enes\\javaprojects\\students.txt");
        if(file.exists()){
            System.out.println("dosya adı:" + file.getName());
            System.out.println("dosya pathı" + file.getAbsolutePath());
            System.out.println("dosyanın boyutu: (byte)" + file.length());
            System.out.println("dosya okunabilir mi :" + file.canRead());
            System.out.println("dosya yazılabilir mi :" + file.canWrite());
        }

    }
    public static void readFile(){
        File file = new File("C:\\Users\\enes\\javaprojects\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line= reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public static void writeFile(){
        try {
           BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\enes\\javaprojects\\students.txt",true));
           writer.newLine();
           writer.write("nursema");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}