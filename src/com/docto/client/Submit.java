package com.docto.client;

import com.docto.shared.News;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialTitle;
import gwt.material.design.client.ui.MaterialToast;

public class Submit extends Composite {
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	private static SubmitUiBinder uiBinder = GWT.create(SubmitUiBinder.class);

	interface SubmitUiBinder extends UiBinder<Widget, Submit> {
	}
	
	@UiField
	MaterialTitle l;

	
	@UiField
	MaterialTextBox tb;
	
	
	
	@UiField
	MaterialTextArea t;

	@UiField
	MaterialButton button;
	@UiField
	MaterialButton b1;
	
	@UiField
	MaterialButton su;

	@UiField
	VerticalPanel v;

	public Submit() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("su")
	void onClick11(ClickEvent t) {
		
		RootPanel.get().clear();
		Docveda d=new Docveda();
		RootPanel.get().add(d);
		
		
		
		
	}
	
	
	@UiHandler("button")
	void onClick(ClickEvent e) {
		
		News n = new News();
		String s1 = tb.getText();
		String s2 = t.getText();
		n.setHeading(s1);
		n.setDesc(s2);
		a1.Doct(n,new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				if(result.equals("OK"))
				{
					
			    MaterialToast.fireToast("Successfully Submitted");
				Window.alert("done");
				t.clear();
				
				}else {
					Window.alert("failed..please try again!");
					
				}
			}
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		}
		
		@UiHandler("b1")
		void onClick1(ClickEvent e1) {

			String s1=tb.getText();
			String s2="";
			a1.Edit(s1, s2, new AsyncCallback<String>() {
				
				@Override
				public void onSuccess(String result) {
					// TODO Auto-generated method stub
					
					t.setText(result);
					
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			
		}
		
	}
	


	

