package edu.icet.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Item;
import edu.icet.entity.ItemEntity;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;
    final ObjectMapper mapper;

    @Override
    public List<Item> getItems() {
        List<ItemEntity> itemEntities = repository.findAll();
        List<Item> itemList = new ArrayList<>();
        itemEntities.forEach(itemEntity -> itemList.add(
                mapper.convertValue(
                        itemEntity, Item.class
                )
        ));
        return itemList;
    }

    @Override
    public Boolean deleteItems(String id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Item addItem(Item item) {
        return mapper.convertValue(
                repository.save(
                        mapper.convertValue(
                                item,
                                ItemEntity.class
                        )
                ), Item.class
        );
    }

    @Override
    public Item updateItem(Item item) {
        if (repository.existsById(item.getItemCode())){
            ItemEntity updatedEntity = repository.save(mapper.convertValue(item, ItemEntity.class));
            return mapper.convertValue(updatedEntity, Item.class);
        }
        return null;
    }

    @Override
    public Item getItemById(String itemCode) {
        Optional<ItemEntity> entity = repository.findById(itemCode);
        return entity.map(value -> mapper.convertValue(value, Item.class)).orElse(null);
    }
}
