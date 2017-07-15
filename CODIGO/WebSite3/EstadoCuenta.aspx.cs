using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WSProyectoReference;

public partial class EstadoCuenta : System.Web.UI.Page
{
    int uno, dos;
    double uno1, dos2;
    WSProyectoIPC2Client proxy = new WSProyectoIPC2Client();
    String[] respuesta;
    String[] aux;
    String[] respuesta2;
    String[] aux2;
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    

    protected void Button1_Click1(object sender, EventArgs e)
    {
        TableRow tRow = new TableRow();
        Table1.Rows.Add(tRow);


        TableCell tCell = new TableCell();
        tRow.Cells.Add(tCell);

        TableCell tCell2 = new TableCell();
        tRow.Cells.Add(tCell2);


        tCell.Text = "DEBE";
        tCell2.Text = "HABER";


        uno = Convert.ToInt32(TextBox1.Text);
        respuesta = proxy.ECDeposito(uno);
        respuesta2 = proxy.ECRetiro(uno);


        if (DropDownList1.Text.Equals("3"))
        {
            if (respuesta.Length > 3 && respuesta2.Length > 3)
            {
                for (int i = 0; i < 3; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            } else if (respuesta.Length < 3)
            {
                for (int i = 0; i < respuesta.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            } else if (respuesta2.Length < 3)
            {
                for (int i = 0; i < respuesta2.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }

            

        }
        else if (DropDownList1.Text.Equals("6"))
        {
            if (respuesta.Length > 6 && respuesta2.Length > 6)
            {
                for (int i = 0; i < 6; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta.Length < 6)
            {
                for (int i = 0; i < respuesta.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta2.Length < 6)
            {
                for (int i = 0; i < respuesta2.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }


        }
        else if (DropDownList1.Text.Equals("9"))
        {
            if (respuesta.Length > 9 && respuesta2.Length > 9)
            {
                for (int i = 0; i < 9; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta.Length < 9)
            {
                for (int i = 0; i < respuesta.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta2.Length < 9)
            {
                for (int i = 0; i < respuesta2.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }


        }
        else
        {
            if (respuesta.Length > 12 && respuesta2.Length > 12)
            {
                for (int i = 0; i < 12; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta.Length < 12)
            {
                for (int i = 0; i < respuesta.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }
            else if (respuesta2.Length < 12)
            {
                for (int i = 0; i < respuesta2.Length; i++)
                {

                    TableRow tRow2 = new TableRow();
                    Table1.Rows.Add(tRow2);

                    TableCell tCell3 = new TableCell();
                    tCell3.Text = respuesta[i];
                    tRow2.Cells.Add(tCell3);


                    TableCell tCell4 = new TableCell();
                    tCell4.Text = respuesta2[i];
                    tRow2.Cells.Add(tCell4);


                }
            }


        }




    }
}