/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    private Connection connection;
    static String bd = "parqueateweb";
    static String port = "3307";
    static String login = "root";
    static String password = "admin";

    public DBConnection() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:"+this.port+ "/"+ this.bd;
           connection = (Connection) DriverManager.getConnection(url, this.login, this.password);
           System.out.println("Conexión Exitosa");
        }catch(Exception ex){
            System.out.println("Error en la conexión "+ ex);
        }
        
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
    
}
