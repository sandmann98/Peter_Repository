import javax.swing.JOptionPane;

public class Peter_Project {
	
	static String ask(String question) {
return question;
}
    public static void main(String[] args) {
       
        String answer = null;
       
        while(answer != "A") {
           
            String question = "1 + 1? \n";
            question += "A. 2 \n";
            question += "B. Mom \n";
            question += "C. the color blue \n";
            question += "D. 25 \n";
            question += "E. 221 \n";
            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
           
            if (answer.equals("A")) {
                JOptionPane.showMessageDialog(null,"Correct!");
                break;
               
            }
            else if(answer.equals("B") ||  answer.equals("C") ||
                    answer.equals("D") || answer.equals("E") ) {
                JOptionPane.showMessageDialog(null,"Incorrect!");
            }
            else {
                JOptionPane.showMessageDialog(null,"Value entered must be A, B, C, D or E");
            }
        }   
    }
}

