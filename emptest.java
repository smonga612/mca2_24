class emp
{
int empno;
String empname;
emp(int empno, String empname)
{

this.empno=empno;
this.empname=empname;
}
emp()
{
this(1001,"Arun");
}

int getEmpno()
{
return(empno);
}

String getEmpname()
{
return(empname);

}

}

class emptest
{
public static void main(String args[])
{
emp e1=new emp(1002,"Ravi");
System.out.println(e1.getEmpno());
System.out.println(e1.getEmpname());


}
}

