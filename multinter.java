class mythread implements Runnable
{
public void run()
{
for (int i=1;i<=10;i++)
System.out.println("Value of i is "+i);
}
}

class testthread
{
public static void main(String args[])
{
mythread m1=new mythread();
Thread t1=new Thread(m1);
t1.start();
Thread t2=new Thread(m1);
t2.start();

}

}