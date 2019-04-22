import javax.naming.ldap.Control;
import java.util.Vector;
import java.io.*;

public class drive {
	private static ControlDesk controlDesk;

	public static void main(String[] args) {

		int numLanes = 3;
		int maxPatronsPerParty=5;
		controlDesk = new ControlDesk(numLanes);

		ControlDeskView cdv = new ControlDeskView( controlDesk, maxPatronsPerParty);
		controlDesk.subscribe( cdv );

	}
	
}
