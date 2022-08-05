package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentarios;
import entities.Postagem;

public class PrincipalStringBuilder {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios comentario_1 = new Comentarios("Tenha uma Otima Viagem!");
		Comentarios comentario_2 = new Comentarios("Uau, Isso é Incrivél!");
		
		Postagem postagem_1 = new Postagem(sdf.parse("04/08/2022 15:44:20"), 
				"Viajando para Flores da Cunha - RS", 
				"Eu estou indo visitar essa linda cidade!", 
				12);

		postagem_1.addComentarios(comentario_1);
		postagem_1.addComentarios(comentario_2);
		
		Comentarios comentario_3 = new Comentarios("Boa Noite!");
		Comentarios comentario_4 = new Comentarios("Que a força esteja com você!");
		
		Postagem postagem_2 = new Postagem(sdf.parse("04/08/2022 16:20:05"), "Boa noite peesoal!", "Vejo vocês amanhã!", 5);
		
		postagem_2.addComentarios(comentario_3);
		postagem_2.addComentarios(comentario_4);
		
		System.out.println(postagem_1);
		System.out.println("---------------------------------------------------------");
		System.out.println(postagem_2);
	}

}
