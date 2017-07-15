using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class autorizarTerceros : System.Web.UI.Page
{

    int uno, dos;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox1.Text);
        dos = Convert.ToInt32(TextBox2.Text);
        respuesta = proxy.aprobarCuenta(uno, dos);
    }
}