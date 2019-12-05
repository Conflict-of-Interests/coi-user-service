package com.revature.coi.revanauts.models;

public class Skill {

  private Long id;
  private String name;
  private String description;
  private String improvementTips;

  public Skill() {
    super();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImprovementTips() {
    return improvementTips;
  }

  public void setImprovementTips(String improvementTips) {
    this.improvementTips = improvementTips;
  }

}
