using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class canje : System.Web.UI.Page
{
    int uno, dos;
    double uno1, dos2;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String [] respuesta;
    String[] aux;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        TableRow tRow = new TableRow();
        Table1.Rows.Add(tRow);

       
        TableCell tCell = new TableCell();
        tRow.Cells.Add(tCell);

        TableCell tCell2 = new TableCell();
        tRow.Cells.Add(tCell2);


        tCell.Text = "PRODUCTO";
        tCell2.Text = "PUNTOS";


        respuesta = proxy.verProductos();

        for (int i = 0; i < respuesta.Length; i++)
        {
            aux = respuesta[i].Split(',');

            

            for (int j = 0; j < 1; j++)
            {

                TableRow tRow2 = new TableRow();
                Table1.Rows.Add(tRow2);

                TableCell tCell3 = new TableCell();
                tCell3.Text = aux[0];
                tRow2.Cells.Add(tCell3); 


                TableCell tCell4 = new TableCell();
                tCell4.Text = aux[1];
                tRow2.Cells.Add(tCell4);

            }
            

        }

        Label1.Visible = true;
        Label3.Visible = true;
        TextBox1.Visible = true;
        TextBox2.Visible = true;
        Button2.Visible = true;


    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        uno = Convert.ToInt32(TextBox1.Text);
        dos = Convert.ToInt32(TextBox2.Text);
        proxy.cambiarProducto("15/07/2017", uno, dos);
    }
}