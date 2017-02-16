package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger.database.AjaxDatabase;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.ajax;

public class AjaxService {
	
	private Map<Long,ajax> ajaxs = AjaxDatabase.getAjax();
	
	public AjaxService(){
		ajaxs.put(1L, new ajax(1L,"Hello World","123"));
		ajaxs.put(2L, new ajax(2L,"Hello Jersey","234"));
	}
	
	public List<ajax> getAllajaxs(){
		return new ArrayList<ajax>(ajaxs.values());
	}
	
	public ajax getAjax(Long id){
		return ajaxs.get(id);
	}
	
	public ajax addAjax(ajax ajax_new){
		ajax_new.setId(ajaxs.size() + 1 );
		ajaxs.put(ajax_new.getId(),ajax_new );
		return ajax_new;
	}
}
