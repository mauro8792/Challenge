package com.challengeSpring.Controller;

import com.challengeSpring.Model.Message;
import com.challengeSpring.Model.User;
import com.challengeSpring.Repository.MessageRepository;
import com.challengeSpring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageRepository messageDb;

    @Autowired
    private UserRepository userDb;

    @PostMapping(value = "/" )
    public void createMessage(@RequestBody Message message){
        Message news = new Message();
        news.setMessage(message.getMessage());
        news.setFromUserId(message.getFromUserId());
        news.setToUserId(message.getToUserId());
        this.messageDb.save(news);
    }
    @GetMapping(value = "/{messageId}")
    public String getMessageId(@PathVariable("messageId") Long messageId){
        Message getMessage = this.messageDb.findOne(messageId);
        return ("MessageId: " + getMessage.getMessageId());
    }

    @GetMapping(value = "/")
    public List getAll(){
        List<Message> messages = this.messageDb.findAll();
        List<String> all = new ArrayList<>();
        for (Message message : messages) {
            User userFrom = this.userDb.findByUserId(message.getFromUserId());
            User userTO = this.userDb.findByUserId(message.getToUserId());
            all.add(userFrom.getFirstName() + " envia el mensaje: " + message.getMessage() +
                    " a  " + userTO.getFirstName());
        }

        return all;
    }
}
