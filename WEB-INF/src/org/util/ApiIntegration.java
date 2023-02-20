package org.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class ApiIntegration {

	SCESession session;

	public ApiIntegration(SCESession session) {
		this.session = session;
	}

	public List<String> ApiIntegrationList(String url, String name) {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();

		HttpGet getRequest = new HttpGet(url);

		getRequest.addHeader("accept", "application/json");

		HttpResponse response;
		List<String> result = new ArrayList<String>();
		try {
			response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output = br.readLine();

			JSONObject json = new JSONObject(output);
			// System.out.println("JSON Object" + json);

			String responsebody = json.getString("responseBody");

			// System.out.println(responsebody);

			JSONObject js = new JSONObject(responsebody);

			JSONArray string = (JSONArray) js.get("ResponseList");

			// System.out.println("\n"+string.toString());
			
			for (int i = 0; i < string.length(); i++) {
				JSONObject Object = string.getJSONObject(i);
				// System.out.println("\n"+string.getJSONObject(i));
				// System.out.println("\n" + Object.get(id));

				result.add(Object.get(name).toString());

			}
			System.out.println(result);
			return result;

		} catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in API Access -  " + e.getMessage(), session);
			result.add("noapi");
			return result;
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in IO Access  -  " + e.getMessage(), session);
			result.add("noinput");
			return result;
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in getting result  -  " + e.getMessage(), session);
			return null;
		}

	}

	public String ApiIntegrationValue(String url) {
		String result = null;
		try {

			CloseableHttpClient httpClient = HttpClientBuilder.create().build();

			HttpGet getRequest = new HttpGet(url);

			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output = br.readLine();

			JSONObject json = new JSONObject(output);
			// System.out.println("\n\nJSON Object :"+ json);

			String string = json.getString("responseBody");
			System.out.println(string);

			JSONObject object = new JSONObject(string);
			System.out.println("\n" + object.getString("Response"));

			result = object.getString("Response");
			return result;
		} catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in API Access -  " + e.getMessage(), session);
			return "noapi";
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in IO Access -  " + e.getMessage(), session);
			return "noinput";
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in getting result  -  " + e.getMessage(), session);
			return null;
		}

	}

	public List<String> ApiIntegrationListValues(String url, String name, String branch) {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();

		HttpGet getRequest = new HttpGet(url);

		getRequest.addHeader("accept", "application/json");

		HttpResponse response;
		List<String> result = new ArrayList<String>();
		try {
			response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output = br.readLine();

			JSONObject json = new JSONObject(output);
			// System.out.println("JSON Object" + json);

			String responsebody = json.getString("responseBody");

			// System.out.println("\n responsebody: "+responsebody);

			JSONObject js = new JSONObject(responsebody);

			JSONArray string = (JSONArray) js.get("ResponseList");

			
			for (int i = 0; i < string.length(); i++) {
				JSONObject Object = string.getJSONObject(i);

				String s = Object.get("branch").toString();

				JSONObject bs = new JSONObject(s);
				result.add(bs.get(branch).toString());

				result.add(Object.get(name).toString());

			}
			System.out.println("\n Available units " + result);
			return result;
		}catch (ClientProtocolException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in API Access -  " + e.getMessage(), session);
			result.add("noapi");
			return result;
		} catch (IOException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in IO Access  -  " + e.getMessage(), session);
			result.add("noinput");
			return result;
		} catch (Exception e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Error in getting result  -  " + e.getMessage(), session);
			return null;
		}

	}

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ApiIntegration api = new ApiIntegration(null);
		// System.out.println("Region list: ");
		// api.ApiIntegrationList("http://172.16.11.88:8010/BloodBank/regions/listOfRegions",
		// "region");

		// System.out.println("\nSelect Region by Id: ");
		// api.ApiIntegrationValue("http://172.16.11.88:8010/BloodBank/regions/selectRegionById/2");

		// System.out.println("\nBranch List By RegionID: ");
		// List<String> branchlist =
		// api.ApiIntegrationList("http://172.16.11.88:8010/BloodBank/branches/listOfBranchByRegionId/"+3,"branchLocation");

		// System.err.println("\nSelect Branch By Id: ");
		// api.ApiIntegrationValue("http://172.16.11.88:8010/BloodBank/branches/selectBranchById/1");

		// System.err.println("\nBloodGroup List: ");
		// api.ApiIntegrationList("http://172.16.11.88:8010/BloodBank/bloodGroups/listOfBloodGroups","bloodgroup");

		// System.err.println("\nAvailable Units of Blood: ");
		// api.ApiIntegrationValue("http://172.16.11.88:8010/BloodBank/bloodGroups/getAvailableUnits/Guindy/1");

		api.ApiIntegrationListValues("http://172.16.11.88:8010/BloodBank/bloodGroups/listOfBranchAvailableUnits/1",
				"availableUnits", "branchLocation");
	}
}
