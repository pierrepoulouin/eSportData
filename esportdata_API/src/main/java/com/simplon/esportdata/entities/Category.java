package com.simplon.esportdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="t_category")
public class Category extends AbstractEntity{
  @Column
  private String FPS;
  @Column
  private String RPG;
  @Column
  private String RTS;
  @Column
  private String MOBA;
  @Column
  private String MMORPG;
  @Column
  private String VSFIGHTING;
  @Column
  private String SPORT;

  public String getFPS() {
    return FPS;
  }

  public void setFPS(String FPS) {
    this.FPS = FPS;
  }

  public String getRPG() {
    return RPG;
  }

  public void setRPG(String RPG) {
    this.RPG = RPG;
  }

  public String getRTS() {
    return RTS;
  }

  public void setRTS(String RTS) {
    this.RTS = RTS;
  }

  public String getMOBA() {
    return MOBA;
  }

  public void setMOBA(String MOBA) {
    this.MOBA = MOBA;
  }

  public String getMMORPG() {
    return MMORPG;
  }

  public void setMMORPG(String MMORPG) {
    this.MMORPG = MMORPG;
  }

  public String getVSFIGHTING() {
    return VSFIGHTING;
  }

  public void setVSFIGHTING(String VSFIGHTING) {
    this.VSFIGHTING = VSFIGHTING;
  }

  public String getSPORT() {
    return SPORT;
  }

  public void setSPORT(String SPORT) {
    this.SPORT = SPORT;
  }
}
