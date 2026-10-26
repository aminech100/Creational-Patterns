package problem1.after;

public class OracleFactory extends DatabaseFactory{
    public DbConnection createConnection() {
        return new OracleConnection();
    }
    public SqlDialect createDialect() {
        return new OracleDialect();
    }
}
