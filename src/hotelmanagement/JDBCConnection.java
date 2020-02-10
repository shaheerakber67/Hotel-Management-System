package hotelmanagement;


import java.sql.*;


class JDBCConnection {
    private static final String connectionUrl = 
           "jdbc:sqlserver://localhost:1433;" +
           "databaseName=HOTEL_MANAGEMENT;user=shaheer;password=123";
    static Connection con=null;

    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(connectionUrl);
            }catch(ClassNotFoundException | SQLException e){
            //JOptionPane.showMessageDialog(rootPane, e, null, JOptionPane.ERROR_MESSAGE); 
        }
        return con;
    }
}
