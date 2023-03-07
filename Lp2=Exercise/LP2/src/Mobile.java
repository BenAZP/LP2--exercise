
public class Mobile {
	
	private String marca;
	private String modelo;
	
	public Mobile() {
		this.marca = "";
		this.modelo = "";
	}
	
	public Mobile (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
		   return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Mobile other = (Mobile) obj;
		
		if (marca == null && modelo == null) {
			if (other.marca != null && other.modelo != null)
				return false;
		}
		else if (!marca.equals(other.marca) && !marca.equals((other.modelo)))
			return false;
		
		return true;
	}

	public String toString() {
		return "Marca:"+this.marca+"Modelo:"+this.modelo;
	}
}
