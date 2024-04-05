class employee
{
String name;
int empid;
employee(int empid,String name)
{
this.empid=empid;
this.name=name;
}
int getempid()
{
return(empid);
}
String getempname()
{
return(name);
}

}


class director extends employee
{
director(int empid,String empname)
{
super(empid,empname);
}
void getsal()
{
System.out.println("Inside director salary");
}

}

class manager extends employee
{
manager(int empid,String empname)
{
super(empid,empname);
}

void getsal()
{
System.out.println("Inside manager salary");
}

}

class worker extends employee
{
worker(int empid,String empname)
{
super(empid,empname);
}

void getsal()
{
System.out.println("Inside worker salary");
}

}

class test
{
public static void main(String args[])
{
director d1=new director(121,"Ajay");
System.out.println(d1.getempid()+" "+d1.getempname());
d1.getsal();

manager m1=new manager(345,"Vishal");
System.out.println(m1.getempid()+" "+m1.getempname());
m1.getsal();



}
}



