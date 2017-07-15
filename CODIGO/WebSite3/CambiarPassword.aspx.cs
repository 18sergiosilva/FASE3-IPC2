using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;


public partial class CambiarPassword : System.Web.UI.Page
{

    int uno, dos;
    double uno1, dos2;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }


    protected void Button1_Click1(object sender, EventArgs e)
    {
        dos = Convert.ToInt32(TextBox1.Text);
        respuesta = proxy.cambiarPassword(DropDownList1.Text, dos, TextBox2.Text, TextBox3.Text);
    }
}