package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CSFrame extends JFrame
{
    private JTextField system_name;
    private JTextField component_name;
    private JTextField component_states;
    private JTextField addField;
    private JTextField showField;
    
    
    public CSFrame(){
        
        system_name = new JTextField(10);
       // system_name.setSize(new Dimension(30,80));
        component_name = new JTextField(10);
        component_states = new JTextField(10);
        addField = new JTextField();
        showField = new JTextField();
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        setTitle("Component-States");
        setBounds(100, 100, 450, 300); 
        setSize(900, 400); 
        
        
        JMenuBar menuBar = new JMenuBar(); 
        this.setJMenuBar(menuBar);
        
        JMenu Main_menu_file = new JMenu("File");
        menuBar.add(Main_menu_file);
        
        JMenuItem menu_new = new JMenuItem("new");
        Main_menu_file.add(menu_new);
        menu_new.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
                System.out.println("new a file");
                
            }});
        
        JMenuItem menu_save = new JMenuItem("save");
        Main_menu_file.add(menu_save);
        menu_save.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
                System.out.println("save a file");
            }
            
        });
        
        JMenuItem menu_open = new JMenuItem("open");
        Main_menu_file.add(menu_open);
        menu_open.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
                System.out.println("open a file");
            }});
        
        
        JPanel panel_left = new JPanel(); //left panel:add
        this.add(panel_left,BorderLayout.CENTER);
        panel_left.setPreferredSize(new Dimension(100, 400));
        
        JPanel panel_right = new JPanel(); //right panel:show
        this.add(panel_right,BorderLayout.EAST);
        panel_right.setPreferredSize(new Dimension(550,400));
        
        
        /*left panel*/
        panel_left.setLayout(new GridLayout(4,2));
        panel_left.add(new JLabel("system name"));
        JPanel psn = new JPanel();
        psn.add(system_name);
        panel_left.add(psn);
       
        panel_left.add(new JLabel("component name"));
        JPanel pcn = new JPanel();
        pcn.add(component_name);
        panel_left.add(pcn);
        
        panel_left.add(new JLabel("component state"));
        JPanel pcs = new JPanel();
        pcs.add(component_states);
        panel_left.add(pcs);
        
        
        JPanel p = new JPanel();
        JButton jAdd = new JButton("add");
        JButton jRemove = new JButton("remove");
        p.setLayout(new GridLayout(2,1));
        p.add(jAdd);
        p.add(jRemove);
        
        panel_left.add(p);
        panel_left.add(addField);
        /*************/
        
        /*right panel*/
        panel_right.setLayout(new GridLayout(2,1,80,80));
        JPanel pf = new JPanel();
        pf.add(showField);
        showField.setPreferredSize(new Dimension(550,400));
        panel_right.add(pf);
        JButton next = new JButton("next");
        next.setPreferredSize(new Dimension(60,20));
        JPanel pn = new JPanel();
        pn.add(next);
        panel_right.add(pn);
        /*************/
        
    }
    
    public static void main(String[] args){
        CSFrame frame = new CSFrame();
        frame.setVisible(true);
    }
    
}
