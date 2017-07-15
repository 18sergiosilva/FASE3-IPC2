using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;
public partial class ARPrestamosEmpresa : System.Web.UI.Page
{
    int uno, cuatro;
    double dos, tres;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta1, respuesta2;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox1.Text);
        respuesta1 = proxy.promedioDepositos(uno);
        respuesta2 = proxy.promedioRetiros(uno);
        dos = Convert.ToDouble(respuesta1);
        tres = Convert.ToDouble(respuesta2);
        if (dos > 1000 && tres > 1000)
        {
            TextBox2.Text = dos + "";
            TextBox3.Text = tres + "";
            TextBox2.BackColor = System.Drawing.Color.Green;
            TextBox3.BackColor = System.Drawing.Color.Green;
        }
        else
        {
            TextBox2.Text = dos + "";
            TextBox3.Text = tres + "";
            TextBox2.BackColor = System.Drawing.Color.Red;
            TextBox3.BackColor = System.Drawing.Color.Red;
        }

        Label2.Visible = true;
        Label3.Visible = true;
        Label4.Visible = true;
        Label5.Visible = true;
        TextBox2.Visible = true;
        TextBox3.Visible = true;
        TextBox4.Visible = true;
        DropDownList1.Visible = true;
        Button2.Visible = true;
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        cuatro = Convert.ToInt32(TextBox4.Text);
        proxy.aprobarRechazarPrestamo(DropDownList1.Text, cuatro);
    }
}