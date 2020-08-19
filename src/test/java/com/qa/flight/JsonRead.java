package com.qa.flight;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	
	public static JSONObject extractData_JSON(String file) throws Exception {
	    FileReader reader = new FileReader(file);
	    JSONParser jsonParser = new JSONParser();

	    return (JSONObject) jsonParser.parse(reader);
	}
	

	
}
