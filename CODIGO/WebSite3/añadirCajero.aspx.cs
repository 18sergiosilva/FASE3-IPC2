using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using WSProyectoReference;

public partial class añadirCajero : System.Web.UI.Page
{

    int uno, dos;
    double uno1, dos2;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox4.Text);
        respuesta = proxy.agregarOperador(3, TextBox1.Text, TextBox2.Text, uno, TextBox3.Text);
    }
}