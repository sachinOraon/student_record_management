/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_record_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin
 */
public class MysqlConn {
    private static final String USER="root";
    private static final String PASS="aspire";
    private static final String CONN_STR="jdbc:mysql://localhost:3306/srm?useSSL=false";
    Connection conn=null;

    MysqlConn()
    {
    	try{
    		conn=DriverManager.getConnection(CONN_STR,USER,PASS);
    	}
    	catch(SQLException e){
                System.err.println(e);
    		JOptionPane.showMessageDialog(null, "Unable to connect to database !", "Connection error", JOptionPane.ERROR_MESSAGE);
    	}
    }

}
