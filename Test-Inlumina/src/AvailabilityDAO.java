import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvailabilityDAO extends DataAccessObject{
	public List<AvailabilityBean> getList(String day,String time) {
		List<AvailabilityBean> lst = new ArrayList<AvailabilityBean>();
		Connection cnn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM availability INNER JOIN user ON idUser=user.id WHERE user.isSeller=1 AND day=? AND time=? AND available=1";
		try {
			cnn = getConnection();
			pstm = cnn.prepareStatement(sql);
			pstm.setString(1,day);
			pstm.setString(2,time);
			rs = pstm.executeQuery();
			while (rs.next()) {
				lst.add(new AvailabilityBean(rs.getInt("id"),rs.getInt("idUser"),rs.getString("firstName"),rs.getString("lastName"),day,time,true));
			}
		} catch (SQLException e) {
			displayError(e);
		} finally {
			trytoClose(cnn);
			trytoClose(pstm);
			trytoClose(rs);
		}
		return lst;
	}
}
