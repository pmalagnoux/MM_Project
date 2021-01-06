package client.EJBs;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import client.utils.ConnectionToDB;

public abstract class TagManager {
	public static List<Tag> getTags(){
		List<Tag> result = new ArrayList<Tag>();
		ConnectionToDB connection = new ConnectionToDB();
		connection.open();
		
		try {
			connection.setStatement(connection.getConnection().createStatement());
			//execution d'une requ�te et r�cup�ration de r�sultat dans l'objet resultSet
			connection.setResultSet(connection.getStatement().executeQuery("SELECT * FROM `tag`;"));
			//r�cup�ration des donn�es
			while(connection.getResultSet().next()) {
				int id = connection.getResultSet().getInt("id");
				String name = connection.getResultSet().getString("tagName");
				result.add(new Tag(id, name));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Probl�me de selection dans la BD (tag)");
		}
		finally {
			connection.close();
		}
		return result;
	}
	
	/**
	 * Remplit la table recipetag(recipe_id,tag_id)
	 * @param tag
	 * @param recipeId
	 */
	public static void addTag(Tag tag, int recipeId) {
		ConnectionToDB connection = new ConnectionToDB();
		connection.open();
		//failles d'injection SQL...
		try {
			PreparedStatement preparedStatement = connection.getConnection().prepareStatement("INSERT INTO `recipetag`(`recipe_id`, `tag_id`) VALUES (?,?);");
			preparedStatement.setInt(1, recipeId);
			preparedStatement.setInt(2, tag.getId());
			
			// executer la requ�te
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Probl�me d'insertion dans la BD (recipeustensil)");
		}finally {
			connection.close();
		}
	}
}
