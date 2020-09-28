package com.aggieland;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/home")

public class Server {

  @OnOpen
  public void open(Session session) throws IOException, EncodeException {
    session.getBasicRemote().sendText("(Server): Welcome to the chat room. Please state your username to begin.");

  }

  @OnClose
  public void close(Session session) throws IOException, EncodeException {

  }

  @OnMessage
  public void handleMessage(String message, Session session) throws IOException, EncodeException {

  }

}
