import java.io.*;

class CO4Pgrm7
{
    public static void main(String arg[]) throws Exception
    {
        char txt;
        int wCount = 0, lCount = 1, charCount;
        File co4pgrm7 = new File("CO4Pgrm7.txt");
        FileInputStream fis = new FileInputStream(co4pgrm7);
        charCount = fis.available();
        for(int i = 0; i<charCount; i++)
        {
            txt = (char)fis.read();
            if(txt == '\n')
                lCount++;
            else if(txt == ' ')
                wCount++;
        }
        System.out.println("No.of words      : " + (wCount + lCount));
        System.out.println("No.of characters : " + charCount);
        System.out.println("No.of lines       : " + lCount);
    }
}