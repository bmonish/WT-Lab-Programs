import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class SAXDemo
{
 public static void main(String[]args) throws IOException
 {
   try
   {
    System.out.print("Enter the name of XML document:");
    BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
    String file_name=input.readLine();
    File fp=new File(file_name);
    if(fp.exists())  
    {
     try
     {
    XMLReader reader =XMLReaderFactory.createXMLReader();
    reader.parse(file_name);
    System.out.println(file_name+" is well-formed!");
     }
     catch(Exception e)
     {
    System.out.println(file_name+" is not well-formed!");
    System.exit(1);
     }
    }
    else
    {
    System.out.print("File not Found!");
    }
   }
   catch(IOException ex)
   {
     ex.printStackTrace(); 
   }
 }
}
