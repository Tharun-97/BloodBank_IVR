/**
 * Last generated by Orchestration Designer at: 2023-FEB-01  04:02:36 PM
 */
package english.prompts;

public class requiredUnits extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for requiredUnits.
	 */
	public requiredUnits() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2023-FEB-10  05:54:13 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("requiredUnits");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

	}
}
