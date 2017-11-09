/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.anzaevsk.controller.trade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.anzaevsk.model.trade.Trade;

/**
 *
 * @author andrey_zatvornitskiy
 */
@RestController
public class TradeController {

    @RequestMapping(value = "/validateTrade")
    public String validateTrad(@RequestParam Trade trade) {
        return "Works";
    }

}
