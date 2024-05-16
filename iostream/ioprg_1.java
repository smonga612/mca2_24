class testio
{
public static void main(String args[])
{
int i=0;
int r;
try
{
System.out.println("Standard output to out file...");
System.out.println("Success");

r=100/i;
}
catch(Exception e)
{
System.err.print("Error to error file");
System.out.print("Standard Error to error file....");

}




}
}