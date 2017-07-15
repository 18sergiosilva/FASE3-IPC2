using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;
public partial class historialPuntos : System.Web.UI.Page
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
        respuesta = proxy.historialPuntos(uno);
        Button2.Text = respuesta;
        Button2.Visible = true;
    }

    protected void Button2_Click(object sender, EventArgs e)
    {

    }
}