package dependency_injection.modelo;

public class Produto {
	
	private String name;
	private Double pice;
	
	public Produto(String name, Double pice) {
		super();
		this.name = name;
		this.pice = pice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPice() {
		return pice;
	}

	public void setPice(Double pice) {
		this.pice = pice;
	}
	
	
	
}
