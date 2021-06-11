package org.openshift;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {

	@GET
	@Produces("application/json")
	public HashMap<String, String> getInsult() {

		HashMap<String, String> insultMap = new HashMap<>();
		insultMap.put("insult", new InsultGenerator().generateInsult());
		System.out.println("Returning InsultMap::" + insultMap);

		return insultMap;

	}
}
