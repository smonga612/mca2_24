class jagarray
{
public static void main(String args[])
{
int k=0;
int marks[][]=new int[4][];
marks[0]=new int[15];
marks[1]=new int[10];
marks[2]=new int[7];
marks[3]=new int[12];

for(int i=0;i<4;i++)
{
k=1;
for(int j=0;j<marks[i].length;j++)
{
marks[i][j]=k++;
}
}

for(int i=0;i<4;i++)
{
System.out.println("");
for(int j=0;j<marks[i].length;j++)
{
System.out.print(marks[i][j]+ " ");
}
}







}
}