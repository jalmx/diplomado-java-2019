package lib.base;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;//objeto que me ayuda a conectarme a la db

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:mi_db.db");//crea la conexión a la db

            Statement statement =  connection.createStatement();//el medio con el que voy a hablar con la db

            String nameTable = "phones";
            String columnId = "_id";
            String columnName = "name";
            String columnModel = "model";
            String columnPrice = "price";

            String query = "CREATE TABLE " + nameTable +
                    " ( " + columnId + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                     + columnName + " TEXT NOT NULL,"
                     + columnModel + " TEXT NOT NULL UNIQUE," //NO PUEDE ESTAR VACÍO Y ES UNICO
                    + columnPrice + " REAL "
                     + "); " ;//QUERY PARA CREAR LA TABLA

            System.out.println(query);
            //statement.executeUpdate(query); //ESTOY CREANDO LA TABLA
            System.out.println("Tabla creada");

            //int id = 3;
            String name = "\"Xperia\"";
            String model = "\"Z5\"";
            String name2 = "\"Nokia\"";
            String model2 = "\"3310\"";
            String name3 = "\"iPhone\"";
            String model3 = "8";

            /*query = "INSERT INTO " + nameTable + "(" +
                    columnName + ", " + columnModel + ", "+ columnPrice+
                    " )" +
                    " VALUES ( "
                    + name + ", " + model + ", "+ " 6324.44"
                    + ");";//ESTOY INSERTANDO UN DATO
            System.out.println(query);
            statement.executeUpdate(query);


            query = "INSERT INTO " + nameTable + "(" +
                    columnName + ", " + columnModel + ", "+ columnPrice+
                    " )" +
                    " VALUES ( "
                    + name2 + ", " + model2 + ", "+ " 6324.44"
                    + ");";//ESTOY INSERTANDO UN DATO
            System.out.println(query);
            statement.executeUpdate(query);

            query = "INSERT INTO " + nameTable + "(" +
                    columnName + ", " + columnModel + ", "+ columnPrice+
                    " )" +
                    " VALUES ( "
                    + name3 + ", " + model3 + ", "+ " 6324.44"
                    + ");";//ESTOY INSERTANDO UN DATO
            System.out.println(query);
            statement.executeUpdate(query);


            query = "SELECT * FROM "+ nameTable;
            ResultSet resultSet = statement.executeQuery(query);//TRAER TODOS LOS DATOS DE MI DB
            System.out.println("Leyendo todos mis datos");

            while(resultSet.next()){
                String idDb = "La posicion es " + resultSet.getInt(columnId);
                String nameDb = "El contenido es: " + resultSet.getString(columnName);

                System.out.println(
                        String.format("%s -> %s", idDb, nameDb)
                );
            }*/

            query = "UPDATE " + nameTable + " SET " + columnPrice+"=100.0 WHERE "+ columnId+"=2;" ;

            System.out.println(query);

            statement.executeUpdate(query);

            query = "SELECT * FROM "+ nameTable;
            ResultSet resultSet = statement.executeQuery(query);//TRAER TODOS LOS DATOS DE MI DB
            System.out.println("Leyendo todos mis datos");

            while(resultSet.next()){
                String idDb = "La posicion es " + resultSet.getInt(columnId);
                String nameDb = "El contenido es: " + resultSet.getString(columnName);
                String priceDb = "El price es: " + resultSet.getString(columnPrice);

                System.out.println(
                        String.format("%s -> %s costo: $%s", idDb, nameDb, priceDb)
                );
            }

            query = "DELETE FROM " + nameTable + " WHERE " + columnId+"=3";//Voy a borrar al elemento del renglón 3
            System.out.println(query);

            statement.executeUpdate(query);//ejecuto la acción de borrar

            query = "SELECT * FROM "+ nameTable;
            resultSet = statement.executeQuery(query);//TRAER TODOS LOS DATOS DE MI DB
            System.out.println("Leyendo todos mis datos");

            while(resultSet.next()){
                String idDb = "La posicion es " + resultSet.getInt(columnId);
                String nameDb = "El contenido es: " + resultSet.getString(columnName);
                String priceDb = "El price es: " + resultSet.getString(columnPrice);

                System.out.println(
                        String.format("%s -> %s costo: $%s", idDb, nameDb, priceDb)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
