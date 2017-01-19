import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JList;
import javax.swing.JTextPane;

public class AplikacjaMW050116MainClass {

	private JFrame frmNoTitleYet;
	private JPanel panelMainMenu;
	private JPanel panelMenuMap;
	private JPanel panelMenuInfo;
	private JLabel label;
	private JLabel lblNewLabel;
	private ImageIcon labelImage;
	private ImageIcon lblNewLabelImage;
	private JComboBox comboBox_2;
	private Object wiaderko=null;
	private int i=0;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikacjaMW050116MainClass window = new AplikacjaMW050116MainClass();
					window.frmNoTitleYet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplikacjaMW050116MainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNoTitleYet = new JFrame();
		frmNoTitleYet.setResizable(false);
		frmNoTitleYet.setIconImage(Toolkit.getDefaultToolkit().getImage(AplikacjaMW050116MainClass.class.getResource("/resources/Coin.png")));
		frmNoTitleYet.setTitle("No title, yet... Alpha 0.1v");
		frmNoTitleYet.setBounds(100, 100, 640, 480);
		frmNoTitleYet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoTitleYet.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMainMenu = new JPanel();
		panelMainMenu.setBackground(new Color(255, 255, 255));
		frmNoTitleYet.getContentPane().add(panelMainMenu, "name_470410867574927");
		panelMainMenu.setLayout(null);
		panelMainMenu.setVisible(true);
		
		JPanel panelMenuMap = new JPanel();
		frmNoTitleYet.getContentPane().add(panelMenuMap, "name_470412964365977");
		panelMenuMap.setLayout(null);
		panelMenuMap.setVisible(false);
		
		JPanel panelMenuInfo = new JPanel();
		frmNoTitleYet.getContentPane().add(panelMenuInfo, "name_470414835695040");
		panelMenuInfo.setLayout(null);
		panelMenuInfo.setVisible(false);
		
		JButton btnChooseMap = new JButton("Choose Map");
		btnChooseMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(true);
				panelMainMenu.setVisible(false);
			}
		});
		
		
		btnChooseMap.setBounds(226, 11, 170, 39);
		transparentButton(btnChooseMap);
		panelMainMenu.add(btnChooseMap);
		
		JButton btnEnd = new JButton("Get OUT!");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(251, 342, 106, 55);
		transparentButton(btnEnd);
		panelMainMenu.add(btnEnd);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(36, 83, 106, 20);
		textPane_1.setEditable(false);
		textPane_1.setForeground(new Color(0, 255, 255));
		textPane_1.setBorder(null);
		textPane_1.setOpaque(false);
		panelMainMenu.add(textPane_1);
		textPane_1.setVisible(false);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(36, 114, 106, 20);
		textPane_2.setEditable(false);
		textPane_2.setForeground(new Color(0, 255, 255));
		textPane_2.setBorder(null);
		textPane_2.setOpaque(false);
		panelMainMenu.add(textPane_2);
		textPane_2.setVisible(false);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(36, 145, 106, 20);
		textPane_3.setEditable(false);
		textPane_3.setForeground(new Color(0, 255, 255));
		textPane_3.setBorder(null);
		textPane_3.setOpaque(false);
		panelMainMenu.add(textPane_3);
		textPane_3.setVisible(false);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(36, 176, 106, 20);
		textPane_4.setEditable(false);
		textPane_4.setForeground(new Color(0, 255, 255));
		textPane_4.setBorder(null);
		textPane_4.setOpaque(false);
		panelMainMenu.add(textPane_4);
		textPane_4.setVisible(false);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(36, 207, 106, 20);
		textPane_5.setEditable(false);
		textPane_5.setForeground(new Color(0, 255, 255));
		textPane_5.setBorder(null);
		textPane_5.setOpaque(false);
		panelMainMenu.add(textPane_5);
		textPane_5.setVisible(false);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6 .setBounds(518, 83, 106, 20);
		textPane_6 .setEditable(false);
		textPane_6 .setForeground(new Color(0, 255, 255));
		textPane_6 .setBorder(null);
		textPane_6 .setOpaque(false);
		panelMainMenu.add(textPane_6 );
		textPane_6 .setVisible(false);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(518, 114, 106, 20);
		textPane_7.setEditable(false);
		textPane_7.setForeground(new Color(0, 255, 255));
		textPane_7.setBorder(null);
		textPane_7.setOpaque(false);
		panelMainMenu.add(textPane_7);
		textPane_7.setVisible(false);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(518, 145, 106, 20);
		textPane_8.setEditable(false);
		textPane_8.setForeground(new Color(0, 255, 255));
		textPane_8.setBorder(null);
		textPane_8.setOpaque(false);
		panelMainMenu.add(textPane_8);
		textPane_8.setVisible(false);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBounds(518, 176, 106, 20);
		textPane_9.setEditable(false);
		textPane_9.setForeground(new Color(0, 255, 255));
		textPane_9.setBorder(null);
		textPane_9.setOpaque(false);
		panelMainMenu.add(textPane_9);
		textPane_9.setVisible(false);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setBounds(518, 207, 106, 20);
		textPane_10.setEditable(false);
		textPane_10.setForeground(new Color(0, 255, 255));
		textPane_10.setBorder(null);
		textPane_10.setOpaque(false);
		panelMainMenu.add(textPane_10);
		textPane_10.setVisible(false);
		
		/////////////
		JLabel lblNewLabel = new JLabel("");
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo.jpg"));
		
		String[] championNamesTeam = { "Chose Character","Johanna","Artanis","Li-Li","Brightwing","Zeratul","Thrall","Jaina","Chromie","Valla","Falstad" };
		String[] championNamesEnemy = { "Chose Character","Johanna","Artanis","Li-Li","Brightwing","Zeratul","Thrall","Jaina","Chromie","Valla","Falstad" };
		JComboBox comboBox_1 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_1.addItem(name);
		}
		comboBox_1.setBounds(36, 83, 106, 20);
		comboBox_1.isEditable();
		panelMainMenu.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_2.addItem(name);
		}
		comboBox_2.setBounds(36, 114, 106, 20);
		panelMainMenu.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_3.addItem(name);
		}
		comboBox_3.setBounds(36, 145, 106, 20);
		panelMainMenu.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_4.addItem(name);
		}
		comboBox_4.setBounds(36, 176, 106, 20);
		panelMainMenu.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_5.addItem(name);
		}
		comboBox_5.setBounds(36, 207, 106, 20);
		panelMainMenu.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_6.addItem(name);
		}
		comboBox_6.setBounds(518, 83, 106, 20);
		panelMainMenu.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_7.addItem(name);
		}
		comboBox_7.setBounds(518, 114, 106, 20);
		panelMainMenu.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_8.addItem(name);
		}
		comboBox_8.setBounds(518, 145, 106, 20);
		panelMainMenu.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_9.addItem(name);
		}
		comboBox_9.setBounds(518, 176, 106, 20);
		panelMainMenu.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_10.addItem(name);
		}
		comboBox_10.setBounds(518, 207, 106, 20);
		panelMainMenu.add(comboBox_10);
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_1.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_2.removeItem(comboBox_1.getSelectedItem());
				 comboBox_3.removeItem(comboBox_1.getSelectedItem());
				 comboBox_4.removeItem(comboBox_1.getSelectedItem());
				 comboBox_5.removeItem(comboBox_1.getSelectedItem());
				 comboBox_1.setVisible(false);
				 textPane_1.setVisible(true);
				 textPane_1.setText((String)comboBox_1.getSelectedItem());}
			}
		});
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_2.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_3.removeItem(comboBox_2.getSelectedItem());
				 comboBox_4.removeItem(comboBox_2.getSelectedItem());
				 comboBox_5.removeItem(comboBox_2.getSelectedItem());
				 comboBox_2.setVisible(false);
				 textPane_2.setVisible(true);
				 textPane_2.setText((String)comboBox_2.getSelectedItem());}
			}
		});
		
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_3.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_4.removeItem(comboBox_3.getSelectedItem());
				 comboBox_5.removeItem(comboBox_3.getSelectedItem());
				 comboBox_3.setVisible(false);
				 textPane_3.setVisible(true);
				 textPane_3.setText((String)comboBox_3.getSelectedItem());}
			}
		});
		
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_4.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_5.removeItem(comboBox_4.getSelectedItem());
				 comboBox_4.setVisible(false);
				 textPane_4.setVisible(true);
				 textPane_4.setText((String)comboBox_4.getSelectedItem());}
			}
		});
		
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_5.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_5.setVisible(false);
				 textPane_5.setVisible(true);
				 textPane_5.setText((String)comboBox_5.getSelectedItem());}
			}
		});
		
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_6.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_7.removeItem(comboBox_6.getSelectedItem());
				 comboBox_8.removeItem(comboBox_6.getSelectedItem());
				 comboBox_9.removeItem(comboBox_6.getSelectedItem());
				 comboBox_10.removeItem(comboBox_6.getSelectedItem());
				 comboBox_6.setVisible(false);
				 textPane_6.setVisible(true);
				 textPane_6.setText((String)comboBox_6.getSelectedItem());}
			}
		});
		
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_7.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_8.removeItem(comboBox_7.getSelectedItem());
				 comboBox_9.removeItem(comboBox_7.getSelectedItem());
				 comboBox_10.removeItem(comboBox_7.getSelectedItem());
				 comboBox_7.setVisible(false);
				 textPane_7.setVisible(true);
				 textPane_7.setText((String)comboBox_7.getSelectedItem());}
			}
		});
		
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_8.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_9.removeItem(comboBox_8.getSelectedItem());
				 comboBox_10.removeItem(comboBox_8.getSelectedItem());
				 comboBox_8.setVisible(false);
				 textPane_8.setVisible(true);
				 textPane_8.setText((String)comboBox_8.getSelectedItem());}
			}
		});
		
		comboBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_9.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_10.removeItem(comboBox_9.getSelectedItem());
				 comboBox_9.setVisible(false);
				 textPane_9.setVisible(true);
				 textPane_9.setText((String)comboBox_9.getSelectedItem());}
			}
		});
		
		comboBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_10.getSelectedItem()!=championNamesTeam[0]){
				 comboBox_10.setVisible(false);
				 textPane_10.setVisible(true);
				 textPane_10.setText((String)comboBox_10.getSelectedItem());}
			}
		});
		////
		
		lblNewLabel.setIcon(lblNewLabelImage);
		lblNewLabel.setBounds(0, 0, 640, 480);
		panelMainMenu.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo.jpg")));
		label.setBounds(0, 0, 640, 480);
		
		JButton btnHauntedMines = new JButton("Haunted Mines");
		btnHauntedMines.setName("Haunted Mines");
		btnHauntedMines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				addBackgroundMap(btnHauntedMines.getName());
				label.setIcon(labelImage);
			}
		});
		btnHauntedMines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnHauntedMines.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Haunted Mines");
			}
		});
		btnHauntedMines.setBounds(10, 11, 109, 23);
		transparentButton(btnHauntedMines);
		panelMenuMap.add(btnHauntedMines);
		
		JButton btnTowersOfDoom = new JButton("Towers of Doom");
		btnTowersOfDoom.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				addBackgroundMap(btnTowersOfDoom.getName());
				label.setIcon(labelImage);
			}
		});
		btnTowersOfDoom.setName("Towers of Doom");
		btnTowersOfDoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnTowersOfDoom.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Towers of Doom");
			}
		});
		btnTowersOfDoom.setBounds(140, 11, 111, 23);
		transparentButton(btnTowersOfDoom);
		panelMenuMap.add(btnTowersOfDoom);
		
		JButton btnInfernalShrines = new JButton("Infernal Shrines");
		btnInfernalShrines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnInfernalShrines.getName());
				label.setIcon(labelImage);
			}
		});
		btnInfernalShrines.setName("Infernal Shrines");
		btnInfernalShrines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnInfernalShrines.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Infernal Shrines");
			}
		});
		btnInfernalShrines.setBounds(270, 11, 109, 23);
		transparentButton(btnInfernalShrines);
		panelMenuMap.add(btnInfernalShrines);
		
		JButton btnBattlefieldOfEternity = new JButton("Battlefield of Eternity");
		btnBattlefieldOfEternity.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBattlefieldOfEternity.getName());
				label.setIcon(labelImage);
			}
		});
		btnBattlefieldOfEternity.setName("Battlefield of Eternity");
		btnBattlefieldOfEternity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnBattlefieldOfEternity.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Battlefield of Eternity");
			}
		});
		btnBattlefieldOfEternity.setBounds(400, 11, 135, 23);
		transparentButton(btnBattlefieldOfEternity);
		panelMenuMap.add(btnBattlefieldOfEternity);
		
		JButton btnTombOfThe = new JButton("Tomb of The Spider Quoeen");
		btnTombOfThe.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnTombOfThe.getName());
				label.setIcon(labelImage);
			}
		});
		btnTombOfThe.setName("Tomb of The Spider Quoeen");
		btnTombOfThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnTombOfThe.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Tomb of The Spider Quoeen");
			}
		});
		btnTombOfThe.setBounds(10, 45, 167, 23);
		transparentButton(btnTombOfThe);
		panelMenuMap.add(btnTombOfThe);
		
		JButton btnSkyTemple = new JButton("Sky Temple");
		btnSkyTemple.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnSkyTemple.getName());
				label.setIcon(labelImage);
			}
		});
		btnSkyTemple.setName("Sky Temple");
		btnSkyTemple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnSkyTemple.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Sky Temple");
			}
		});
		btnSkyTemple.setBounds(187, 45, 87, 23);
		transparentButton(btnSkyTemple);
		panelMenuMap.add(btnSkyTemple);
		
		JButton btnGardenOfTerror = new JButton("Garden of Terror");
		btnGardenOfTerror.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnGardenOfTerror.getName());
				label.setIcon(labelImage);
			}
		});
		btnGardenOfTerror.setName("Garden of Terror");
		btnGardenOfTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnGardenOfTerror.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Garden of Terror");
			}
		});
		btnGardenOfTerror.setBounds(280, 45, 113, 23);
		transparentButton(btnGardenOfTerror);
		panelMenuMap.add(btnGardenOfTerror);
		
		JButton btnBlackheartsBay = new JButton("Blackheart's Bay");
		btnBlackheartsBay.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBlackheartsBay.getName());
				label.setIcon(labelImage);
			}
		});
		btnBlackheartsBay.setName("Blackheart's Bay");
		btnBlackheartsBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnBlackheartsBay.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Blackheart's Bay");
			}
		});
		btnBlackheartsBay.setBounds(410, 45, 111, 23);
		transparentButton(btnBlackheartsBay);
		panelMenuMap.add(btnBlackheartsBay);
		
		JButton btnDragonShire = new JButton("Dragon Shire");
		btnDragonShire.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnDragonShire.getName());
				label.setIcon(labelImage);
			}
		});
		btnDragonShire.setName("Dragon Shire");
		btnDragonShire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnDragonShire.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Dragon Shire");
			}
		});
		btnDragonShire.setBounds(10, 79, 95, 23);
		transparentButton(btnDragonShire);
		panelMenuMap.add(btnDragonShire);
		
		JButton btnCursedHollow = new JButton("Cursed Hollow");
		btnCursedHollow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnCursedHollow.getName());
				label.setIcon(labelImage);
			}
		});
		btnCursedHollow.setName("Cursed Hollow");
		btnCursedHollow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnCursedHollow.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Cursed Hollow");
			}
		});
		btnCursedHollow.setBounds(115, 79, 101, 23);
		transparentButton(btnCursedHollow);
		panelMenuMap.add(btnCursedHollow);
		
		JButton btnBraxisHoldout = new JButton("Braxis Holdout");
		btnBraxisHoldout.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBraxisHoldout.getName());
				label.setIcon(labelImage);
			}
		});
		btnBraxisHoldout.setName("Braxis Holdout");
		btnBraxisHoldout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnBraxisHoldout.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Braxis Holdout");
			}
		});
		btnBraxisHoldout.setBounds(226, 79, 101, 23);
		transparentButton(btnBraxisHoldout);
		panelMenuMap.add(btnBraxisHoldout);
		
		JButton btnWarheadJunction = new JButton("Warhead Junction");
		btnWarheadJunction.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnWarheadJunction.getName());
				label.setIcon(labelImage);
			}
		});
		btnWarheadJunction.setName("Warhead Junction");
		btnWarheadJunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnWarheadJunction.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Warhead Junction");
			}
		});
		btnWarheadJunction.setBounds(337, 79, 119, 23);
		transparentButton(btnWarheadJunction);
		panelMenuMap.add(btnWarheadJunction);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				label.setIcon(lblNewLabelImage);
			}
		});
		btnExit.setBounds(270, 300, 89, 23);
		transparentButton(btnExit);
		panelMenuMap.add(btnExit);
		panelMenuMap.add(label);
		

		
	
	}

	private void transparentButton(JButton name) {
		name.setForeground(new Color(0, 255, 255));
		name.setBorder(null);
		name.setBorderPainted(false);
		name.setContentAreaFilled(false);
		name.setOpaque(false);
		}
	private void addBackgroundMap(String name){
		labelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+".jpg"));
	}
	
	private void addBackgroundMenu(String name){
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+".jpg"));
	}
}
