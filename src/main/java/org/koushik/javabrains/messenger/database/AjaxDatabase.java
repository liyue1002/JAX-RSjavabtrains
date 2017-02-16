package org.koushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.ajax;

public class AjaxDatabase {

	private static Map<Long , ajax> ajaxs = new HashMap<>();
	
	public static Map<Long , ajax> getAjax() {
		return ajaxs;
	}
}
