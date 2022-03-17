package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Message;
import com.demo.repository.MessageRepository;

@Service
public class MessageService {
@Autowired 
MessageRepository messageRepository;
public Message sendMessage(Message message)
{
return messageRepository.save(message);	

}
public List<Message> listerMessage()
{
return messageRepository.findAll();	

}
public void deleteMessage(int id)
{
messageRepository.deleteById(id);	

}

}
