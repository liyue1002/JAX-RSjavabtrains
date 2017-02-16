package org.koushik.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger.model.ajax;
import org.koushik.javabrains.messenger.service.AjaxService;

@Path("/ajaxs")
public class AjaxResource {
		
	AjaxService ajaxService = new AjaxService();
	static Integer a = 0;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getajaxs(){
		a++;
		System.out.println(a);
		return a.toString();
	}
	
//	@GET
//	@Path("/{ajaxId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public ajax  getajax(@PathParam("ajaxId")Long id){
//		System.out.println(ajaxService.getAjax(id).getName());
//		System.out.println(id);
//		return (new ajax(1L,"Hello World","123"));
//	}
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//		public ajax addMessage(ajax ajax_new){
//		return ajaxService.addAjax(ajax_new);
//	}
}
