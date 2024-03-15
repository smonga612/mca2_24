class student
{
int roll_no;
String name;
void setRollno(int r)
{
roll_no=r;
}
void setName(String n)
{
name=n;
}
int getRollno()
{
return(roll_no);
}

String getName()
{
return(name);
}
}

class studimp
{
public static void main(String args[])
{
student s[]=new student[100];
for(int i=0;i<100;i++)
s[i]=new student();

for(int i=0;i<100;i++)
{
s[i].setRollno(123+i);
s[i].setName("Vishal"+i);
}
for(int i=0;i<100;i++)
{
System.out.println(s[i].getRollno()+" "+s[i].getName());
}

}
}

