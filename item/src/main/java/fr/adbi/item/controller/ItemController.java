package fr.adbi.item.controller;

import fr.adbi.common.entity.Item;
import fr.adbi.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

    @Autowired
    ItemService itemService;


    @PostMapping(path = "/api/item/")
    public Item hello(Item item){
        return itemService.create(item);
    }
}
