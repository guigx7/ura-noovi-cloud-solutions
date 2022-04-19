package flow;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2022 16H53MIN2S BRT
 */
public class Subfluxo_3 extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2022 16H53MIN2S BRT
	 */
	public Subfluxo_3() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2022 17H52MIN3S BRT
	 */
	protected String getSubflowName() {
		return("Subfluxo_3");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2022 17H52MIN3S BRT
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("Subfluxo_3-Subfluxo_4", "Subfluxo_4");
		exitPoints.put("Subfluxo_3-Subfluxo_0", "Subfluxo_0");
		exitPoints.put("Subfluxo_3-quit", "quit");
		return exitPoints;
	}
}