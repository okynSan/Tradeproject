/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.util;

import java.util.logging.Logger;
import ua.anzaevsk.model.responce.ResponceObj;
import ua.anzaevsk.model.trade.Forward;
import ua.anzaevsk.model.trade.Options;
import ua.anzaevsk.model.trade.Spot;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Validator {

    public ResponceObj getValidateResult(Trade trade) {

        if (trade instanceof Options) {

        } else if (trade instanceof Spot) {

        } else if (trade instanceof Forward) {

        }

        return null;
    }

}
