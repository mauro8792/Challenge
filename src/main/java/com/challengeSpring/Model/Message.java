package com.challengeSpring.Model;

import javax.persistence.*;

@Entity
@Table(name = "massages")
public class Message {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "id", unique = true, nullable = false)
    private Long messageId;

    @Column(name = "message", nullable = false)
    private String message;


    @Column(name = "fromUserId", nullable = false)
    private Long fromUserId;

    @Column(name = "toUserId",nullable = false)
    private Long toUserId;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
}
