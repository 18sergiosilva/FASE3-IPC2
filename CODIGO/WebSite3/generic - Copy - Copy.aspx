<%@ Page Language="C#" AutoEventWireup="true" CodeFile="generic - Copy - Copy.aspx.cs" Inherits="generic" %>

<!DOCTYPE HTML>
<!--
	Binary by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>BanQuetzal</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="main.css" />
	</head>
	<body>

		<form id="form1" runat="server">

		<!-- Header -->
			<header id="header">
				<a href="index.html" class="logo"><strong>BanQuetzal</strong> Banca en Linea</a>
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
					<div class="image fit">
						<img src="pic11.jpg" alt="" />
					</div>
					<header>
                        
                        <p>Bienvenido</p>
                        
						<h1>
                            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Cerrar Sesion" Width="1044px" />
                        </h1>
						
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