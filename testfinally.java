class testfinally
{
public static void main(String args[])
{
try
{
throw new Exception();

}
catch(Exception ae)
{
System.out.println("Inside catch");
}
finally
{
System.out.println("Inside finally");
}
}

}