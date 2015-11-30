package edu.iut.app;

import java.util.LinkedList;

public class Agenda extends LinkedList<ExamEvent>/* EX2: COLLECTION d'ExamEvent */ {
	public LinkedList<ExamEvent> agendaExams;
	
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
