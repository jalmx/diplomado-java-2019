package com.util;

import com.pojo.Concept;

public class Query {

    private Query() {
    }
    
    public static final String NAME_TABLE = "glosary";
    public static final String COLUMN_NAME = "name_concept";
    public static final String COLUMN_DESCRIPTION = "description_concept";
    public static final String COLUMN_ID = "_id";

    public static final String createDb(){
        return "CREATE TABLE " + NAME_TABLE + " ( "
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NAME + " TEXT,"
                + COLUMN_DESCRIPTION + " TEXT"
                + ");";
    }

    public static final String insertData(Concept concept){
        return String.format(
                "INSERT INTO \"%s\" ( %s, %s ) VALUES (\"%s\",\"%s\");", 
                NAME_TABLE, COLUMN_NAME, COLUMN_DESCRIPTION, 
                concept.getName(), concept.getDescription()
                );
    }
    
    public static final String updateData(Concept concept){
        return String.format(
                "UPDATE %s SET %s=\"%s\" , %s=\"%s\" WHERE %s=%d",
                NAME_TABLE, 
                COLUMN_NAME, concept.getName(),
                COLUMN_DESCRIPTION, concept.getDescription(),
                COLUMN_ID, concept.getId()
                );
    }
    
    public static final String deleteData(int id){
        return String.format(
                "DELETE FROM %s WHERE %s=%d",
                NAME_TABLE, COLUMN_ID, id
                );
    }
    
    public static final String readAll(){
        return String.format("SELECT * FROM %s", NAME_TABLE);
    }
    
    public static final String read(int id){
        return String.format(
                "SELECT * FROM %s WHERE %s=%d", 
                NAME_TABLE, COLUMN_ID, id);
    }
            
    public static void main(String[] args) {
    Log.p(
        createDb()
    );
    
    Log.p(insertData(new Concept("String", "Es un objeto cádena")));
    
    Log.p(updateData(new Concept("String", "Es un objeto cádena",1)));
    
    Log.p(deleteData(1));
    
    Log.p(readAll());
    
    Log.p(read(1));
    }
       
}
