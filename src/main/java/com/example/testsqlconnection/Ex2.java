package com.example.testsqlconnection;


import java.sql.*;
import java.util.ArrayList;

public class Ex2 {
    private final String url = "jdbc:postgresql://localhost:5500/Lib_restored";
    private final String user = "postgres";
    private final String password = "123";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }


    public static ArrayList<String> loadAuthorNames()
    {
        ArrayList<String> res= new ArrayList<>();
        Ex2 app = new Ex2();
        Connection con =app.connect();
        String s = "select fio from author";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(s);
            while (rs.next())
            {
                String t = rs.getString("fio");
                res.add(t);
            }
            //con.close();

        } catch (SQLException e) {
            System.out.println("упс");
        }
        return res;
    }

    public static void testConnection1() {
        Ex2 app = new Ex2();
        Connection con =app.connect();
        String s = "select * from book";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(s);

            while (rs.next())
            {
                int isbn = rs.getInt("isbn");
                String t = rs.getString("title");
                System.out.println(isbn+" "+t);
            }
            //con.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

