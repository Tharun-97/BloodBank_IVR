package flow;

import java.util.List;

import org.util.ApiIntegration;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Orchestration Designer at: 2023-FEB-17  02:36:17 PM
 */
public class RegionAPI extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2023-FEB-17  02:36:17 PM
	 */
	public RegionAPI() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("RegionValid", "Default");
		next.setDebugId(839);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
	@Override
	public void requestBegin(SCESession mySession) {
		
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,"Entered Region API Node", mySession);
			
			ApiIntegration api = new ApiIntegration(mySession);
			
			mySession.getVariableField(IProjectVariables.CALL__HISTORY, IProjectVariables.CALL__HISTORY_FIELD_EXITNODE).setValue("Region API Node");

			List<String> regionlist = api.ApiIntegrationList("http://172.16.11.88:8010/BloodBank/regions/listOfRegions","region");
		
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,"Region List: "+regionlist , mySession);


			if (regionlist.contains("noapi") ) {
				mySession.getVariableField(IProjectVariables.API_RESULTS,IProjectVariables.API_RESULTS_FIELD_REGION_LIST).setValue(1);
	
			}
			else if (regionlist.contains("noinput") ) {
				mySession.getVariableField(IProjectVariables.API_RESULTS,IProjectVariables.API_RESULTS_FIELD_REGION_LIST).setValue(2);
			
			} 
			else {
				mySession.getVariableField(IProjectVariables.API_RESULTS, IProjectVariables.API_RESULTS_FIELD_REGION_LIST).setValue(regionlist);

			}


			
		}
		catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,"Error occoured in getting Regions List: "+e.getMessage(), mySession);

			mySession.getVariableField(IProjectVariables.API_RESULTS, IProjectVariables.API_RESULTS_FIELD_REGION_LIST).setValue(3);

		}
	
	}
}
