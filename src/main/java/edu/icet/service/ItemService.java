package edu.icet.service;

import edu.icet.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems();
    Boolean deleteItems(String itemCode);
    Item addItem(Item item);
    Item updateItem(Item item);
    Item getItemById(String itemCode);
}
