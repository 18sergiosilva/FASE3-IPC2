using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class SolicitudPrestamo : System.Web.UI.Page
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
        uno1 = Convert.ToDouble(TextBox1.Text);
        uno = Convert.ToInt32(DropDownList1.Text);
        dos = Convert.ToInt32(TextBox2.Text);
        respuesta = proxy.prestamos(uno1, uno, dos);
    }
}