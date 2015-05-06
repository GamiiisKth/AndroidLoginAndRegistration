package com.androidhive.loginandregister;

import com.jcraft.jsch.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * Created by joshuapro on 15-05-05.
 */

public class CloudDB {
    public static void main(String[] args) throws SQLException {

        int lport=5656;
        String rhost="secure.journaldev.com";
        String host="secure.journaldev.com";
        int rport=3306;
        String user="pi";
        String password="grupp16";
        String dbuserName = "root";
        String dbpassword = "grupp16";
        String url = "jdbc:mysql://213.114.158.137:"+lport+"/Cloud";
        String driverName="com.mysql.jdbc.Driver";
        Connection conn = null;
        Session session= null;
        try{
            //Set StrictHostKeyChecking property to no to avoid UnknownHostKey issue
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            session=jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();


            // int assinged_port=
            session.setPortForwardingL(lport, rhost, rport);


            //mysql database connectivity
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection (url, dbuserName, dbpassword);


        //TODO här ska koden för databasen
        }catch(Exception e){
            e.printStackTrace();


        }finally{
            if(conn != null && !conn.isClosed()){
                System.out.println("Closing Database Connection");
                conn.close();
            }
            if(session !=null && session.isConnected()){
                System.out.println("Closing SSH Connection");
                session.disconnect();
            }
        }
    }




}
