package edu.icet.controller;

import edu.icet.dto.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
    private final ItemService service;
    //http://localhost:8081/item/add-item

    @GetMapping("/get-items")
    public List<Item> getItems(){
       return service.getItems();
    }

    @DeleteMapping("/delete/{item_Code}")
    public Boolean deleteById(@PathVariable String item_Code){
         return service.deleteItems(item_Code);
    }

    @PostMapping("/add-item")
    public Item addItem(@RequestBody Item item){
        return service.addItem(item);
    }

    @GetMapping("get-item-by-id/{item_Code}")
    public Item getItemById(@PathVariable String item_Code){
        return service.getItemById(item_Code);
    }
    @PutMapping("/update")
    public Item updateItem(@RequestBody Item item){
        return service.updateItem(item);
    }

}
