/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.controller.trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.anzaevsk.model.responce.ResponceObj;
import ua.anzaevsk.model.trade.Trade;
import ua.anzaevsk.services.trade.ITradeService;

/**
 *
 * @author andrey_zatvornitskiy
 */
@RestController
public class TradeController {

    @Autowired
    ITradeService iTradeService;

    @RequestMapping(value = "/validateTrade", method = RequestMethod.POST)
    public @ResponseBody
    ResponceObj validateTrad(@RequestBody Trade trade) {
        return iTradeService.validateTrade(trade);
    }

}
