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
public class Options extends Trade {

    private String style;

    public Options(String style) {
        this.style = style;
    }

    public Options(String style, String customer, String ccyPair, String type, String direction, Calendar tradeDate, Float amount, Float amount2, Float rate, Calendar valueDate, String legalEntity, String trader) {
        super(customer, ccyPair, type, direction, tradeDate, amount, amount2, rate, valueDate, legalEntity, trader);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

}
