package parser;

import java.io.IOException;
import java.util.Optional;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.stlimportexport.SYNC_App;
import org.xtext.example.mydsl.api.RunParser;
import org.xtext.example.mydsl.myDsl.Solid;

public class Parser {

	private static SYNC sync;
	
	private static void initialiseFwdSynchroniser() throws IOException {
		if (sync != null)
			sync.terminate();

		sync = new SYNC_App();
	}

	private void initialiseBwdSynchroniser() throws IOException {
		if (sync == null)
			sync = new SYNC_App();
	}

	public static void main(String[] args) throws IOException {
		RunParser sokParser = new RunParser("test2.stl");
		Optional<Solid> board = sokParser.parse();

		board.ifPresent(b -> {
			try {
				initialiseFwdSynchroniser();

				sync.getSourceResource().getContents().add(b);
				System.out.println(sync.getSourceResource().getContents());
				
				sync.forward();
				System.out.println(sync.getTargetResource().getContents());
				sync.saveModels();

				Metamodell.Solid sokBoard = (Metamodell.Solid) sync.getTargetResource().getContents().get(0);
				System.out.println(sokBoard.getFacets().get(0).getNormal());

			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
