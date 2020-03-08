package com.guyot.vote.entity;

public class VoteQuestionOption {
    private Long id;

    private Long userId;

    private Long questionId;

    private Long optionId;

    private Byte tickets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Byte getTickets() {
        return tickets;
    }

    public void setTickets(Byte tickets) {
        this.tickets = tickets;
    }
}