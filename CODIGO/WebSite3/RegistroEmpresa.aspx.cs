using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class RegistroEmpresa : System.Web.UI.Page
{

    int patente;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        patente = Convert.ToInt32(TextBox1.Text);
        respuesta = proxy.registroEmpresa(patente, TextBox2.Text, TextBox3.Text, TextBox4.Text, TextBox5.Text, TextBox6.Text);
        if (respuesta.Equals("REGISTRO EXITOSO"))
        {
            Server.Transfer("primero.aspx", true);
        } else
        {
            Console.Write("NO SE PUDO REGISTRAR LA EMPRESA");
        }

    }
}