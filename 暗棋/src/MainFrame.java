import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainFrame extends JFrame {
    private Container cp;
    private JPanel jpbackgr = new JPanel(new GridLayout(4, 8, 0, 0));
    private JLabel jlbbackgr[][] = new JLabel[5][10];
    private ImageIcon icon = new ImageIcon("象棋背面.png");


    public MainFrame() {

        init();

    }


    public void init() {
        this.setBounds(150,50,1000,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        setResizable(false);

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jpbackgr);


        for (int i = 0 ; i < 4 ; i ++){
            for (int j = 0 ; j < 8 ; j ++){
                jlbbackgr[i][j] = new JLabel();
                jlbbackgr[i][j].setIcon(icon);
                jlbbackgr[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                jpbackgr.add(jlbbackgr[i][j]);
            }
        }


    }
     public void Rand (String arg[]){
         Random rnd = new Random(System.currentTimeMillis());
         int i = 0 ;
         while (i < 32){
             arg[i] = Integer.toString(rnd.nextInt(32));
             int j = 0 ;
             boolean flag = false;
             while (j < i){
                 if (arg[j].equals(arg[i])){
                     flag = true;
                     j = i;
                 }
                 j ++;
             }
             if (!flag){
                 i ++;
             }
         }

     }
}


