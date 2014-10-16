README DB Driver 

1. Oracle
   Ddriver [oracle.jdbc.driver.OracleDriver]
   URL     [jdbc:oracle:thin:@localhost:1521:DBNAME]
 
2. Sybase
   Ddriver [com.sybase.jdbc2.jdbc.SybDriver]
   URL     [jdbc:sybase:Tds:localhost:5001/DBNAME]
   * JDBC드라이버 : jTDS2.jar
 
3. MS-SQL
   Driver [com.microsoft.sqlserver.jdbc.SQLServerDriver]
   URL   [jdbc:sqlserver://localhost:1433;DatabaseName=DBNAME]
   * JDBC드라이버 : sqljdbc.jar 혹은 sqljdbc4.jar (MS-SQL 2008까지 지원)
 
   Driver [com.microsoft.jdbc.sqlserver.SQLServerDriver]
   URL   [jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=DBNAME]
   * JDBC드라이버 : msbase.jar, mssqlserver.jar, msutil.jar
 
   Driver [core.log.jdbc.driver.Mssql2005Driver]
   URL   [jdbc:sqlserver://localhost:1433;database=DBNAME]
   * JDBC드라이버 : log4sql.jar
 
   Driver [net.sourceforge.jtds.jdbc.Driver]
   Driver [net.sourceforge.jtds.jdbcx.JtdsDataSource]
   URL   [jdbc:jtds:sqlserver://localhost:1433/DBNAME;tds=8.0;lastupdatecount=true]
   * JDBC드라이버 : jtds-1.2.jar
 
4. DB2
   Driver [COM.ibm.db2.jdbc.net.DB2Driver]  // Type 3 (v9.x 이상부터 지원안함)
   Driver [com.ibm.db2.jcc.DB2Driver]  // Type 4
   URL   [jdbc:db2://localhost:50000/DBNAME]
   * JDBC드라이버 : db2jcc.jar, db2jcc_javax.jar, db2jcc_license_cu.jar
 
5. UniSQL
   Driver [unisql.jdbc.driver.UniSQLDriver]
   URL   [jdbc:unisql:localhost:43300:DBNAME:::]
 
6. MySQL
   Driver [com.mysql.jdbc.Driver]
   Driver [org.gjt.mm.mysql.Driver]
   URL   [jdbc:mysql://localhost:3306/DBNAME]
   * JDBC드라이버 : mysql-connector-java-5.1.6-bin.jar 

6-1. MariaDB
   Driver [org.mariadb.jdbc.Driver]
   URL [jdbc:mariadb://localhost:3306/DBNAME]
   * JDBC드라이버 : mariadb-java-client-1.1.3.jar
   * MariaDB와 MySQL은 같은 핏줄이기 때문에 6번을 사용해도 무관
 
7. Altibase
   Driver [Altibase.jdbc.driver.AltibaseDriver]
   URL   [jdbc:Altibase://localhost:20300/DBNAME]
   * JDBC 드라이버 : Altibase.jar
 
8. hsqldb
   Driver [org.hsqldb.jdbcDriver]
   URL   [jdbc:hsqldb:hsql://localhost:9001/DBNAME]
   