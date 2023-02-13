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
 * Last generated by Orchestration Designer at: 2023-FEB-07  12:15:24 PM
 */
public class BranchSelect extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2023-FEB-07  12:15:24 PM
	 */
	public BranchSelect() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-FEB-13  06:44:30 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("Available_units", "Default");
		next.setDebugId(632);
		return next;
	}
	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-13  06:44:30 PM
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
	 * Last generated by Orchestration Designer at: 2023-FEB-13  06:44:30 PM
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
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,"Entered Branch Select Node", mySession);
		
		mySession.getVariableField(IProjectVariables.CALL__HISTORY, IProjectVariables.CALL__HISTORY_FIELD_EXITNODE).setValue("Branch Select Node");


		List<String> branchlist=null;
		
		int PageNumber = mySession.getVariableField(IProjectVariables.PAGE_NUMBER,
				IProjectVariables.PAGE_NUMBER_FIELD_MENU_PAGE_NUMBER).getIntValue();		
		
		int branchselect= mySession.getVariableField(IProjectVariables.BRANCH_SELECTION, IProjectVariables.BRANCH_SELECTION_FIELD_VALUE).getIntValue();
		
		String dtmfInput = mySession.getVariableField(IProjectVariables.REGION_SELECTION, IProjectVariables.REGION_SELECTION_FIELD_VALUE).getStringValue();
		
		
		System.out.println(dtmfInput);
		System.out.println(branchselect);
		
		ApiIntegration api = new ApiIntegration(mySession);
		try {
			 branchlist = api.ApiIntegrationList("http://172.16.11.88:8010/BloodBank/branches/listOfBranchByRegionId/"+dtmfInput,
					 "branchLocation");
		System.out.println(branchlist);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}	
		
		int menupage = 0;

		if (branchlist.size() % 6 == 0) {
			menupage = branchlist.size() / 6;
		} else {
			menupage = (branchlist.size() / 6) + 1;
		}

		
		String branch=null;
		
		if (menupage==1) {
			for (int i = 0; i <branchlist.size() ; i++)
			{	
			 branch = branchlist.get(branchselect-1);		
			}
		}
		else {
			if (PageNumber == 0) {
				for (int i = 0; i < 6; i++) {
					branch = branchlist.get(branchselect-1);
				}
			}
			else if (PageNumber == menupage - 1) {
			
				for (int i = PageNumber * 6; i < branchlist.size(); i++) {	
					branch = branchlist.get(branchselect+((PageNumber*6)-1));
				}
			}else {
			
				
				for (int i = PageNumber * 6; i < (PageNumber * 6) + 6; i++) {
					branch = branchlist.get(branchselect+((PageNumber*6)-1));
				}
			}
		}
		
			System.out.println(branch);

			mySession.getVariableField(IProjectVariables.BRANCH_SELECT).setValue(branch);
	}
	
}
