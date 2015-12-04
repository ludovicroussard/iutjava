package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;
import edu.iut.app.Person;
import edu.iut.app.Person.PersonFunction;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		JPanel commandPanel = new JPanel();
		JPanel bottom = new JPanel();	
		commandPanel.setLayout(new BoxLayout(commandPanel, BoxLayout.PAGE_AXIS));
		Calendar calendar = Calendar.getInstance();
        SpinnerNumberModel dateModel = new SpinnerNumberModel(calendar.get(Calendar.YEAR),
        												calendar.get(Calendar.YEAR)-5,
        												calendar.get(Calendar.YEAR)+5,
        												1);
        JSpinner  yearsSpinner       = new JSpinner(dateModel);
        yearsSpinner.setEditor(new JSpinner.NumberEditor(yearsSpinner, "#"));
		JComboBox monthComboBox      = new JComboBox(ApplicationSession.instance().getMonths());
		JComboBox daysOfWeekComboBox = new JComboBox(ApplicationSession.instance().getDays());
		
		JLabel personne = new JLabel ("Personne :");
		JTextField saisiePersonne = new JTextField(); 
		
		JLabel salle = new JLabel ("Salle :");
		JTextField saisieSalle = new JTextField(); 
		
		JButton btnSave = new JButton("Sauvegarder");
		
		
		
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Date date = new Date(getYear(),getMonth(),getDay());
				Person p = new Person();
				p.setFunction(PersonFunction.STUDENT);
				p.setFirstname(saisiePersonne.getText());
				
			}			
		});
		
		/*nextView.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				agendaViewLayout.next(contentPane);				
			}			
		});*/
		commandPanel.add(yearsSpinner);
		commandPanel.add(monthComboBox);
		commandPanel.add(daysOfWeekComboBox);
		commandPanel.add(personne);
		commandPanel.add(saisiePersonne);
		commandPanel.add(salle);
		commandPanel.add(saisieSalle);
		commandPanel.add(btnSave);
		this.add(commandPanel, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}
	
}
