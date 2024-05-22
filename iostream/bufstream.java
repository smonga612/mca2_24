import java.io.*;

class bufferstream
{
public static void main(String args[]) throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
char c;
//c=(char)br.read();
//System.out.println(c);
String name=br.readLine();
System.out.println(name);

OutputStreamWriter osw=new OutputStreamWriter(System.out);
BufferedWriter bw=new BufferedWriter(osw);

bw.write("Hello world");
bw.flush();




}
}