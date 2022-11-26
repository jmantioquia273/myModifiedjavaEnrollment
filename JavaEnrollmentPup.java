package part1_java_final;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JavaEnrollmentPup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable declaration
		String studName;
		int engGrade, mathGrade, scienceGrade, hsGwa;
		double genAve;
		
		
	
		
		
		//Construct
		JTextArea myArea = new JTextArea(20,80);
		JScrollPane myScroll = new JScrollPane(myArea);
		String[] choice = new String[] {"BEED", "BPA-FPM","BSAM","BSENT","BSOA","DIT","DOMTMOM"};
		
		//text to display
		myArea.setText("\t\t\tPOLYTECHNIC UNIVERSITY OF TH PHILIPPINES"+
		"\n\t\t\t\tMulanay, Quezon Branch"+"\n"+
		"\nAcademic Programs"+"\tMin Grade 10 and 11 GWA"+"\tMin Grade in Math"+
		"\tMin Grade in Science"+"\tMin Grade in English"+
		"\nBEED"+"\t\t88"+"\t\t88"+"\t\t88"+"\t\t88"
		+"\nBPA-FPM"+"\t\t85"+"\t\t82"+"\t\t82"+"\t\t85"
		+"\nBSAM"+"\t\t85"+"\t\t85"+"\t\t85"+"\t\t85"
		+"\nBSENT"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
		+"\nBSOA"+"\t\t85"+"\t\t85"+"\t\t85"+"\t\t85"
		+"\nDIT"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
		+"\nDOMTMOM"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
				);
		myArea.setFont(new Font("Tahoma",Font.BOLD, 12));
		myArea.setBackground(Color.black);
		myArea.setForeground(Color.white);
		
		//output
		studName = JOptionPane.showInputDialog("Please Enter your Name");
		JOptionPane.showMessageDialog(null, myScroll, "PUP MUlanay",JOptionPane.PLAIN_MESSAGE);
		
		while(true) {
		int response = JOptionPane.showOptionDialog(null,"Hello " +studName +"\nSelect your Desire Program",
                "PUP Mulanay",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,
                choice, choice[0]);
		
		if(response == 0) {
	
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			if(genAve >= 88) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BEED Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
		}
		
		else if(response == 1) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 85) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BPA-FPM Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		
		}
		
		
		
		

	}

}
