package pojo

class Objeto {
	private int id;
	private String uno;
	private String dos;
	private String tres;
	
	public Objeto(int id, String uno, String dos, String tres) {
		super();
		this.id = id;
		this.uno = uno;
		this.dos = dos;
		this.tres = tres;
	}
	
	public Objeto() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getTres() {
		return tres;
	}
	public void setTres(String tres) {
		this.tres = tres;
	}
	
	
}
