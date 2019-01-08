package menubar;
import java.util.ArrayList;  
import java.util.List;
import java.sql.*;

public class MenuBarDAO {

	public static List<MenuItem> getMenuList()
	{
		List<MenuItem> menuList = new ArrayList<MenuItem>();
		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM menubar");
			while(rs.next())
			{
				MenuItem menuItem = new MenuItem(rs.getString("menu_item_name"),rs.getString("menu_item_link"));
				menuList.add(menuItem);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return menuList;
	}

}
