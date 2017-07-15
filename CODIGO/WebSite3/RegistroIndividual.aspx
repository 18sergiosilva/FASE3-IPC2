<%@ Page Language="C#" AutoEventWireup="true" CodeFile="RegistroIndividual.aspx.cs" Inherits="RegistroIndividual" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>Registro Individual</title>

    <link rel="stylesheet" href="style.css"/>

</head>


<body>

    <p>
        &nbsp;</p>
    <p>
        &nbsp;</p>
    <p>
        &nbsp;</p>
    <p>
        &nbsp;</p>
    <p>
        &nbsp;</p>

    <div class="login-page">
        <div class="form">
            <form id="form1" runat="server">
&nbsp;<asp:TextBox ID="TextBox2" runat="server">CUI*</asp:TextBox>
                <asp:TextBox ID="TextBox4" runat="server">Primer Nombre*</asp:TextBox>
                <asp:TextBox ID="TextBox5" runat="server">Segundo Nombre*</asp:TextBox>
                <asp:TextBox ID="TextBox6" runat="server">Tercer Nombre*</asp:TextBox>
                <asp:TextBox ID="TextBox7" runat="server">Primer Apellido*</asp:TextBox>
                <asp:TextBox ID="TextBox1" runat="server" style="margin-top: 0px">Segundo Apellido*</asp:TextBox>
                <asp:TextBox ID="TextBox3" runat="server">Fecha Nacimiento*</asp:TextBox>
                <asp:TextBox ID="TextBox8" runat="server" OnTextChanged="TextBox8_TextChanged">Edad*</asp:TextBox>
                <asp:TextBox ID="TextBox9" runat="server" TextMode="Password">Password*</asp:TextBox>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:Button ID="Button1" runat="server" BackColor="#009900" OnClick="Button1_Click" Text="REGISTRARME" />
&nbsp;<p class="message">¿Ya tiene una cuenta? <a href="primero.aspx">Ingresar</a></p>
            </form>
        </div>
    </div>
    <p class="message">
        &nbsp;</p>
    <p class="message">
        &nbsp;</p>
</body>
</html>