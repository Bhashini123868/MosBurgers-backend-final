package edu.icet.controller;

import edu.icet.dto.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/Item")
public class ItemController {
    private final ItemService service;
    @GetMapping("/get-items")
    public List<Item> getItems(){
       return service.getItems();
    }
    @DeleteMapping("/delete/{id}")
    public Boolean deleteById(@PathVariable String id){
         return service.deleteItems(id);
    }
    @PostMapping("/add-item")
    public void addItem(@RequestBody Item item){
        service.addItem(item);
    }
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable String itemCode){
        return service.getItemById(itemCode);
    }
    @PutMapping("/update")
    public Item updateItem(@RequestBody Item item){
        return service.updateItem(item);
    }

}
