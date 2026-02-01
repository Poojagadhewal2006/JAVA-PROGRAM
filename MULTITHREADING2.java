class FileDownload extends  Thread
{
    String fileName;
    public  FileDownload(String fileName){
        this.fileName=fileName;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(fileName + " Downloading... " + (i*20) + " % ");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
        System.out.println("  ");
        System.out.println(fileName + " Done.... ");
       
    }
}
public class MULTITHREADING2 {
    public static void main(String[] args) {
        FileDownload f = new FileDownload("file A");
        FileDownload f1 = new FileDownload("file B");
        f.start();
        f1.start();
      // f.run();
      // f1.run();
    }
}
