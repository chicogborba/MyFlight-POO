package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void AdicionarEmpresa(CiaAerea ciaAtual){
		empresas.add(ciaAtual);
	}

	public ArrayList<CiaAerea> ListarEmpresas(){
		return empresas;
	}

	public CiaAerea BuscarPorCodigo(String codigo){

		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getCodigo() == codigo){
				return empresas.get(i);
			}
		}
		return null;
	}

	public CiaAerea BuscarPorNome(String nome){
		
		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getNome() == nome){
				return empresas.get(i);
			}
		}
		return null;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(CiaAerea cia: empresas){
			sb.append("Cia: \n");
			sb.append(cia.toString());
			sb.append("\n");
		}
		return sb.toString();
	}


}