import java.util.*;
class testio
{
public static void main(String args[])
{
Properties p=System.getProperties();
//p.list(System.out);
String curr_dir =System.getProperty("user.dir");
System.out.println("Current working directory is "+curr_dir);

System.out.println("JAVA Home directory is "+System.getProperty("java.home"));

}
}