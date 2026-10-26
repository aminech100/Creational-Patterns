package problem1.before;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- Test MySQL ---");
        new ReportDao("mysql").topStudents(3);

        System.out.println("\n--- Test SQL Server ---");
        new ReportDao("sqlserver").topStudents(3);
    }
}
