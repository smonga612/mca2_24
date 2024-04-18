class mythread extends Thread
{
int n;
mythread(int n,String name)
{
this.n=n;
setName(name);
}
public void run()
{
System.out.println("Current Thread :"+currentThread());
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}

class testthread
{
public static void main(String args[])
{
mythread t1=new mythread(5,"t1");
t1.start();
mythread t2=new mythread(15,"t2");
t2.start();
//mythread t3=new mythread(12);
//t3.run();



}
}