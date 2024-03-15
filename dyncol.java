class dyncol
{
public static void main(String args[])
{
int r=Integer.parseInt(args[0]);
int c;
int marks[][]=new int[r][];

for (int i=0;i<r;i++)
{
c=Integer.parseInt(args[i+1]);
marks[i]=new int[c];
}

for(int i=0;i<r;i++)
{
System.out.println("");
for(int j=0;j<marks[i].length;j++)
{
System.out.print(marks[i][j]+" ");

}
}



}
}