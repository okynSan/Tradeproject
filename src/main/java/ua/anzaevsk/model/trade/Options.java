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
    private Calendar excerciseStartDate;
    private Calendar expiryDate;
    private Calendar premiumDate;
    private Calendar deliveryDate;

    public Options(String style, Calendar excerciseStartDate, Calendar expiryDate, Calendar premiumDate, Calendar deliveryDate) {
        this.style = style;
        this.excerciseStartDate = excerciseStartDate;
        this.expiryDate = expiryDate;
        this.premiumDate = premiumDate;
        this.deliveryDate = deliveryDate;
    }

    public Options(String style, Calendar excerciseStartDate, Calendar expiryDate, Calendar premiumDate, Calendar deliveryDate, String customer, String ccyPair, String type, String direction, Calendar tradeDate, Float amount, Float amount2, Float rate, Calendar valueDate, String legalEntity, String trader) {
        super(customer, ccyPair, type, direction, tradeDate, amount, amount2, rate, valueDate, legalEntity, trader);
        this.style = style;
        this.excerciseStartDate = excerciseStartDate;
        this.expiryDate = expiryDate;
        this.premiumDate = premiumDate;
        this.deliveryDate = deliveryDate;
    }

    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Calendar getPremiumDate() {
        return premiumDate;
    }

    public void setPremiumDate(Calendar premiumDate) {
        this.premiumDate = premiumDate;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Calendar getExcerciseStartDate() {
        return excerciseStartDate;
    }

    public void setExcerciseStartDate(Calendar excerciseStartDate) {
        this.excerciseStartDate = excerciseStartDate;
    }

}
