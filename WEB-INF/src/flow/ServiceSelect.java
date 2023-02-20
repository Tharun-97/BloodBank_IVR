package flow;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * Class that represents a menu. A menu can contain prompts, choices and links
 * as well as handlers for various events that may occur while the menu is
 * executing Last generated by Orchestration Designer at: 2023-JAN-23 12:51:42
 * PM
 */
public class ServiceSelect extends com.avaya.sce.runtime.Menu {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2023-JAN-23
	 * 12:51:42 PM
	 */
	public ServiceSelect() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		setNeedsDefaultDisconnectHandler(false);
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		// This item does not have any defined links
		list = new java.util.ArrayList();
		String ___tempGrammarName = null;

		return(list);
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 * @return a collection of properties
	 */
	public java.util.Collection getProperties(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Property property;
		java.util.List list;
		// This item does not have any defined properties
		list = new java.util.ArrayList();

		return(list);
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(2);
		java.util.List eventPromptNames = null;
		String ___tempPromptName = null;

		// build the list of prompt names
		eventPromptNames = new java.util.ArrayList(1);
		
		eventPromptNames.add(new com.avaya.sce.runtime.PromptRefInfo("NoInput", ""));

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOINPUT, (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("NoInputService", 3, true, ""));
		list.add(event);

		// build the list of prompt names
		eventPromptNames = new java.util.ArrayList(1);
		
		eventPromptNames.add(new com.avaya.sce.runtime.PromptRefInfo("NoMatch", ""));

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOMATCH, (com.avaya.sce.runtime.PromptRefInfo[])eventPromptNames.toArray(new com.avaya.sce.runtime.PromptRefInfo[0]), new com.avaya.sce.runtime.Goto("NoMatchService", 3, true, ""));
		list.add(event);
		return(list);
	}

	/**
	 * Builds the list of choices for the menu.  This list is built
	 * automatically by the code generator and should not be edited
	 * manually.  Future code generation may overwrite any changes
	 * to this method.<br>
	 * To modify the list of choices, override:<br>
	 *    updateChoices(Collection choices, SCESession mySession)
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public java.util.Collection getChoices(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Choice choice = null;
		java.util.Collection grammarInfo = null;
		list = new java.util.ArrayList(2);
		String ___tempGrammarName = null;

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList();


		choice = new com.avaya.sce.runtime.Choice("EnquireAvailableBloodGroups ", "1", true, "exact", "RegionAPI", grammarInfo, true);
		list.add(choice);

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList();


		choice = new com.avaya.sce.runtime.Choice("GetBloodUnits", "2", true, "exact", "GetBloodUnits", grammarInfo, true);
		list.add(choice);

		return(list);
	}

	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		String ___tempPromptName = null;
		// build the list of prompt names
		list = new java.util.ArrayList(1);
		
		list.add(new com.avaya.sce.runtime.PromptRefInfo("Service", ""));

		return(list);
	}

	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Orchestration Designer at: 2023-FEB-20  06:21:04 PM
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no tracking items.
		list = new java.util.ArrayList();
		return(list);
	}

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Entered Service Select Node", mySession);
		try {
		mySession.getVariableField(IProjectVariables.CALL__HISTORY, IProjectVariables.CALL__HISTORY_FIELD_EXITNODE).setValue("Service Select Node");
		}catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,"Error occoured in service selection node: "+e.getMessage(), mySession);

		}
		
	}
}
