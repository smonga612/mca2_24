class even
{

int check_even(int i)
{
if( i%2==0)
return(0);
else
return(1);
}

}

class evenodd extends even
{
void add_even()
{
int i,sum=0;
for (i=1;i<=20;i++)
if(check_even(i)==0)
sum=sum+i;

System.out.println("Sum of all even number "+sum);
}

void add_odd()
{
int i,sum=0;
for (i=1;i<=20;i++)
if(check_even(i)!=0)
sum=sum+i;
System.out.println("Sum of all odd numbers "+sum);
}


}


class sumeven extends evenodd implements Runnable
{
public void run()
{
add_even();
add_odd();

}

}


class testthread
{
public static void main(String args[])
{
sumeven s=new sumeven();
Thread t=new Thread(s);
t.start();

}


}

