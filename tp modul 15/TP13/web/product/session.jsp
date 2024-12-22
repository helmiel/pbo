<%-- 
    Document   : session
    Created on : 20 Dec 2024, 23.43.56
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="post" action="../LoginServlet">
            <input type="radio" name="sess" value="on" checked />
            Create Session <br />
            <input type="radio" name="sess" value="off" />
            Destroy Session <br />
            <input type="submit" value="OK" />
        </form>
        <%
        session = request.getSession();
        if (session.getAttribute("JSP session")==null) {
            out.print("session belum dibuat");
        } else {
            out.print("session telah dibuat, isi session: " +
            session.getAttribute("JSP session"));
            request.getRequestDispatcher("index.jsp");
        }
        %>
    </body>
</html>
