<%@ Page Language="C#" AutoEventWireup="true" CodeFile="primero.aspx.cs" Inherits="primero" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>BanQuetzal</title>

    <link rel="stylesheet" href="style.css"/>

</head>


<body>

    <form id="form1" runat="server">

    <div class="login-page">
        <div class="form">
            <asp:TextBox ID="TextBox1" runat="server">Identificador*</asp:TextBox>
&nbsp;<asp:TextBox ID="TextBox2" runat="server" TextMode="Password"></asp:TextBox>
            <asp:DropDownList ID="DropDownList1" runat="server" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged1" Width="268px">
                <asp:ListItem>INDIVIDUAL</asp:ListItem>
                <asp:ListItem>EMPRESARIAL</asp:ListItem>
                <asp:ListItem>TRABAJADOR</asp:ListItem>
            </asp:DropDownList>
            <asp:Button ID="Button1" runat="server" BackColor="#009900" OnClick="Button1_Click" Text="INICIAR SESION" />
                <p class="message">¿Aun no tiene una cuenta? <a href="RegistroIndividual.aspx">Registrarme</a></p>
                <p class="message">¿Esta asociado a una empresa? <a href="RegistroEmpresa.aspx">Registrar mi empresa</a></p>
        </div>
    </div>
    </form>
</body>
</html>
