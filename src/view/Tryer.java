package view;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Tryer extends MyPanel{
	public Tryer() {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(200, 200, 472, 245);
		add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		tabbedPane.addTab("New tab", null, toolBar, null);
		
		JPanel panel = new JPanel();
		toolBar.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("New tab", null, toolBar_1, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		toolBar_1.add(lblNewLabel);
		
		JToolBar toolBar_2 = new JToolBar();
		tabbedPane.addTab("New tab", null, toolBar_2, null);
	}
}
