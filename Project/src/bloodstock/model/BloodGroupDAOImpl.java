package bloodstock.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BloodGroupDAOImpl implements BloodGroupDAO  {

	    @Override
		public   int update(BloodGroup bloodgroup) throws SQLException {
		Connection con = MyBloodstockConection.getConnection();
		PreparedStatement st = con.prepareStatement("UPDATE BLOODSTOCK SET UNITS=? WHERE BLOODGROUP=?");
		st.setInt(1,bloodgroup.getNoOfUnits());
		st.setString(2, bloodgroup.getBloodGroup());	
		int no=st.executeUpdate();
     	con.close();
		return no;

		
	}
	    @Override
		public BloodGroup read(String str) throws SQLException, ParseException {
			Connection con=MyBloodstockConection.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM BLOODSTOCK WHERE BLOODGROUP=?");
			st.setString(1, str);
			ResultSet rs = st.executeQuery();
			BloodGroup bloodgroup=null;
			if(rs.next())
			{
				bloodgroup=new BloodGroup( rs.getString(1),rs.getInt(2));
				String str1 = String.format("\n"
						+ " Blood group      = %s\n"
						+ " Available units  = %s\n",rs.getString(1),rs.getInt(2));
				System.out.println("\n");
				System.out.println(str1);
			}
			return bloodgroup;
		
			
		}
	    @Override
		public List<BloodGroup> read() throws SQLException, ParseException {
			
			Connection con=MyBloodstockConection.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM BLOODSTOCK");
			ResultSet rs = st.executeQuery();
			List<BloodGroup> bloodGroupList=new ArrayList<BloodGroup>();
			while(rs.next())
			{
				BloodGroup bloodgroup=new BloodGroup(rs.getString(1),rs.getInt(2));
				bloodGroupList.add(bloodgroup);
				String str1 = String.format("\n"
						+ " Blood group      = %s\n"
						+ " Available units  = %s\n",rs.getString(1),rs.getInt(2));
				System.out.println("\n");
				System.out.println(str1);
			}
			return bloodGroupList;
		
		}

	
	public static void main(String[] args) throws SQLException {
//		BloodGroupDAOImpl bgi=new BloodGroupDAOImpl();
//		BloodGroup bg=new BloodGroup("A+",500);
//		bgi.update(bg);
//		System.out.println("sucess");
		
	}
}
