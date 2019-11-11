package com.docto.client;

import java.util.Calendar;

import com.docto.shared.DctRegbeans;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.addins.client.fileuploader.MaterialFileUploader;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class DoctReg extends Composite {
	
	GreetingServiceAsync aa=GWT.create(GreetingService.class);
	private static DoctRegUiBinder uiBinder = GWT.create(DoctRegUiBinder.class);

	interface DoctRegUiBinder extends UiBinder<Widget, DoctReg> {
	}

	public DoctReg() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	//Calendar calendar = Calendar.getInstance();
	
	@UiField
	MaterialTextBox nave;
	@UiField
	MaterialTextBox Email;
	@UiField
	MaterialTextBox pass;
	
	@UiField
	MaterialTextBox cpass;
	@UiField
	MaterialIntegerBox age;
	@UiField
	MaterialDatePicker dp;
	@UiField
	MaterialTextBox paddress;
	@UiField
	MaterialTextBox city;
	
	@UiField
	MaterialTextBox Country;
	@UiField
	MaterialIntegerBox mobile;
	@UiField
	MaterialTextBox caddress;
	@UiField
	RadioButton md,fd;
	
	
	@UiField
	MaterialListBox mem;
	
	@UiField
	MaterialButton reg;

	
	

	/*  	 @UiHandler("md")
	    void onClickRadioValue1(ClickEvent e) {
	        md.setValue(true);
	        DctRegbeans db=new DctRegbeans();
	        db.setGender("Male");
	        
	    }

	    @UiHandler("fd")
	    void onClickRadioValueEvent(ClickEvent e) {
	        fd.setValue(true);
	        DctRegbeans db=new DctRegbeans();
	        db.setGender("Female");
	        
	    }*/
	 
	 
	 @UiHandler("reg")
	 void onClick(ClickEvent e) {
		 
		 Window.alert("working");
		 String n=nave.getText();
		 String em=Email.getText();
		 String p=pass.getText();
		 String a=age.getText();
		 String d=dp.getFormat();
		 String ad=paddress.getText();
		 String cad=caddress.getText();
		 String mb=mobile.getText();
		 String cty=city.getText();
		 String cntry=Country.getText();
		 String g="male";
		 
		 DctRegbeans db=new DctRegbeans();
		 db.setFullname(n);
		 db.setEmail(em);
		 db.setPassword(p);
		 db.setAge(a);
		 db.setDob(d);
		 db.setPaddress(ad);
		 db.setCaddress(cad);
		 db.setMobile(mb);
		 db.setCountry(cntry);
		 db.setCity(cty);
		 db.setGender(g);
		 
		 aa.Regdoc(db, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				Window.alert("done");
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("failed...");
			}
		});
		 
		 
		 
		 
		
	 }
	 
	

	

}
