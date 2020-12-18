import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class DOMDemo
{
 static public void main(String[]arg)
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
    DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
    DocumentBuilder builder=factory.newDocumentBuilder();
    InputSource ip_src= new InputSource(file_name);
    Document doc=builder.parse(ip_src);
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