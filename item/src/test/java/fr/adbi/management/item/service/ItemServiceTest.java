package fr.adbi.management.item.service;

import fr.adbi.management.item.repository.ItemRepository;
import fr.adbi.management.model.entity.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    ItemRepository itemRepository;

    @InjectMocks
    ItemService itemService;

    @Test
    public void createItemByid() {

        //GIVEN
        Item itemToCreate = Item.builder()
                .code("0001")
                .description("Article0001")
                .unitMeasure("KG")
                .build();

        Item expectedItem = Item.builder()
                .id(1)
                .code("0001")
                .description("Article0001")
                .unitMeasure("KG")
                .build();

        //WHEN
        Mockito.when(itemRepository.save(Mockito.any())).thenReturn(expectedItem);
        Item resultItem = itemService.create(itemToCreate);

        System.out.println(itemToCreate);
        System.out.println(resultItem);

        //THEN
        Assert.assertEquals(resultItem, expectedItem);
    }

}
