
	import java.io.*;

	class MList
	{
	public static void main(String v[])
	{
	try
	{
	BufferedReader reader = new BufferedReader( new FileReader("d:/marks.txt"));

	String data;
	while( ( data = reader.readLine( ) ) != null )
	{
	String rec[ ] = data.split(",");
	
	int t1 = Integer.parseInt( rec[2] );
	int t2 = Integer.parseInt( rec[3] );
	int t3 = Integer.parseInt( rec[3] );
	double avg;
	if( t1 < t2 && t1 < t3 )
	avg = (t2+t3)/2.0;
	else if( t2 < t1 && t2 < t3 )
	avg = (t1+t3)/2.0;
	else
	avg = (t1+t2)/2.0;

	String result = "Pass";
	if( avg < 50 ) result = "Fail";
	
	String o = String.format("%s  %-20s \t %s \t %s \t %s \t %f  \t %s" , rec[0] , rec[1] ,rec[2] , rec[3] , rec[4] , avg , result );
	System.out.println(o);
	}

	reader.close();
	}
	catch( Exception e )
	{
	 System.out.println(e);
	}

	}
	}
