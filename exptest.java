import java.util.Scanner;

class checkageException extends Exception
{
checkageException()
{
}
}

class exptest
{
public static void main(String args[]) throws checkageException
{
Scanner in =new Scanner(System.in);
int age;
System.out.println("Enter the age");
age=in.nextInt();

if(age < 18)
{
throw new checkageException();

}
else
{
System.out.println("Valid age");
}

for(int i=0;i<10;i++)
{
System.out.println(i);
}



}
}

