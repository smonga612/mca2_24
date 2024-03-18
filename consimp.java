class student
{
int rollno;
String name;

student() //default constructor
{
rollno=9999;
name="None";
System.out.println("Inside default constructor");

}


student(int r,String n) //parametrized constructor
{
rollno=r;
name=n;
System.out.println("Inside parametrized constructor");
}

student (student s) //copy constructor
{
rollno=s.rollno;
name=s.name;
System.out.println("Inside copy constructor");

}


void setName(String n)
{
name=n;
}
void setRollno(int r)
{
rollno=r;
}
String getName()
{
return(name);
}
int getRollno()
{

return(rollno);
}


}

class consimp
{
public static void main(String args[])
{
student s1=new student(121,"Arun");
student s2=new student();
student s3=new student(s1);

System.out.println("Object created successfuly");
System.out.println(s1.getRollno()+" "+s1.getName());
System.out.println(s2.getRollno()+" "+s2.getName());
System.out.println(s3.getRollno()+" "+s3.getName());

//s1.setRollno(123);
//s1.setName("Ravi");
//System.out.println(s1.getRollno()+" "+s1.getName());



}


}
