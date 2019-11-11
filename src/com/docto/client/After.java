package com.docto.client;

import java.awt.Font;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialTitle;

public class After extends Composite {

	private static AfterUiBinder uiBinder = GWT.create(AfterUiBinder.class);

	interface AfterUiBinder extends UiBinder<Widget, After> {
	}
   
	
	
	 @UiField
	 MaterialTitle lo;
	 
	 @UiField
	 MaterialImage lon; 
	 
	 @UiField
	 MaterialTitle su;
	 
	 @UiField
	 MaterialImage sum;
	 
	 @UiField
	 MaterialTitle Event;
	 
	 @UiField
	 MaterialImage event;
	 
	 
	 
	 
	 
	public After() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiHandler("lo")
	void onClick11(ClickEvent e) {
		
		RootPanel.get().clear();
		Submit a=new Submit();
		RootPanel.get().add(a);
		
	
	}
	
	@UiHandler("lon")
	void onClick2(ClickEvent e) {
		RootPanel.get().clear();
		Submit a=new Submit();
		RootPanel.get().add(a);
		
	
	}
	
	@UiHandler("su")
	void onClick1(ClickEvent e) {
		
		RootPanel.get().clear();
		Docveda a=new Docveda();
		RootPanel.get().add(a);
		
		
	
	}
	
	@UiHandler("sum")
	void onClick(ClickEvent e) {
		
		RootPanel.get().clear();
		Docveda a=new Docveda();
		RootPanel.get().add(a);
	
	}
	@UiHandler("event")
	void onClick111(ClickEvent e) {
		
		RootPanel.get().clear();
		Even a=new Even();
		RootPanel.get().add(a);
	
	}
	@UiHandler("Event")
	void onClick1111(ClickEvent e) {
		
		RootPanel.get().clear();
		Even a=new Even();
		RootPanel.get().add(a);
	
	}


}
