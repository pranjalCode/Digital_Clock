package com.digital.clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockFrame extends JFrame {
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	ClockFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 300);
		this.setResizable(false);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
		
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,40));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Poppins:ital",Font.PLAIN,30));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Verdana",Font.PLAIN,25));
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
