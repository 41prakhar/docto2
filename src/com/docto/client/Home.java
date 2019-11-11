package com.docto.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;

import com.google.gwt.user.client.ui.Composite;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;
import com.docto.client.GreetingService;
import com.docto.client.GreetingServiceAsync;
import com.docto.shared.Csumm;

public class Home extends Composite{

	private static HomeUiBinder uiBinder = GWT.create(HomeUiBinder.class);

	interface HomeUiBinder extends UiBinder<Widget, Home> {
	}
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	MaterialLabel hl,sl,lg;
	MaterialLink lk;
	int j;

	public Home() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
				}

	    
	
     
	@UiField
	MaterialLink b;
	
	
	@UiField
	MaterialLink feed;
	
	
	@UiField
	MaterialLink trending;
	
	@UiField
	MaterialPanel materpanel;
	
	@UiField
	MaterialLink btnSearch;
	
	
	@UiField
	MaterialNavBar navBar;
	
	@UiField
	MaterialLink evdisplay;
	
		

	public Home(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	b.setText(firstName);
	}
	
	
	

	
	@UiHandler("b")
	void onClick(ClickEvent e) {
		RootPanel.get("tt1").clear();
		Login l=new Login();
	    RootPanel.get("tt1").add(l);
	    
	    }
	
	@UiHandler("feed")
	void onClick1(ClickEvent e) {
		
		RootPanel.get("tt1").clear();
		Feed f=new Feed();
		RootPanel.get("tt1").add(f);
		
		        }
	
	@UiHandler("trending")
      void onClick11(ClickEvent e) {
		
		RootPanel.get("tt1").clear();
		
		        }
	@UiHandler("evdisplay")
	void onClick111(ClickEvent e) {
		RootPanel.get("tt1").clear();
		Evdisplay l=new Evdisplay();
	    RootPanel.get("tt1").add(l);
	    
	    }
	
	
		
	    
	    
       

}

