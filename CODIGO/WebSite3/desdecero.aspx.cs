using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;
public partial class desdecero : System.Web.UI.Page
{

    int uno, dos,tres,cuatro;
    double uno1, dos2,tres3;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox1.Text);
        dos = Convert.ToInt32(TextBox8.Text);
        uno1 = Convert.ToDouble(TextBox11.Text);
        dos2 = Convert.ToDouble(TextBox12.Text);
        tres = Convert.ToInt32(TextBox13.Text);
        tres3 = Convert.ToDouble(TextBox14.Text);
        cuatro = Convert.ToInt32(TextBox15.Text);

        proxy.registroIndividual(uno, TextBox2.Text, TextBox3.Text, TextBox4.Text, TextBox5.Text, TextBox6.Text, TextBox7.Text, dos, TextBox9.Text);
        proxy.crearCuenta(TextBox2.Text, uno1, dos2, tres, uno);
        respuesta = proxy.empleados(tres3, cuatro, uno);
    }
}