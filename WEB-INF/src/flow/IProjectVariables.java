package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2023-JAN-19  04:23:12 PM
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2023-FEB-13  06:59:22 PM
	 */
	public static final String AUDIO_URLS = "AudioURLs";
	public static final String DTMFAUDIO = "DTMFaudio";
	public static final String BRANCH_SELECTION = "BranchSelection";
	public static final String SELECT_BLOOD__GROUP = "SelectBlood_group";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String SERVICE_SELECT = "ServiceSelect";
	public static final String DATE = "date";
	public static final String CALL__HISTORY = "Call_History";
	public static final String BRANCH_SELECT = "BranchSelect";
	public static final String SESSION = "session";
	public static final String PAGE_NUMBER = "PageNumber";
	public static final String REGION_SELECTION = "RegionSelection";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String BLOOD__GROUP = "Blood_group";
	public static final String CHOICE_URLS = "ChoiceURLs";
	public static final String TIME = "time";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String AUDIO_URLS_FIELD_BLOOD_GROUP_SELECT = "BloodGroupSelect";
	public static final String AUDIO_URLS_FIELD_BRANCH_SELECT = "BranchSelect";
	public static final String AUDIO_URLS_FIELD_ERROR = "Error";
	public static final String AUDIO_URLS_FIELD_GREETINGS = "Greetings";
	public static final String AUDIO_URLS_FIELD_MAX_LIMIT = "MaxLimit";
	public static final String AUDIO_URLS_FIELD_NEXT = "Next";
	public static final String AUDIO_URLS_FIELD_NULL_INPUT = "NullInput";
	public static final String AUDIO_URLS_FIELD_PREVIOUS = "Previous";
	public static final String AUDIO_URLS_FIELD_REGION_SELECT = "RegionSelect";
	public static final String AUDIO_URLS_FIELD_REPEAT = "Repeat";
	public static final String AUDIO_URLS_FIELD_SERVICE_SELECT = "ServiceSelect";
	public static final String AUDIO_URLS_FIELD_WRONG_INPUT = "WrongInput";
	public static final String DTMFAUDIO_FIELD_PRESS_1 = "Press1";
	public static final String DTMFAUDIO_FIELD_PRESS_2 = "Press2";
	public static final String DTMFAUDIO_FIELD_PRESS_3 = "Press3";
	public static final String DTMFAUDIO_FIELD_PRESS_4 = "Press4";
	public static final String DTMFAUDIO_FIELD_PRESS_5 = "Press5";
	public static final String DTMFAUDIO_FIELD_PRESS_6 = "Press6";
	public static final String BRANCH_SELECTION_FIELD_CONFIDENCE = "confidence";
	public static final String BRANCH_SELECTION_FIELD_INPUTMODE = "inputmode";
	public static final String BRANCH_SELECTION_FIELD_INTERPRETATION = "interpretation";
	public static final String BRANCH_SELECTION_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BRANCH_SELECTION_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BRANCH_SELECTION_FIELD_UTTERANCE = "utterance";
	public static final String BRANCH_SELECTION_FIELD_VALUE = "value";
	public static final String SELECT_BLOOD__GROUP_FIELD_CONFIDENCE = "confidence";
	public static final String SELECT_BLOOD__GROUP_FIELD_INPUTMODE = "inputmode";
	public static final String SELECT_BLOOD__GROUP_FIELD_INTERPRETATION = "interpretation";
	public static final String SELECT_BLOOD__GROUP_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String SELECT_BLOOD__GROUP_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String SELECT_BLOOD__GROUP_FIELD_UTTERANCE = "utterance";
	public static final String SELECT_BLOOD__GROUP_FIELD_VALUE = "value";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String SERVICE_SELECT_FIELD_CONFIDENCE = "confidence";
	public static final String SERVICE_SELECT_FIELD_INPUTMODE = "inputmode";
	public static final String SERVICE_SELECT_FIELD_INTERPRETATION = "interpretation";
	public static final String SERVICE_SELECT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String SERVICE_SELECT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String SERVICE_SELECT_FIELD_UTTERANCE = "utterance";
	public static final String SERVICE_SELECT_FIELD_VALUE = "value";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String CALL__HISTORY_FIELD_DURATION = "duration";
	public static final String CALL__HISTORY_FIELD_ENDDATE = "enddate";
	public static final String CALL__HISTORY_FIELD_EXITNODE = "exitnode";
	public static final String CALL__HISTORY_FIELD_EXITREASON = "exitreason";
	public static final String CALL__HISTORY_FIELD_IP = "ip";
	public static final String CALL__HISTORY_FIELD_STARTDATE = "startdate";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PARENT_ID = "exitParentId";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String PAGE_NUMBER_FIELD_MENU_PAGE_NUMBER = "MenuPageNumber";
	public static final String REGION_SELECTION_FIELD_CONFIDENCE = "confidence";
	public static final String REGION_SELECTION_FIELD_INPUTMODE = "inputmode";
	public static final String REGION_SELECTION_FIELD_INTERPRETATION = "interpretation";
	public static final String REGION_SELECTION_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String REGION_SELECTION_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String REGION_SELECTION_FIELD_UTTERANCE = "utterance";
	public static final String REGION_SELECTION_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String BLOOD__GROUP_FIELD_CONFIDENCE = "confidence";
	public static final String BLOOD__GROUP_FIELD_INPUTMODE = "inputmode";
	public static final String BLOOD__GROUP_FIELD_INTERPRETATION = "interpretation";
	public static final String BLOOD__GROUP_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BLOOD__GROUP_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BLOOD__GROUP_FIELD_UTTERANCE = "utterance";
	public static final String BLOOD__GROUP_FIELD_VALUE = "value";
	public static final String CHOICE_URLS_FIELD_CHOICE_1 = "Choice1";
	public static final String CHOICE_URLS_FIELD_CHOICE_2 = "Choice2";
	public static final String CHOICE_URLS_FIELD_CHOICE_3 = "Choice3";
	public static final String CHOICE_URLS_FIELD_CHOICE_4 = "Choice4";
	public static final String CHOICE_URLS_FIELD_CHOICE_5 = "Choice5";
	public static final String CHOICE_URLS_FIELD_CHOICE_6 = "Choice6";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
