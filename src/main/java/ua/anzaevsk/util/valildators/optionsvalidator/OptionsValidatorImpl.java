/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.util.valildators.optionsvalidator;

import ua.anzaevsk.model.responce.ResponceObj;
import ua.anzaevsk.model.trade.Options;

public class OptionsValidatorImpl implements IOptionsValidator {

    @Override
    public ResponceObj validateOptionsTrade(Options trade) {

        if (trade.getStyle().equals("American") || trade.getStyle().equals("European")) {
            if (trade.getStyle().equals("American") && (trade.getExcerciseStartDate().after(trade.getTradeDate())
                    && trade.getExcerciseStartDate().before(trade.getExpiryDate()))) {
                if (trade.getExpiryDate().before(trade.getDeliveryDate())
                        && trade.getPremiumDate().before(trade.getDeliveryDate())) {
                    return new ResponceObj("Validation passed");
                }

            }
        }
        return new ResponceObj("Validation wasn't passed");
    }

}
