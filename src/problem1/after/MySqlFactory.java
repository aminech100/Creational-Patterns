package problem1.after;

public class MySqlFactory extends DatabaseFactory{
    public DbConnection createConnection(){
        return new MySqlConnection();
    }
    public SqlDialect createDialect(){
        return new MySqlDialect();
    }
}
