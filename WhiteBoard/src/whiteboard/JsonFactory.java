/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboard;

import org.json.simple.JSONObject;

// these imports are needed to access HashMap methods
import java.util.HashMap;

/**
 * builds JSON objects from HashMap objects
 * @author Steven smyhk
 */
public class JsonFactory {
    // 
    private HashMap jsonMap = new HashMap();
    
    // constructor; takes single HashMap object parameter
    public JsonFactory(HashMap jsonMap) {
        if (jsonMap != null) {
             this.jsonMap = jsonMap;
        }
    }
    
    // converts the HashMap to a JSON object; returns String
    public String createJsonString() {
        // create empty JSON object
        JSONObject obj = new JSONObject();
        
        // call JSON library putAll to 1:1 map the HashMap to the JSON object
        obj.putAll(this.jsonMap);
        
        // convert the JSON to String
        String outPut = obj.toString();
        
        return outPut;
    }
}