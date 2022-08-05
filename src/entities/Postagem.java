package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date dataPostagem;
	private String tituloPostagem;
	private String conteudoPostagem;
	private Integer curtidas;

	private List<Comentarios> comentarios = new ArrayList<>();

	public Postagem() {
	}

	public Postagem(Date dataPostagem, String tituloPostagem, String conteudoPostagem, Integer curtidas) {
		this.dataPostagem = dataPostagem;
		this.tituloPostagem = tituloPostagem;
		this.conteudoPostagem = conteudoPostagem;
		this.curtidas = curtidas;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getTituloPostagem() {
		return tituloPostagem;
	}

	public void setTituloPostagem(String tituloPostagem) {
		this.tituloPostagem = tituloPostagem;
	}

	public String getConteudoPostagem() {
		return conteudoPostagem;
	}

	public void setConteudoPostagem(String conteudoPostagem) {
		this.conteudoPostagem = conteudoPostagem;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void addComentarios(Comentarios comentario) {
		comentarios.add(comentario);
	}

	public void removerComentarios(Comentarios comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tituloPostagem + "\n");
		sb.append(curtidas);
		sb.append(" Curtidas - ");
		sb.append(sdf.format(dataPostagem) + "\n");
		sb.append(conteudoPostagem + "\n");
		sb.append("Comentarios:\n");
		for (Comentarios c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}

		return sb.toString();
	}

}
