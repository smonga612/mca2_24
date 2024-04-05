abstract class figure
{
int area;

int getArea()
{
return(area);
}
abstract void findArea();
}

class rectangle extends figure
{
int l,b;
rectangle(int x,int y)
{
l=x;
b=y;
}
void findArea()
{
area=l*b;
}
}

class circle extends figure
{
int radius;
circle(int r)
{
radius=r;
}
void findArea()
{
area=3*radius*radius;
}
}

class testfig
{
public static void main(String args[])
{
figure f=new figure();
rectangle r=new rectangle(2,3);
r.findArea();
System.out.println(r.getArea());

circle c=new circle(2);
c.findArea();
System.out.println(c.getArea());


}




}

