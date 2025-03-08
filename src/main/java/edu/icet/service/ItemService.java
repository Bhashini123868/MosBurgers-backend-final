package edu.icet.service;

import edu.icet.dto.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems();
    Boolean deleteItems(String id);
    Item addItem(Item item);
}
