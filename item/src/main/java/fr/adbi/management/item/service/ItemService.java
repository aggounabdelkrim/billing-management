package fr.adbi.management.item.service;

import fr.adbi.management.item.repository.ItemRepository;
import fr.adbi.management.model.entity.Item;
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
