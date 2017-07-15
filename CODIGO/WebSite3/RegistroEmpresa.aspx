<%@ Page Language="C#" AutoEventWireup="true" CodeFile="RegistroEmpresa.aspx.cs" Inherits="RegistroEmpresa" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>Registro Empresas</title>

    <link rel="stylesheet" href="style.css">

</head>


<body>

    <div class="login-page">
        <div class="form">
            <form id="form1" runat="server">
                <asp:TextBox ID="TextBox1" runat="server">Patente Empresa*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox2" runat="server">Nombre Empresa*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox3" runat="server">Nombre Presidente*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox4" runat="server">Nombre Vicepresidente*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox5" runat="server">Nombre Contador*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox6" runat="server" TextMode="Password">Password*</asp:TextBox>
&nbsp;<asp:Button ID="Button1" runat="server" BackColor="#009900" OnClick="Button1_Click" Text="REGISTRAR MI EMPRESA" />
                <p class="message">¿Ya tiene una cuenta? <a href="primero.aspx">Ingresar</a></p>
            </form>
        </div>
    </div>
    <p class="message">
        &nbsp;</p>
</body>
</html>