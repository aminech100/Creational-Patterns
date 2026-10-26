package problem1.after;

public class SqlServerFactory extends DatabaseFactory{
    public DbConnection createConnection(){
        return new SqlServerConnection();
    }
    public SqlDialect createDialect(){
        return new SqlServerDialect();
    }
}
