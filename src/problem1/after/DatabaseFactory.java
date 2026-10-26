package problem1.after;

public abstract class DatabaseFactory {
    public abstract DbConnection createConnection();
    public abstract SqlDialect createDialect();
    public static DatabaseFactory forName(String name) {
        switch (name.toLowerCase()) {
            case "mysql":
                return new MySqlFactory();
            case "sqlserver":
                return new SqlServerFactory();
            case "oracle":
                return new OracleFactory();
            default:
                throw new IllegalArgumentException("Unknown database: " + name);
        }
    }
}
