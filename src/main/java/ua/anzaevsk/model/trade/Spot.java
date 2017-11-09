/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.model.trade;

import java.util.Calendar;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Spot extends Trade {

    public Spot() {
    }

    public Spot(String customer, String ccyPair, String type, String direction, Calendar tradeDate, Float amount, Float amount2, Float rate, Calendar valueDate, String legalEntity, String trader) {
        super(customer, ccyPair, type, direction, tradeDate, amount, amount2, rate, valueDate, legalEntity, trader);
    }

}
