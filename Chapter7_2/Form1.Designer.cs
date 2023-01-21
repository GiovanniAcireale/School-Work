
namespace Chapter7_2
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.lstNumbers = new System.Windows.Forms.ListBox();
            this.lblNumbers = new System.Windows.Forms.Label();
            this.openFileDialog = new System.Windows.Forms.OpenFileDialog();
            this.lblNumbersCount = new System.Windows.Forms.Label();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.lstNumbers);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(257, 369);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Random Numbers";
            // 
            // lstNumbers
            // 
            this.lstNumbers.FormattingEnabled = true;
            this.lstNumbers.ItemHeight = 25;
            this.lstNumbers.Location = new System.Drawing.Point(6, 30);
            this.lstNumbers.Name = "lstNumbers";
            this.lstNumbers.Size = new System.Drawing.Size(245, 329);
            this.lstNumbers.TabIndex = 0;
            this.lstNumbers.SelectedIndexChanged += new System.EventHandler(this.lstNumbers_SelectedIndexChanged);
            // 
            // lblNumbers
            // 
            this.lblNumbers.AutoSize = true;
            this.lblNumbers.Location = new System.Drawing.Point(18, 426);
            this.lblNumbers.Name = "lblNumbers";
            this.lblNumbers.Size = new System.Drawing.Size(222, 25);
            this.lblNumbers.TabIndex = 1;
            this.lblNumbers.Text = "The total of the numbers : ";
            // 
            // openFileDialog
            // 
            this.openFileDialog.FileName = "openFileDialog1";
            this.openFileDialog.InitialDirectory = "C:\\";
            // 
            // lblNumbersCount
            // 
            this.lblNumbersCount.AutoSize = true;
            this.lblNumbersCount.Location = new System.Drawing.Point(18, 451);
            this.lblNumbersCount.Name = "lblNumbersCount";
            this.lblNumbersCount.Size = new System.Drawing.Size(423, 25);
            this.lblNumbersCount.TabIndex = 3;
            this.lblNumbersCount.Text = "The number of random numbers read from the file :";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 25F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(596, 511);
            this.Controls.Add(this.lblNumbersCount);
            this.Controls.Add(this.lblNumbers);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "Random Number Reader";
            this.groupBox1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }



        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.ListBox lstNumbers;
        private System.Windows.Forms.Label lblNumbers;
        private System.Windows.Forms.OpenFileDialog openFileDialog;
        private System.Windows.Forms.Label lblNumbersCount;
    }
}

