interface figure
{
public void area();
}

class rectangle implements figure
{
public void  area()
{
System.out.println("Inside rectangle area");
}

}
class testprg
{
public static void main(String args[])
{
rectangle r1=new rectangle();
r1.area();
}


}