using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class RegistroIndividual : System.Web.UI.Page
{

    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String cui, edad, respuesta;
    int cui2, edad2;

    
    protected void Page_Load(object sender, EventArgs e)
    {
        

        


        

    }

    protected void TextBox8_TextChanged(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {


        cui = TextBox2.Text;
        edad = TextBox8.Text;
        cui2 = Convert.ToInt32(cui);
        edad2 = Convert.ToInt32(edad);
        respuesta = proxy.registroIndividual(cui2, TextBox4.Text, TextBox5.Text, TextBox6.Text, TextBox7.Text, TextBox1.Text, TextBox3.Text, edad2,TextBox9.Text);
        if(respuesta.Equals("REGISTRO EXITOSO"))
        {
            
                Server.Transfer("primero.aspx", true);
            
        } else{

            Console.Write("NO SE PUDO CREAR LA CUENTA");
        }

    }
}