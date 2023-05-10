package com.example.demo5.service;

import com.example.demo5.domain.todolist;
import com.example.demo5.dto.request.todolistRequest;
import com.example.demo5.dto.response.todolistResponse;
import com.example.demo5.repository.todolistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class todolistService {
    private final todolistRepository todolistRepository;
    public todolistService(todolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    public void save(todolistRequest request) {
        todolistRepository.save(new todolist(request.getDetail()));
    }
    public List<todolistResponse> getList() {
        return todolistRepository.findAll().stream()
                .map(todolist -> new todolistResponse(todolist.getId(), todolist.getDetail()))
                .collect(Collectors.toList());
    }
    public void deletetodolist(long id) {
        todolistRepository.deleteById(id);
    }
}
