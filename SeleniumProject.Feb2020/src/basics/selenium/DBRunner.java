package basics.selenium;

public class DBRunner {

	public static void main(String[] args) {
		
		// connect to DB or Establish  a connection with DB
		JDBCUtility.setupDBConnection();
		JDBCUtility.runQuery("select * from public.actor");
		JDBCUtility.returnResult();
		JDBCUtility.closeDBConnection();
		
		//1.  Important classes of JDBC
			//a.  Connection Class--Connect to DB using URL (host:port database name, username, password)
			//b.  Statement Class--execute the query
			//c.  ResultSet--Store the output of the query
			//d.  DriverManager--will be use for connection to DB driveri.
		
	}

}
