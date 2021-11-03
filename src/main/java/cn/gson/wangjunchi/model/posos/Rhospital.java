package cn.gson.wangjunchi.model.posos;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class Rhospital {

  private long paiaId;
  private String hzName;
  private String hzXb;
  private long hzNl;
  private String hzSb;
  private String hzGzdw;
  private String hzLxdh;
  private String hzJtzz;
  private String hzZd;
  private String hzZyh;
  private String hzFsjg;
  private String hzCsr;
  private String csrGx;
  private String tbr;
  private String hzQm;
  @JsonFormat(pattern = "yyyy-mm-dd HH：MM：SS")
  private Timestamp rysj;

  public Timestamp getRysj() {
    return rysj;
  }

  public void setRysj(Timestamp rysj) {
    this.rysj = rysj;
  }

  public long getPaiaId() {
    return paiaId;
  }

  public void setPaiaId(long paiaId) {
    this.paiaId = paiaId;
  }


  public String getHzName() {
    return hzName;
  }

  public void setHzName(String hzName) {
    this.hzName = hzName;
  }


  public String getHzXb() {
    return hzXb;
  }

  public void setHzXb(String hzXb) {
    this.hzXb = hzXb;
  }


  public long getHzNl() {
    return hzNl;
  }

  public void setHzNl(long hzNl) {
    this.hzNl = hzNl;
  }


  public String getHzSb() {
    return hzSb;
  }

  public void setHzSb(String hzSb) {
    this.hzSb = hzSb;
  }


  public String getHzGzdw() {
    return hzGzdw;
  }

  public void setHzGzdw(String hzGzdw) {
    this.hzGzdw = hzGzdw;
  }


  public String getHzLxdh() {
    return hzLxdh;
  }

  public void setHzLxdh(String hzLxdh) {
    this.hzLxdh = hzLxdh;
  }


  public String getHzJtzz() {
    return hzJtzz;
  }

  public void setHzJtzz(String hzJtzz) {
    this.hzJtzz = hzJtzz;
  }


  public String getHzZd() {
    return hzZd;
  }

  public void setHzZd(String hzZd) {
    this.hzZd = hzZd;
  }


  public String getHzZyh() {
    return hzZyh;
  }

  public void setHzZyh(String hzZyh) {
    this.hzZyh = hzZyh;
  }


  public String getHzFsjg() {
    return hzFsjg;
  }

  public void setHzFsjg(String hzFsjg) {
    this.hzFsjg = hzFsjg;
  }


  public String getHzCsr() {
    return hzCsr;
  }

  public void setHzCsr(String hzCsr) {
    this.hzCsr = hzCsr;
  }


  public String getCsrGx() {
    return csrGx;
  }

  public void setCsrGx(String csrGx) {
    this.csrGx = csrGx;
  }


  public String getTbr() {
    return tbr;
  }

  public void setTbr(String tbr) {
    this.tbr = tbr;
  }


  public String getHzQm() {
    return hzQm;
  }

  public void setHzQm(String hzQm) {
    this.hzQm = hzQm;
  }

}
