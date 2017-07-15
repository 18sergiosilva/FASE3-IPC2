using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using WSProyectoReference;
public partial class usuario_existente : System.Web.UI.Page
{

    int uno, dos,tres;
    double uno1, dos2,tres3;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox4.Text);
        dos = Convert.ToInt32(TextBox5.Text);
        tres = Convert.ToInt32(TextBox6.Text);
        uno1 = Convert.ToDouble(TextBox2.Text);
        dos2 = Convert.ToDouble(TextBox3.Text);
        tres3 = Convert.ToDouble(TextBox7.Text);
       proxy.crearCuenta(TextBox1.Text, uno1, dos2, uno, dos);
        respuesta = proxy.empleados(tres3, tres, dos);
    }
}