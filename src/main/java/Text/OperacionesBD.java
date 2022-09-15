
package Text;

import beans.Puesto;
import connection.DBConnection;
import java.sql.Statement;
import java.sql.ResultSet;


public class OperacionesBD {
    public static void main (String[] args){
        listarPuestos();
        //actualizarPuesto(1, "Sur");
    }
        public static void actualizarPuesto( int id, String zona){
           DBConnection con = new DBConnection();
           String sql ="UPDATE puestos SET zona = '"+ zona + "'WHERE id= "+id;
            try {
               Statement st = con.getConnection().createStatement();
               st.executeLargeUpdate(sql);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                
            }
            finally{
                con.desconectar();
            }
        }
        
        public static void listarPuestos(){
           DBConnection con = new DBConnection();
           String sql ="SELECT * FROM puestos";
            try {
               Statement st = con.getConnection().createStatement();
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                   int id = rs.getInt("id");
                   String puesto = rs.getString("puesto");
                   String zona = rs.getString("zona");
                   boolean disponible = rs.getBoolean("disponible");
                   
                   Puesto puestos = new Puesto(id, puesto, zona, disponible);
                   System.out.println(puestos.toString());
               }  
               st.executeQuery(sql);               
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            finally{
                con.desconectar();
            }
        }
}
