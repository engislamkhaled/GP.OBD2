import java.sql.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="jdbc:mysql://localhost/obd-gp-dev-1", username="root", pswd="12345678";
		
		try {
			Connection con = DriverManager.getConnection(host, username, pswd);
			Statement st = con.createStatement();
			String tab = "select * from devices";
			ResultSet res = st.executeQuery(tab);
			System.out.println("id\tCM\tCN\tDN");
			while(res.next())
			{
				String id = res.getString(1);
				String CarModel = res.getString(2);
				String CarNumber = res.getString(3);
				String DriverName = res.getString(4);
				System.out.println(id+"\t"+CarModel+"\t"+CarNumber+"\t"+DriverName);
			}

		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
