package algoritmos_geneticos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PoblacionFinal extends JFrame {
	
	
	DefaultTableModel md;
	private JPanel contentPane;
	private JTable table;
	String data[][]={};
	String columnas[]={"Poblacion","SumaObj","MaxCromo","MinCromo","PromPobl"};
	private JTable jtabledatos;
	private JScrollPane scrollPane;
	static private float[] sum;
	static private float[] maxCrom;
	static private float[] minCrom;
	static private float[] pro;
	
	
	/**
	 * Create the frame.
	 */
	public PoblacionFinal(float[] sumObj,float[] maxCromo,float[] minCromo, float[] prom){
		
		this.setVisible(true);
		sum=sumObj;
	    maxCrom=maxCromo;
		minCrom=minCromo;
		pro=prom;
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPoblacinFinal = new JLabel("POBLACI\u00D3N FINAL");
		lblPoblacinFinal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblPoblacinFinal.setBounds(199, 22, 341, 65);
		contentPane.add(lblPoblacinFinal);
				
		md=new DefaultTableModel(data,columnas);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(59, 87, 590, 376);
		contentPane.add(scrollPane);
		
				jtabledatos = new JTable();
				jtabledatos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
				scrollPane.setViewportView(jtabledatos);
				jtabledatos.setModel(md);

				llenaTabla(sum,
	    maxCrom,
		minCrom,
		pro,md)
		
		;
		//scrollPane.setView	portView(md);
		
	}
	
	
	
	
	
	private void llenaTabla(float[] sumObj,float[] maxCromo,float[] minCromo, float[] prom,DefaultTableModel dat){
		float[] sum=sumObj;
		float[] max=maxCromo;
		float[] min=minCromo;
		float[] pro=prom;
		for(int i=0;i<sumObj.length-1; i++ ){
			String[] data={"          "+String.valueOf(i),"     "+String.valueOf(sum[i]),"     "+String.valueOf(max[i]),"     "+String.valueOf(min[i]),"     "+String.valueOf(pro[i])};
			md.addRow(data);
			
		}
		
		
		
	}
}

