package main.repository;

import main.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MessageReporitory extends CrudRepository<Message, Integer> {
    ArrayList<Message> findAll();
}
