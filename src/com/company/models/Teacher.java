package com.company.models;

public class Teacher extends User{
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }
}
