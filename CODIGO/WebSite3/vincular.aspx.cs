using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using WSProyectoReference;

public partial class vincular : System.Web.UI.Page
{

    int uno, dos, tres;
    double uno1, dos2, tres3;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox2.Text);
        dos = Convert.ToInt32(TextBox3.Text);
        uno1 = Convert.ToDouble(TextBox1.Text);
        respuesta = proxy.empleados(uno1, uno, dos);
    }
}