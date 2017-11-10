/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.util;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import ua.anzaevsk.model.responce.ResponceObj;
import ua.anzaevsk.model.trade.Forward;
import ua.anzaevsk.model.trade.Options;
import ua.anzaevsk.model.trade.Spot;
import ua.anzaevsk.model.trade.Trade;
import ua.anzaevsk.util.valildators.optionsvalidator.IOptionsValidator;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Validator {

    @Autowired
    IOptionsValidator iOptionsValidator;

    private List<String> tradeExceptions;

    public List<String> getTradeExceptions() {
        return tradeExceptions;
    }

    public ResponceObj getValidateResult(Trade trade) {

        if (trade instanceof Options) {
            return new ResponceObj(iOptionsValidator.validateOptionsTrade((Options) trade)).getResponce();
        } else if (trade instanceof Spot) {

        } else if (trade instanceof Forward) {

        }
        return null;
    }

    public boolean commonValidation(Trade trade) {

        if (trade.getValueDate().before(trade.getTradeDate())) {
            tradeExceptions.add("Value date cannot be before trade date!");
        }

        if (isValueDateNonWorkingDay()) {
            tradeExceptions.add("Value date cannot fall on weekend or non-working day!");
        }

        if (!isSupportedCounterparty()) {
            tradeExceptions.add("This conterparty is not supported!");
        }

        if (!isValidCurrency("currencyCode")) {
            tradeExceptions.add("Invalid currency!");
        }

        return (tradeExceptions.size() > 0) ? false : true;
    }

    public boolean spotValidation(Spot spot) {

        if (spot.getValueDate().after(spot.getTradeDate().add(Calendar.DAY_OF_MONTH, 2))) {
            tradeExceptions.add("Value date cannot be before trade date!");
        }

        return false;
    }

    private boolean isValueDateNonWorkingDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isSupportedCounterparty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isValidCurrency(String currencyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
