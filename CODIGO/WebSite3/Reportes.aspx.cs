using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Reportes : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        System.Diagnostics.Process.Start("C:\\Users\\elizabeth\\Desktop\\Productos mas Solicitados.pdf");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        System.Diagnostics.Process.Start("C:\\Users\\elizabeth\\Desktop\\proveedores mas solicitados.pdf");
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        System.Diagnostics.Process.Start("C:\\Users\\elizabeth\\Desktop\\acciones.pdf");
    }

    protected void Button4_Click(object sender, EventArgs e)
    {
        System.Diagnostics.Process.Start("C:\\Users\\elizabeth\\Desktop\\cuentas.pdf");
    }
}