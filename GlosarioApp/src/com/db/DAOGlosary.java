package com.db;

import com.pojo.Concept;
import com.util.Log;
import com.util.Query;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOGlosary {
    
    private static DAOGlosary db = null;
    private static Connection connection = null;
    private Statement st = null;
    
    private DAOGlosary() throws Exception{
        connection = DriverManager.getConnection("jdbc:sqlite:" + Query.NAME_DB);
        st = connection.createStatement();
        try{
            createDb();
        }catch(Exception e){
            Log.p("No se pudó crear la db");
            e.printStackTrace();
            
        }
    }
    
    //Singleton 
    public static DAOGlosary getInstance() throws Exception{
        if(db == null){
            db = new DAOGlosary();
        }
        return db;
    }
    
    public void insert(Concept concept)throws Exception{
        st.executeUpdate(Query.insertData(concept));
    }
    
    public void actualizar(Concept concept) throws Exception{
        st.executeUpdate(Query.updateData(concept));
    }
    
    public void delete(int id) throws Exception{
        st.executeUpdate(Query.deleteData(id));
    }
    
    public Concept read(int id) throws Exception{
        Concept concept = new Concept();
        ResultSet rs =  st.executeQuery(Query.read(id));
        
        concept
                .setId(rs.getInt(Query.COLUMN_ID))
                .setName(rs.getString(Query.COLUMN_NAME))
                .setDescription(rs.getString(Query.COLUMN_DESCRIPTION));
        
        return concept;
    }
    
    public List<Concept> getAll() throws Exception{
        List<Concept> lista = new ArrayList<>();
        ResultSet rs = st.executeQuery(Query.readAll());
        
        while(rs.next()){
            lista.add(
                    new Concept(
                            rs.getString(Query.COLUMN_NAME),
                            rs.getString(Query.COLUMN_DESCRIPTION), 
                            rs.getInt(Query.COLUMN_ID))
            );
        }
        
        return lista;
    }
    
    public static void close(){
        try {
            connection.close();//cierro la conexion a la db
            db = null;//elimino la instancia de db
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void createDb() throws Exception{
        File database = new File(Query.NAME_DB);
        
        if(!database.exists())
            st.execute(Query.createDb());    
    }
}
