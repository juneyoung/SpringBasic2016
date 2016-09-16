package org.owls.annotation.test.listener;

import java.util.UUID;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HttpSessionListenerImpl implements HttpSessionListener {
	
	private int sessionIdx;
	
	private String generateSessionID(){
		return UUID.randomUUID().toString();
	}
	

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionIdx++;
		HttpSession session = arg0.getSession();
		session.setAttribute("index", sessionIdx);
		session.setAttribute("ID", generateSessionID());
		System.out.println("A Session created");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionIdx--;
		System.out.println("A Session destroyed");
	}
}
