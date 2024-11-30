<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>TP MODUL 12</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="get" action="PrakServlet">
            NIM: <input type="text" name="nim" /> <br />
            Nama: <input type="text" name="nama" /> <br />
            <input type="submit" value="Kirim" />
        </form>
        <%
            out.print(request.getAttribute("nim")+"<br />");
            out.print(request.getAttribute("nama")+"<br />");
        %>
        
    </body>
</html>
