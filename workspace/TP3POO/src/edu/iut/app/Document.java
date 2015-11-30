package edu.iut.app;

public class Document {
	
	public Document() {
		documentURI="";
	}
	public Document(String documentURI) {
		//ex2
		this.documentURI = documentURI;
	}
	
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	public String getDocumentURI() {
		return documentURI;
	}
	
	protected String documentURI;
}
