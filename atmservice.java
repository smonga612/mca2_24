class accountservice implements Runnable
{
static int bal_amt=1000;
void getMoney(String name)
{
System.out.println("Login by "+name);
synchronized(this)
{
if(bal_amt==1000)
{
System.out.println("Transaction done by "+name);
bal_amt=bal_amt-1000;
System.out.println("Rs 1000 withdraw by "+name+ " and new balance is "+bal_amt);
}
else
{
System.out.println("Insufficent Balance");
}
}
}

public void run()
{
Thread t=Thread.currentThread();
String name=t.getName();
getMoney(name);
}
}

class atmimp
{
public static void main(String args[])
{
accountservice a1=new accountservice();
Thread atm1=new Thread(a1);
Thread atm2=new Thread(a1);
Thread atm3=new Thread(a1);

atm1.setName("Ravi");
atm2.setName("Ajay");
atm3.setName("Vishal");

atm1.start();
atm2.start();
atm3.start();





}
}