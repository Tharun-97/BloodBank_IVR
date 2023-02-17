package org.util;

import com.avaya.sce.runtime.Prompt;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class ChoiceSelection {

	public void Choice(String name,String dtmf,SCESession mySession,Prompt p ) {
		if (dtmf.equals("1")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_1).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
			
			p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice1",
					com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		}else if (dtmf.equals("2")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_2).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
				
				p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice2",
						com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		}else if (dtmf.equals("3")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_3).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
				
				p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice3",
						com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		}else if (dtmf.equals("4")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_4).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
				
				p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice4",
						com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		}else if (dtmf.equals("5")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_5).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
				
				p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice5",
						com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
		}else if (dtmf.equals("6")) {
			 mySession.getVariableField(IProjectVariables.CHOICE_URLS,IProjectVariables.CHOICE_URLS_FIELD_CHOICE_6).setValue("http://172.16.11.88:8090/IVR_Audios/BloodBank/"+name+".wav");	
				
				p.add(1, new com.avaya.sce.runtime.PhraseVariableElement("ChoiceURLs:Choice6",
						com.avaya.sce.runtime.PhraseVariableElement.Type.AUDIO_URL, false));
			
		}
	}
}
