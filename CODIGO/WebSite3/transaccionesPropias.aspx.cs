using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class transaccionesPropias : System.Web.UI.Page
{
    int uno, dos,tres;
    double uno1;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String respuesta;
    
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox1.Text);
        dos = Convert.ToInt32(TextBox2.Text);
        uno1 = Convert.ToDouble(TextBox3.Text);
        tres = Convert.ToInt32(TextBox4.Text);
        proxy.transaccionPropia(uno, dos, uno1, tres);

    }
}