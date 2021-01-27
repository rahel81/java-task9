package ru.netology.domain.attachment;

public class Poll {
    int id;
    int ownerId;
    int created;
    String question;
    int vote;
    boolean anonymity;
    boolean multiple;
    int endDate;
    boolean closed;
    boolean isBoard;
    boolean canEdit;
    boolean canVote;
    boolean canReport;
    boolean canShare;
    int authorId;
}
