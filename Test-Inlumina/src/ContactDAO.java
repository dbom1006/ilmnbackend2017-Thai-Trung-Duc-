import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ContactDAO extends DataAccessObject{
	public void insertContact(AvailabilityBean av,int idUser) {
		Connection cnn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "INSERT INTO contract(idUser, idAvailability, timeCreate) VALUES (?,?,?)";
		try {
			cnn = getConnection();
			pstm = cnn.prepareStatement(sql);
			pstm.setInt(1,idUser);
			pstm.setInt(2,av.getId());
			pstm.setDate(3,new java.sql.Date(new Date().getTime()));
			pstm.execute();
		} catch (SQLException e) {
			displayError(e);
		} finally {
			trytoClose(cnn);
			trytoClose(pstm);
			trytoClose(rs);
		}
	}
}
