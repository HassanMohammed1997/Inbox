package com.semicolon.inbox;

public class Inbox {

  private String username;
  private String message;
  private int avatar;

  public Inbox(String username, String message, int avatar) {
    this.username = username;
    this.message = message;
    this.avatar = avatar;
  }

  public String getUsername() {
    return username;
  }

  public String getMessage() {
    return message;
  }

  public int getAvatar() {
    return avatar;
  }
}
