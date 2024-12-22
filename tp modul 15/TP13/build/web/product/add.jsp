<%-- 
    Document   : add
    Created on : 8 Dec 2024, 11.16.23
    Author     : pc
--%>
<%
    HttpSession mySession = request.getSession();
    if (session.getAttribute("JSP session") == null) {
        response.sendRedirect("session.jsp");
        return; // tambahkan return untuk menghentikan eksekusi kode selanjutnya
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Barang</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body class="vh-100 d-flex justify-content-center align-items-center bg-light">
        <form method="post" action="../addServlet" class="bg-white p-4 rounded shadow-sm" style="width: 100%; max-width: 400px;">
            <h3 class="text-center fw-bold mb-4 text-dark">Tambah Barang</h3>
            
            <div class="mb-3">
                <label for="nama" class="form-label">Nama</label>
                <input type="text" id="nama" name="nama" class="form-control" placeholder="Masukkan nama barang" required> 
            </div>
            
            <div class="mb-3">
                <label for="jumlah" class="form-label">Jumlah</label>
                <input type="number" id="jumlah" name="jumlah" class="form-control" placeholder="Masukkan jumlah barang" required> 
            </div>
            
            <div class="mb-3">
                <label for="harga" class="form-label">Harga</label>
                <input type="number" id="harga" name="harga" class="form-control" placeholder="Masukkan harga barang" required> 
            </div>
            
            <div class="text-center">
                <button type="submit" id="submit-btn" class="btn btn-primary w-100">Kirim</button>
            </div>
        </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
