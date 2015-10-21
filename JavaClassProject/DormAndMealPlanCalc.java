/*
 * Jeremy Swyers
 * Dorm and Meal Plan Calc
 * CISS 238
 */





package GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class DormAndMealPlanCalc extends JFrame{
	
	
	private JComboBox box1;
	private JComboBox box2;
	private JButton calcButton;
	private JButton exitButton;
	private JLabel label1;
	private JLabel label2;
	private JPanel panel;
	private final int WINDOW_HEIGHT = 200;
	private final int WINDOW_WIDTH = 325;
	private static String[] meals = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
	private static String[] mealPlan  = {"7 meals per week", "14 meals per week", "Unlimited meals per week"};
	
	
		/*
		 * DormAndMealPlanCalc Constructor
		 */
	public DormAndMealPlanCalc(){
		
		
		super("Dorm and Meal Calc");
		setLayout(new FlowLayout());
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
			
	}
	/*
	 * buildPanel constructor
	 */
	private void buildPanel(){
		
		label1 = new JLabel("Select a Dorm");
		label2 = new JLabel("Select a Meal Plan");
		calcButton = new JButton("Calculate Charges");
		exitButton = new JButton("Exit");
		box1 = new JComboBox(meals);
		box2 = new JComboBox(mealPlan);
		
		
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
				
				panel = new JPanel();
				setLayout(new FlowLayout());
				
				/*
				 * adding JLabels, JComboBox, and JButtons
				 */
				add(label1);
				add(box1);
				add(label2);
				add(box2);
				add(calcButton);
				add(exitButton);
				
			}
	/*
	 * CalcButtonListener class implementing ActionListener
	 */
	class calcButtonListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			String cost;
			while(box1.getSelectedItem().equals("Allen Hall")){
				if(box2.getSelectedItem().equals("7 meals per week")){
					cost = "2060.00";
					JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
					break;
				}
					else if(box2.getSelectedItem().equals("14 meals per week")){
						cost = "2595.00";
						JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
						break;
					}
						else if(box2.getSelectedItem().equals("Unlimited meals per week")){
							cost = "3000.00";
							JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
							break;
					}
				
			}
			while(box1.getSelectedItem().equals("Pike Hall")){
				if(box2.getSelectedItem().equals("7 meals per week")){
					cost = "2160.00";
					JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
					break;
				}
					else if(box2.getSelectedItem().equals("14 meals per week")){
						cost = "2695.00";
						JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
						break;
					}
						else if(box2.getSelectedItem().equals("Unlimited meals per week")){
							cost = "3100.00";
							JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
							break;
					}
				
			}
			while(box1.getSelectedItem().equals("Farthing Hall")){
				if(box2.getSelectedItem().equals("7 meals per week")){
					cost = "1760.00";
					JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
					break;
				}
					else if(box2.getSelectedItem().equals("14 meals per week")){
						cost = "2295.00";
						JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
						break;
					}
						else if(box2.getSelectedItem().equals("Unlimited meals per week")){
							cost = "2700.00";
							JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
							break;
					}
				
			}
			while(box1.getSelectedItem().equals("University Suites")){
				if(box2.getSelectedItem().equals("7 meals per week")){
					cost = "2360.00";
					JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
					break;
				}
					else if(box2.getSelectedItem().equals("14 meals per week")){
						cost = "2895.00";
						JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
						break;
					}
						else if(box2.getSelectedItem().equals("Unlimited meals per week")){
							cost = "3300.00";
							JOptionPane.showMessageDialog(null, "Total Charger Per Semester: $" + cost );
							break;
					}
				
			}
				 
			
	
		}
	}
	/*
	 * exitButtonListener class implements ActionListener
	 */
	class exitButtonListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.exit(0);
		}
		}


/*
 * Main Method
 */
public static void main(String[] args){
	new DormAndMealPlanCalc();
	}
		
}		
		
		
		

			
				
			
		
			