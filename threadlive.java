class mythread implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.println("Value of i is "+i);

}


}

class threadtest
{
public static void main(String args[]) throws InterruptedException
{
mythread m1=new mythread();
Thread t1=new Thread(m1);
Thread t2=new Thread(m1);
Thread t3=new Thread(m1);

t1.start();
t2.start();
t3.start();
System.out.println("Thread t1 is alive :"+t1.isAlive());
System.out.println("Thread t2 is alive :"+t2.isAlive());
t1.join();
//t2.join();

System.out.println("Thread t1 is alive :"+t1.isAlive());
System.out.println("Thread t2 is alive :"+t2.isAlive());

System.out.println("Main thread exit");

}


}