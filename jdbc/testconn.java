import java.sql.*;

class student
{
Connection con;
void registerDriver() throws Exception
{
String DriverName="oracle.jdbc.driver.OracleDriver";
Class.forName(DriverName);
System.out.println("Driver loaded successfully");
}
void establishConnection() throws Exception
{
String URL="jdbc:oracle:thin:@localhost:1521:xe";
con=DriverManager.getConnection(URL,"scott","tiger");
System.out.println("Connection establish successully");
}

void runquery() throws Exception
{
String sql="select * from student";
Statement stmt=con.createStatement();
ResultSet rs= stmt.executeQuery(sql);
while(rs.next())
{
System.out.println(rs.getString(1)+" "+rs.getInt(2));
}

}




}

class teststudent
{
public static void main(String args[]) throws Exception
{
student s1=new student();
s1.registerDriver();
s1.establishConnection();
s1.runquery();
}
}