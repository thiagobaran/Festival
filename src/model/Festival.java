package model;

public class Festival {
	
	private final int festivalId;
	private static int globalFestivalId = 1;
	private final String festivalTitle;
	private ConjuntoTicket ticketSet;
	private DiccionarioAsistente asistenteDic;
	private ColaIngreso ingresoCol;
	private ColaEgreso egresoCol;
	private final int startTime;
	private final String ubicacion;
	
	public Festival(String festivalTitle, int starTime, String ubicacion) {
			this.festivalTitle = festivalTitle;
			this.festivalId = globalFestivalId++;
			this.startTime = startTime;
			this.ubicacion = ubicacion;
			this.ticketSet = new ConjuntoTicket();
			this.ticketSet.InicializarConjunto();
			this.asistenteDic = new DiccionarioAsistente();
			this.asistenteDic.InicializarDiccionario();
			this.ingresoCol = new ColaIngreso();
			this.ingresoCol.InicializarCola();
			this.egresoCol = new ColaEgreso();
			this.egresoCol.InicializarCola();
	}
}
