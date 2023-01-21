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

namespace Chapter7_2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

            OpenFileDialog fd = new OpenFileDialog();

            fd.ShowDialog();

            StreamReader rd = new StreamReader(fd.FileName);

            string lineFromTheFile = "";

            while ((lineFromTheFile = rd.ReadLine()) != null)
            {
                lstNumbers.Items.Add(lineFromTheFile);
            }

            int numbersSum = 0;

            for (int i = 0; i < lstNumbers.Items.Count; i++)
            {
                numbersSum = numbersSum + int.Parse(lstNumbers.Items[i].ToString());
            }

            lblNumbers.Text = "The total of the numbers : " + numbersSum;

            lblNumbersCount.Text = "The number of random numbers read from the file :" + lstNumbers.Items.Count;
        }

        private void lstNumbers_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
