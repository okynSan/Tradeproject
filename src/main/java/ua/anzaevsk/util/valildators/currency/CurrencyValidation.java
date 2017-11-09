/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.util.valildators.currency;

import java.util.Currency;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class CurrencyValidation {
    
    public boolean isCurrencyCodeCorrect(Trade trade){
        return Currency.getAvailableCurrencies().contains(null); // to do add the validation
    }
    
}
