import java.io.*;
import java.util.*;
class filereadwrite
{
public static void main(String args[]) throws Exception
{
int n;
System.out.println("Enter the number ");
Scanner in =new Scanner(System.in);
n=in.nextInt();

File output=new File("mca_2.txt");
FileWriter fw=new FileWriter(output);
for(int i=1;i<=10;i++)
fw.write("\n"+n+"*"+i+"="+n*i);
fw.close();

FileReader fr=new FileReader(output);
int c;
while((c=fr.read())!=-1)
System.out.print((char)c);

fr.close();





}
}