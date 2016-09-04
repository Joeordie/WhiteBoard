/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboard;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author joeordie
 */
public class DisplayListItem {
    private String strItemName;  // Name of item.
    private String strType;  //Type of shopping [hardware store, groceryStore Amazon.com]
    private String strSource;
    private String strNotes;
    
    public void setItemName(String itemName){
        strItemName = itemName;
    }
    
    public String getItemName(){
        return strItemName;
    }
     
    public void setType(String itemType){
        strType = itemType;
    }
    
    public String getType(){
        return strType;
    }
    
    public void setSource(String itemSource){
        strSource = itemSource;       
    }
    
    public String getSource(){
        return strSource;
    }
    
    public void setNote(String itemNote){
        strNotes = itemNote;
    }
    
    public String getNote(){
        return strNotes;
    }
    
    public void setAll(Map<String, String> args){
        Map<String, String> itemData = new HashMap<>();
        strItemName = itemData.get("name");
        strType = itemData.get("type");
        strSource = itemData.get("source");
        strNotes = itemData.get("note");
    }
    
    public Map publish(){
        Map attributes = new HashMap();
        attributes.put("name", strItemName);
        attributes.put("type", strType);
        attributes.put("Source", strSource);
        attributes.put("notes", strNotes);
        
        return attributes;
    }
}
