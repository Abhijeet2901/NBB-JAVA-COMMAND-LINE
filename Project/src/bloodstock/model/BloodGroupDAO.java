package bloodstock.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface BloodGroupDAO {

	int update(BloodGroup bloodgroup) throws SQLException;

	BloodGroup read(String str) throws SQLException, ParseException;

	List<BloodGroup> read() throws SQLException, ParseException;

}