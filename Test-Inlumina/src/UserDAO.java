import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDAO extends DataAccessObject{
	public List<UserBean> getAll() {
		List<UserBean> lst = new ArrayList<UserBean>();
		Connection cnn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM USER";
		try {
			cnn = getConnection();
			pstm = cnn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				lst.add(new UserBean(rs.getInt("id"),rs.getString("firstName"), rs.getString("lastName"), rs.getBoolean("isSeller")));
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
