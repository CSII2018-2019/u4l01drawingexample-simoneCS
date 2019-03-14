import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class U4L01DrawingGraphics extends JFrame {
	public U4L01DrawingGraphics(){
        initGUI();
        
        setTitle("Drawing Example");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
	 private void initGUI(){
	        //title 
	        /*JPanel titlePanel = new JPanel(); 
	        titlePanel.setBackground(Color.BLACK);
	        add(titlePanel, BorderLayout.PAGE_START);
	        Font titleFont = new Font("Fish&Chips", Font.BOLD, 32);
	        JLabel titleLabel = new JLabel("Drawing Examples");
	        titleLabel.setBackground(Color.BLACK);
	        titleLabel.setOpaque(true);
	        titleLabel.setForeground(Color.WHITE);
	        titleLabel.setFont(titleFont);
	        titleLabel.setHorizontalAlignment(JLabel.CENTER);
	        titlePanel.add(titleLabel); */
	        
	        //drawing panel
	        DrawingPanel dp = new DrawingPanel();
	        add(dp, BorderLayout.CENTER);
	 }
	
	public static void main(String[] args) {
        try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new U4L01DrawingGraphics();
            }   
        });
    }
}
