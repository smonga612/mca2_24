import java.io.*;
class bytestream
{
public static void main(String args[]) throws Exception
{
File output=new File("mca_2.png");
File input=new File("Python.png");

//FileInputStream fis=new FileInputStream(input);
//FileOutputStream fos=new FileOutputStream(output);
//int c;
//while((c=fis.read())!=-1)
//fos.write((byte)c);

FileReader fis=new FileReader(input);
FileWriter fos=new FileWriter(output);
int c;
while((c=fis.read())!=-1)
fos.write((char)c);


fos.close();
fis.close();
System.out.println("1 file copied");


}




}