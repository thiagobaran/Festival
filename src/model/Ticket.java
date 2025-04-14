package model;

public class Ticket {
	private static int globalTicketId = 1;
    private int ticketId;
	private int startTime;
	private String tipoEntrada;
	private boolean isUsed = false;
	
	public Ticket(int startTime, String tipoEntrada) {
		this.startTime = startTime;
		this.tipoEntrada= tipoEntrada;
		this.ticketId = globalTicketId++;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public String getTipoEntrada() {
		return tipoEntrada;
	}
	
	public boolean getIsUsed() {
		return isUsed;
	}
	
	public void Use() {
		this.isUsed = true;
	}

}
