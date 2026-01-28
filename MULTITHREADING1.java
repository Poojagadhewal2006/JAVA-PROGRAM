//WITHOUT USING MULTITHREADING IN THIS CODE
class downloadFile
{
    public static void file(String file){
        for(int i=1;i<=5;i++)
        {
            System.out.println(file + " Downloading... " + (i*20) + " % ");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
        System.out.println(file + " Done ");
        System.out.println("  ");
    }
}
public class MULTITHREADING1 {
    public static void main(String[] args) {
     downloadFile d = new downloadFile();
     d.file("file A");
     d.file("file B");
    }
}
