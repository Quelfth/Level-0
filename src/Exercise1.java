import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Exercise1 {

    public static void main(String[] args) {
    	String color = "";
    	Robot r = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	color = JOptionPane.showInputDialog("What color should the robot draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(color.equalsIgnoreCase("Red")){
    		r.setPenColor(255,0,0);
    	}else{
    		if(color.equalsIgnoreCase("Orange")){
    			r.setPenColor(255,127,0);
    		}else{
    			if(color.equalsIgnoreCase("Yellow")){
    				r.setPenColor(255,255,0);
    			}else{
    				if(color.equalsIgnoreCase("Lime")){
    					r.setPenColor(127,255,0);
    				}else{
    					if(color.equalsIgnoreCase("Green")){
    						r.setPenColor(0,255,0);
    					}else{
    						if(color.equalsIgnoreCase("Teal")){
    							r.setPenColor(0,255,127);
    						}else{
    							if(color.equalsIgnoreCase("Cyan")){
    								r.setPenColor(0,255,255);
    							}else{
    								if(color.equalsIgnoreCase("Cerulean")){
    									r.setPenColor(0,127,255);
    								}else{
    									if(color.equalsIgnoreCase("Blue")){
    										r.setPenColor(0,0,255);
    									}else{
    										if(color.equalsIgnoreCase("Violet")){
    											r.setPenColor(127,0,255);
    										}else{
    											if(color.equalsIgnoreCase("Fuschia")){
    												r.setPenColor(255,0,255);
    											}else{
    												if(color.equalsIgnoreCase("Magenta")){
    													r.setPenColor(255,0,127);
    												}else{
    													r.setRandomPenColor();
    												}
    											}
    										}
    									}
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
   	 // 2. set the pen width to 10
    	r.setPenWidth(10);
   	 // 1. make the Robot draw a shape
    	r.setSpeed(10);
    	r.turn(270);
    	r.move(250);
    	r.turn(270);
    	r.move(250);
    	r.turn(180);
   	 	r.penDown();
   	 	r.move(500);
   	 	r.turn(90);
   	 	r.move(500);
   	 	r.turn(90);
   	 	r.move(500);
   	 	r.turn(90);
   	 	r.move(500);
   	 	r.penUp();
   	 	r.turn(90);
   	 	r.move(250);
   	 	r.turn(90);
   	 	r.move(250);
   	 	r.turn(270);
    }

}
