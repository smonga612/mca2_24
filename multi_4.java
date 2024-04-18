class testthread
{
public static void main(String args[])
{
new Thread(
	new Runnable()
	{
		public void run()
		{
			for(int i=1;i<=10;i++)
			System.out.println("Value of i is "+i);
		}


	}	

	).start();


new Thread(
	new Runnable()
	{
		public void run()
		{
			for(int j=10;j>=0;j--)
			System.out.println("Value of j is "+j);
		}


	}	

	).start();


}
}