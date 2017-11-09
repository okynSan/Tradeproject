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
public class Trade {
    
    private String customer;
    private String ccyPair;
    private String type;
    private String direction;
    private Calendar tradeDate;
    private Float amount;
    private Float amount2;
    private Float rate;
    private Calendar valueDate;
    private String legalEntity;
    private String trader;
    
     public Trade(){}

    public Trade(String customer, String ccyPair, String type, String direction, Calendar tradeDate, Float amount, Float amount2, Float rate, Calendar valueDate, String legalEntity, String trader) {
        this.customer = customer;
        this.ccyPair = ccyPair;
        this.type = type;
        this.direction = direction;
        this.tradeDate = tradeDate;
        this.amount = amount;
        this.amount2 = amount2;
        this.rate = rate;
        this.valueDate = valueDate;
        this.legalEntity = legalEntity;
        this.trader = trader;
    }
    
    

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCcyPair() {
        return ccyPair;
    }

    public void setCcyPair(String ccyPair) {
        this.ccyPair = ccyPair;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Calendar getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Calendar tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getAmount2() {
        return amount2;
    }

    public void setAmount2(Float amount2) {
        this.amount2 = amount2;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Calendar getValueDate() {
        return valueDate;
    }

    public void setValueDate(Calendar valueDate) {
        this.valueDate = valueDate;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }
    
    
}
 