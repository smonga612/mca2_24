import java.io.*;
class student implements Serializable
{
String name;
int roll_no;
student(int roll_no,String name)
{
this.roll_no=roll_no;
this.name=name;
}
student()
{

}
String getName()
{
return(name);
}
int getRollno()
{
return(roll_no);
}

}


class teststudent
{
public static void main(String args[]) throws Exception
{
//student s1=new student(123,"Ravi");
File fname=new File("object.txt"); 
//FileOutputStream fos=new FileOutputStream(fname);
//ObjectOutputStream oos=new ObjectOutputStream(fos);
//oos.writeObject(s1);
//oos.close();


student s2=new student();
System.out.println("Object S2 value before reading data from file");
System.out.println(s2.getRollno());
System.out.println(s2.getName());

FileInputStream fis=new FileInputStream(fname);
ObjectInputStream ois=new ObjectInputStream(fis);
s2=(student)ois.readObject();

System.out.println("Object S2 value after reading data from file");
System.out.println(s2.getRollno());
System.out.println(s2.getName());


}
}