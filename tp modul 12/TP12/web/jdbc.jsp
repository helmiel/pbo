<%-- 
    Document   : jdbc
    Created on : 30 Nov 2024, 15.29.09
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.JDBC"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JDBC</title>
    </head>
    <body>
        <%
            JDBC db = new JDBC();
            if (db.isConnected) {
                out.print(db.message + "<br />");
            } else {
                out.print(db.message + "<br />");
            }
            
            db.runQuery("INSERT INTO mahasiswa (nama, jurusan, angkatan, ipk) VALUES ('Hasan Rizky', 'Teknik Pertambangan', 2022, 3.84)");
            out.print(db.message + "<br />");
            db.disconnect();
            out.print(db.message + "<br />");
        %>
    </body>
</html>
