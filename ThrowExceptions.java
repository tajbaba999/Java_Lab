import java.io.IOException;

public class ThrowExceptions {
    public static void main(String[] args) {
        ThrowExceptions th = new ThrowExceptions();
        try {
            th.readFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Caught message : "+e.getMessage());
        }
        finally{
            System.out.println("Final block exectued");
        }
        // private void readFile() throws IOException{
        //     throw new IOException("File not found");
        // }
    }

    private void readFile() throws IOException{
        throw new IOException("File not found");

    }
}
