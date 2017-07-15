<%@ Page Language="C#" AutoEventWireup="true" CodeFile="retiros.aspx.cs" Inherits="retiros" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Retiros</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Retiros</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>
    <!-- Nav -->
    <nav id="menu">
        <ul class="links">
            <li><a href="generic - Copy - Copy.aspx">Home</a></li>
            <li><a href="depositoCheque.aspx">Deposito Cheque</a></li>
            <li><a href="depositoEfectivo.aspx">Deposito Efectivo</a></li>
            <li><a href="cambiarCheque.aspx">Cambiar Cheque</a></li>
            <li><a href="retiros.aspx">Retiros</a></li>
            
        </ul>
    </nav>
    <!-- Main -->
    <section id="main">
        <div class="inner">

            <header>


                <h1>&nbsp;</h1>
                
                    <div>
                        <ul class="actions">
                            <li>CUENTA:
                                <asp:TextBox ID="TextBox1" runat="server" Width="523px"></asp:TextBox>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <li>MONTO:
                            <asp:TextBox ID="TextBox2" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Retiro Efectivo" Width="969px" />
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>
                    


            </header>

        </div>
    </section>
    <!-- Footer -->
    <footer id="footer">
        >
        <div class="copyright">
            &copy; Untitled. Sergio Silva 2017.
        </div>
    </footer>
   <!-- Scripts -->
			<script src="jquery.min.js"></script>
			<script src="jquery.scrolly.min.js"></script>
			<script src="skel.min.js"></script>
			<script src="util.js"></script>
			<script src="main.js"></script>
    </form>
</body>
</html>
