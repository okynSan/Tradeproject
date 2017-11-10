/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.util.valildators.optionsvalidator;

import ua.anzaevsk.model.trade.Options;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface IOptionsValidator {

    public void validateOptionsTrade(Options trade);

}
