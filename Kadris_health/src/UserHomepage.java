import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UserHomepage extends JFrame{
	private JPanel contentPane;
	
	public void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHomepage frame = new UserHomepage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	public UserHomepage() {	

	}
	
	public UserHomepage(String user) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
		JMenu menu;
		JMenuItem item2,item1;
		
		JMenuBar bar = new JMenuBar();
		menu = new JMenu("Account");
		item1 = new JMenuItem("Logout");
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int user_input = JOptionPane.showConfirmDialog(item1, "Are you sure?");
         
                if (user_input == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("Login");
                    obj.setVisible(true);
                }

            }
        });
        
		item2 = new JMenuItem("Change Password");
		item2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
	                PassChange newPass = new PassChange(user);
	                newPass.setTitle("Change Password");
	                newPass.setVisible(true);

	            }
		});
		menu.add(item1);
		menu.add(item2);
		bar.add(menu);
	
		contentPane.setLayout(new BorderLayout());
		contentPane.add(bar, BorderLayout.NORTH);
		
		JPanel contentPane2 = new JPanel(new FlowLayout());
		JPanel contentPane3 = new JPanel();
	    JPanel contentPane4 = new JPanel();
	    contentPane4.setLayout(new BorderLayout());
		

        JButton schedule = new JButton("schedule");
//        schedule.addActionListener(new ActionListener() {
			
	//	});
        JButton updateC = new JButton("update");
   //     updateC.addActionListener(new ActionListener() {
			
	//	});
        
       // btnNewButton.addActionListener(new ActionListener() {
        //contentPane2.add(check_Out);
        contentPane4.add(schedule, BorderLayout.NORTH);
        contentPane4.add(updateC,BorderLayout.SOUTH);
        //getContentPane().add(contentPane2);
        
        contentPane3.setLayout(new BorderLayout());
        JTable cMembers;
        //needs to be changed with query data
        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" }
            };
      
            // needs to be changed to query Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
        cMembers = new JTable(data, columnNames);
        cMembers.setBounds(30,40,200,300);
       
        JScrollPane sp = new JScrollPane(cMembers);
        contentPane3.add(sp,BorderLayout.NORTH);
        
        // Frame Size
        contentPane3.setSize(500, 200);
        // Frame Visible = true
        contentPane3.setVisible(true);
		JButton create = new JButton("Check in");
		
		create.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CheckIn newUser = new CheckIn();
					newUser.setTitle("Add Client");
					newUser.setVisible(true);
		}
	});
        contentPane4.add(create, BorderLayout.EAST);
        JButton check_Out = new JButton("Check out");
      //  check_Out.addActionListener(new ActionListener() {
			
	//	});
        JButton search = new JButton("Search");
		//search.addActionListener(new ActionListener() {
			
	//	});
        contentPane4.add(search, BorderLayout.CENTER);
        contentPane4.add(check_Out, BorderLayout.WEST);
        contentPane3.add(contentPane4);
        contentPane2.add(contentPane3);
        getContentPane().add(contentPane3);
	}
}
