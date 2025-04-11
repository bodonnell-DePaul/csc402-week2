package csc402.week2;
import java.io.File;

/**
 * Hello world!
 *
 */
public class Recursion 
{
    public static void Countdown(int num)
    {
        if(num <= 0)
        {
            System.out.println("Blast off!");
        }
        else{
            System.out.println(num);
            Countdown(num-1);
        }

    }  
    
    public static String VisualCountdown(int num)
    {
        String star = "*";

        if(num >= 0){
            star += VisualCountdown(num-1);
        }
        System.out.println(star);
        return star;
    }

    public static void CountDownUp(String sep, int countdown)
    {
        if(countdown >= 0){
            sep+=sep;
            System.out.println(sep);
            CountDownUp(sep, countdown-1);
        }
        System.out.println(sep);
    }

    public static void TraverseFileSystem(File aFile, String spacer)
    {
        if(aFile.isDirectory())
        {
            System.out.println(spacer+"Directory: "+ aFile.getAbsolutePath());
        
            File [] files = aFile.listFiles();
            if(files != null){
                for(File f : files)
                {
                    TraverseFileSystem(f, spacer+spacer);
                }
            }
        }
        else{
            System.out.println(spacer+"     File: "+aFile.getAbsolutePath());
        }
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Countdown(5);
        VisualCountdown(5);
        CountDownUp("*", 5);

        
        String pathToStart = "C:\\Users\\bodonne3\\Documents";
        File path = new File(pathToStart);
        TraverseFileSystem(path, " ");
    }
}

