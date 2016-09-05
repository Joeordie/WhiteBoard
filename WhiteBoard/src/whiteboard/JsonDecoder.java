/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboard;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Steven
 */
public class JsonDecoder {
    
    private String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
    private JSONObject myObj;
    
    // constructor
    public JsonDecoder(String input) {
        if (!"".equals(input)) {
            this.s = input;
        }
    }
    
    // take serialized String and create JSON object
    public JSONObject inflateJson() {
        JSONParser parser = new JSONParser();
        
        try {
            Object obj = parser.parse(s);        
            myObj = (JSONObject) obj;
            
            //return myObj;
        }
        catch (ParseException pe) {
            System.out.println(pe);
        }        
        
        return myObj;
    }
    
    // getter method for myObj
    public JSONObject getMyObj() {
        return myObj;
    }
}