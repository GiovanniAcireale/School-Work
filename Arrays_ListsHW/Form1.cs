using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Windows.Forms;

namespace Arrays_ListsHW
{
    public partial class Form1 : Form
    {

        int[][] ja = new int[3][];

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ja[0] = new int[12];
            ja[1] = new int[8];
            ja[2] = new int[10];

            fileRead(@"Section1.txt", 0, lBS1);
            fileRead(@"Section2.txt", 1, lBS2);
            fileRead(@"Section3.txt", 2, lBS3);

            av1.Text = sectionAv(0).ToString("#.00");
            av2.Text = sectionAv(1).ToString("#.00");
            av3.Text = sectionAv(2).ToString("#.00");
            allScores();
        }

        private void fileRead(string fileName, int row, ListBox box)
        {
            try
            {
                using (StreamReader stRead = new StreamReader(fileName))
                {
                    int i = 0;
                    while (!stRead.EndOfStream)
                    {
                        int value = Convert.ToInt32(stRead.ReadLine());
                        ja[row][i] = value; 
                        i++;
                        box.Items.Add(value.ToString());
                    }
                }
            }

            catch (Exception)
            {
                MessageBox.Show("Missing Files!");
            }

        }
        private double sectionAv(int row)
        {
            int sum = 0;

            double avg;

            for (int i = 0; i < ja[row].Length; i++)
            {
                sum = sum + ja[row][i];
            }

            avg = (double)sum / ja[row].Length;

            return avg;
        }
        private void allScores()
        {
            int sum = 0;

            double avg;

            int highScore = ja[0][0];
            int highestScoreRow = 0;
            int lowestscore = ja[0][0];
            int lowestScoreRow = 0;

            for (int i = 0; i < ja.Length; i++)
            {

                for (int j = 0; j < ja[i].Length; j++)
                {

                    sum = sum + ja[i][j];
                    if (ja[i][j] > highScore)
                    {
                        highScore = ja[i][j];
                        highestScoreRow = i;
                    }
                    if (ja[i][j] < lowestscore)
                    {
                        lowestscore = ja[i][j];
                        lowestScoreRow = i;
                    }
                }
            }

            avg = (double)sum / (ja[0].Length + ja[1].Length
                + ja[2].Length);

            tav.Text = avg.ToString("#.00");

            hS.Text = highScore.ToString();

            lS.Text = lowestscore.ToString();

        }
    }
}