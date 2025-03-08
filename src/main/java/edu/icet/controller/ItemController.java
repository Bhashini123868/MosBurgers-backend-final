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
    final ItemService service;
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

}
