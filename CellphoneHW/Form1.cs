using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CellphoneHW
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string b, m;
            double p;
            b = textBox1.Text;
            m = textBox2.Text;
            p = Convert.ToDouble(textBox3.Text);

            Cellphone cp = new Cellphone(b, m, p);
            textBox4.Text = cp.brand;
            textBox5.Text = cp.model;
            textBox6.Text = "$"+cp.price.ToString("F2");

        }
    }
}
