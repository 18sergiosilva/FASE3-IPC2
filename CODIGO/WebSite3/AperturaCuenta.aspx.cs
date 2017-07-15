using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;


public partial class AperturaCuenta : System.Web.UI.Page
{

    int uno,dos;
    double uno1, dos2;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;


    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno1 = Convert.ToDouble(TextBox1.Text);
        dos2 = Convert.ToDouble(TextBox2.Text);
        uno = Convert.ToInt32(TextBox3.Text);
        dos = Convert.ToInt32(TextBox4.Text);
        respuesta = proxy.crearCuenta(DropDownList1.Text, uno1, dos2, uno, dos);


    }
}