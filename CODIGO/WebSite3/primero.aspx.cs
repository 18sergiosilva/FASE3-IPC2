using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using WSProyectoReference;

public partial class primero : System.Web.UI.Page
{

    int patente;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void DropDownList1_SelectedIndexChanged1(object sender, EventArgs e)
    {
       

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        patente = Convert.ToInt32(TextBox1.Text);
        respuesta = proxy.iniciarSesion(DropDownList1.Text, patente, TextBox2.Text);
        
        if (respuesta.Equals("SE INICIO LA SESION") && DropDownList1.Text.Equals("INDIVIDUAL"))
        {
            Server.Transfer("generic.aspx", true);
        } else if (respuesta.Equals("SE INICIO LA SESION") && DropDownList1.Text.Equals("EMPRESARIAL"))
        {
            Server.Transfer("generic - Copy - Copy - Copy.aspx", true);
        } else if (respuesta.Equals("SE INICIO LA SESION") && DropDownList1.Text.Equals("TRABAJADOR") && patente ==1)
        {
            Server.Transfer("generic - Copy.aspx", true);
        } else if (respuesta.Equals("SE INICIO LA SESION") && DropDownList1.Text.Equals("TRABAJADOR"))
        {
            Server.Transfer("generic - Copy - Copy.aspx", true);
        } else
        {
            Console.Write("NO SE PUDO INICIAR SESION");
        }
    }
}