using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Chapter7
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //Save button click
        private void button1_Click(object sender, EventArgs e)
        {
 
            //taking number entered by user
            int numbers = int.Parse(textBox1.Text);

            //creating object of SaveFileDialog
            SaveFileDialog saveFileDialog1 = new SaveFileDialog();
            saveFileDialog1.ShowDialog();//show dialog
                                        //creating object of random class

            Random rand = new Random();
            //getting file name from the dialog box
            string fname = saveFileDialog1.FileName;

            //creating object of stream writer
            StreamWriter writer = File.CreateText(fname);
 
            //using for loop to generate random numbers between 1 to 100
            for (int i = 0; i < numbers; i++)
            {
                //generate number
                int n = rand.Next(1, 100);
                //write to the file
                writer.WriteLine(n.ToString());
            }
            //close file
            writer.Close();
            //display Message
            MessageBox.Show("File saved!");

        }
    }
}
