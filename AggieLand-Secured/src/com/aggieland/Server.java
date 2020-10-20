package com.aggieland;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/home")

public class Server {

  @OnOpen
  public void open(Session session) throws IOException, EncodeException {
    session.getBasicRemote().sendText("(Server): Welcome to the chat room. Please state your username to begin.");
    for(Session users: session.getOpenSessions()) {
      users.getBasicRemote().sendText("new user joined" + session.getId());
    }
  }

  @OnClose
  public void close(Session session) throws IOException, EncodeException {

  }

  @OnMessage
  public void handleMessage(String message, Session session) throws IOException, EncodeException {
  }

}
