package com.revature.coi.revanauts.models;

public class Feedback {
  
  private Long id;
  private Skill skill;
  private Long associateId;   
  private long timeGiven;
  private String notes;
  private boolean isNudge;
  
  public Feedback() {
      super();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public Long getAssociateId() {
    return associateId;
  }

  public void setAssociateId(Long associateId) {
    this.associateId = associateId;
  }

  public long getTimeGiven() {
    return timeGiven;
  }

  public void setTimeGiven(long timeGiven) {
    this.timeGiven = timeGiven;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public boolean isNudge() {
    return isNudge;
  }

  public void setNudge(boolean isNudge) {
    this.isNudge = isNudge;
  }
  
}