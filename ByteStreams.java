import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args)  {
        String newpath = "input.txt";
        String text = "Okk! we are happy No I am not happy--!";
        // FileReader fi = new FileReader(newpath);
        try {
            final FileOutputStream fi = new FileOutputStream(newpath);
            fi.write(text.getBytes());
            System.out.print("Writing is done ---!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(newpath);
            int data;
            while((data =in.read()) != -1){
                System.out.println((char)data);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print(e.getMessage());
        }
        

    }
}
