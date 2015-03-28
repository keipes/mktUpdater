import DB.ConnectionDetails;
import DB.ConnectionPool;

public class Populator {
	public static void main(String[] args) {
		ConnectionDetails details = new ConnectionDetails();
		ConnectionPool pool = new ConnectionPool(details);
	}
}
