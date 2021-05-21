package fr.adbi.item.service;

import fr.adbi.common.entity.Item;
import fr.adbi.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Item create(Item item) {
        return itemRepository.save(item);
    }

}
