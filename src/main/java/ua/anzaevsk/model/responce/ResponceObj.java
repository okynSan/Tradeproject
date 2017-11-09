/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.model.responce;

import java.util.HashMap;
import java.util.Map;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class ResponceObj {
    
    Map<Trade, String> responceMap = new HashMap<>();

    public Map<Trade, String> getResponceMap() {
        return responceMap;
    }

    public void setResponceMap(Map<Trade, String> responceMap) {
        this.responceMap = responceMap;
    }
    
    
    
}
