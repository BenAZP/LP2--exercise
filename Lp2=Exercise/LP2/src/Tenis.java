
public class Tenis {
	
	private String marca;
	private String cor;
	private Integer tamanho;
	
	public Tenis() {
		this.marca = "";
		this.cor = "";
		this.tamanho = 0;
	}
	
	public Tenis (String marca, String cor, Integer tamanho) {
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca( String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor( String cor) {
		this.cor = cor;
	}
	
	public Integer geTamanho() {
		return tamanho;
	}
	
	public void setTamanho( Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
		   return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Tenis other = (Tenis) obj;
		
		if (marca == null && cor == null && tamanho == null) {
			if (other.marca != null && other.cor != null  && other.tamanho != null)
				return false;
		}
		else if (!marca.equals(other.marca) && !cor.equals(other.cor) && !tamanho.equals(other.tamanho))
			return false;
		
		return true;
	}
	
	public String toString() {
		return "Marca:"+this.marca+"Cor:"+this.cor+"Tamanho:"+this.tamanho;
	}

}
