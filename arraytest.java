class arraytest
{
public static void main(String args[])
{
//int a[]=new int[10];
//int[] a=new int[10]
//int a[]={10,9,8,7,6,5,4,3,2,1};
int n;
n=Integer.parseInt(args[0]);
int a[]=new int[n];

for(int i=0;i<n;i++)
a[i]=i+1;


for (int val : a)
{
System.out.println(val);
}


}
}