<%-- 
    Document   : view
    Created on : 8 Dec 2024, 11.16.39
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.JDBC"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Produk</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="fw-bold m-4 text-dark">Daftar Produk</h1>
        <div class="container mt-5">
            <a class="btn btn-primary mb-3" href="add.jsp" role="button">Tambah Barang</a>
            <table class="table table-info table-striped-columns text-center align-middle">
                <thead>
                    <tr>
                        <th>Nama</th>
                        <th>Jumlah</th>
                        <th>Harga</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        JDBC db = new JDBC();
                        if(db.isConnected){
                            ResultSet rs = db.getData("select * from barang");
                            while(rs.next()){
                                int id = rs.getInt("id");
                                out.print("<tr>");
                                out.print("<td>" + rs.getString("nama") + "</td>");
                                out.print("<td>" + rs.getInt("jumlah") + "</td>");
                                out.print("<td>" + rs.getFloat("harga") + "</td>");
                                out.print("<td>");
                                out.print("<a href='edit.jsp?id=" + id + "' class='btn btn-warning btn-sm me-2'>Edit</a>");
                                out.print("</td>");
                                out.print("</tr>");
                            }
                        }else {
                            out.print("<tr><td colspan='3' class='text-center'>Koneksi Database Gagal!</td></tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
