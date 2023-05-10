package com.example.demo5.controller;

import com.example.demo5.dto.request.todolistRequest;
import com.example.demo5.dto.response.todolistResponse;
import com.example.demo5.service.todolistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin //CORS Error
public class todolistController {
    private final todolistService todolistService;
    public todolistController(todolistService todolistService) {
        this.todolistService = todolistService;
    }
    @PostMapping("/save")
    public void save(@RequestBody todolistRequest request) {
        todolistService.save(request);
    }
    @GetMapping("/list")
    public List<todolistResponse> giveList() {
        List<todolistResponse> todolistReponseList = todolistService.getList();

        return todolistReponseList;
    }
    @DeleteMapping("/delete")
    public void deleteItem(@RequestParam long id) {
        todolistService.deletetodolist(id);
    }
}
