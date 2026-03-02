import javax.swing.JFrame;
public class app03{
    public static void main(String[] args){
        //Jframe = a GUI window to add components to 
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("JFrame title goes here");//sets the title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the applicaiton
        frame.setResizable(false);//prevent frame from begin resized.
        frame.setSize(420,420);//sets the dimension of x, y in the frame
        frame.setVisible(true);//makes the framevisible
       


    }
}