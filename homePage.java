import java.util.*;
import javafx.*;
import java.awt.*;
import javax.swing.*;

public class homePage extends JFrame
{
	public static void main(String[] args)
	{
		// creating an instance of JFrame
			JFrame homepage = new JFrame("SharkBoy and LavaGirl");
		// setting the size of the frame
			homepage.setSize(500,500);
			//homepage.setBackground();
		//making the frame able to close
		//	homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//adding lavagirls image icon
	
		//making a panel
		JPanel panel = new JPanel();
		homepage.add(panel);
		// calling user defined method for adding components to this panel
		placeComponents(panel);
		//allowing the page to show up
		homepage.setVisible(true);
		
		
		//making a button to start the game
		JButton start = new JButton("Start Game");
		// bounds layouts the size and location on the page  height of the button on the page,length of button,height of the button frame
		start.setBounds(250,150, 150, 75);
		//adds the button to the front of the homepage
		panel.add(start);
		// to show up you need to set it to visible
		start.setVisible(true);
		//setting the color of the button
		start.setBackground(Color.magenta);
		//start.setFont(arg0);
		
		//a combo allows you to choose a level instead of creating a new page
		
		String[] pickLevel = {"Beginner", "Experienced" };
		JComboBox level = new JComboBox(pickLevel);
		level.setBounds(250,250,150,75);
		panel.add(level);
		level.setVisible(true);
		level.setBackground(Color.pink);

	}
	
	public class ImagePanel 
	{
		public ImagePanel(Image image) {
			
		}

		ImagePanel lava = new ImagePanel(new ImageIcon("pixil-frame-0(1).png").getImage());
		
	}
	
	public void paintComponent(Graphics g)
	{
	//	g.drawImage()
	}


	private static void placeComponents(JPanel panel) 
	{
		//panel.setBackground();
		panel.setLayout(null);
		
		
	}
	
	
	
}