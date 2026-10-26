package problem1.after;

public class Test {
    public static void main(String[] args){
        String[] dbs = {"mysql", "sqlserver","oracle"};

        for (String dbName : dbs){
            DatabaseFactory factory = DatabaseFactory.forName(dbName);
            ReportDao dao = new ReportDao(factory);
            dao.topStudents(3);
        }
    }
}
