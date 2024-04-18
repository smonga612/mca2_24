class testthread
{
public static void main(String args[])
{
Runnable mythread=()->
{
for(int i=0;i<10;i++)
{
System.out.println("value of i is "+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
};

Runnable mythread1=()->
{
for(int j=10;j>0;j--)
{
System.out.println("value of j is "+j);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}

}


};



Thread t1=new Thread(mythread);
Thread t2=new Thread(mythread1);

t1.start();
t2.start();


}
}