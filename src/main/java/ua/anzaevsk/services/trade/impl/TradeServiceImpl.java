/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.services.trade.impl;

import org.springframework.stereotype.Service;
import ua.anzaevsk.model.responce.ResponceObj;
import ua.anzaevsk.model.trade.Trade;
import ua.anzaevsk.services.trade.ITradeService;
import ua.anzaevsk.util.Validator;

@Service
public class TradeServiceImpl implements ITradeService {

    @Override
    public ResponceObj validateTrade(Trade trade) {
        return new Validator().getValidateResult(trade);
    }

}
