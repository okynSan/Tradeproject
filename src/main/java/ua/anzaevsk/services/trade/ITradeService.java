/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.services.trade;

import org.springframework.stereotype.Service;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface ITradeService {
    
    public void validateTrade(Trade trade);
    
}
