package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private static int totalAeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void print(){
		System.out.println(codigo+" - "+ descricao);
	}

	public int quantidade(){
		return totalAeronaves;
	}

	public int compereTo(Aeronave outra){
		return descricao.compareTo(outra.descricao);

		}
		public String toString(){
			return "Codigo: "+ codigo +" Descrição: "+descricao;
		}
	}