using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using WSProyectoReference;

public partial class verPrestamos : System.Web.UI.Page
{
    int uno, dos, tres;
    double uno1, dos2, tres3;
   
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String [] respuesta;
    String [] aux;
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

        TableCell tCell23 = new TableCell();
        tRow.Cells.Add(tCell23);


        tCell.Text = "IDENTIFICADOR PRESTAMO";
        tCell2.Text = "MONTO";
        tCell23.Text = "IDENTIFICADOR CLIENTE";

        uno = Convert.ToInt32(TextBox2.Text);
        respuesta = proxy.verPres(uno);

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

                TableCell tCell5 = new TableCell();
                tCell5.Text = aux[2];
                tRow2.Cells.Add(tCell5);

            }


        }
    }
}