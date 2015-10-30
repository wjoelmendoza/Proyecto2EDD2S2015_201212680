package com.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

public class Usuario extends AsyncTask<String,Integer,Boolean> {
	Activity activity;
	String correo, nombre,genero,pais,password,estadoC;
	int edad;
	
	public Usuario(String correo,String password, Activity activity){
		this.correo= correo;
		this.password = password;
		this.activity = activity;
	}
	
	@Override
	protected Boolean doInBackground(String... arg0) {
		boolean result = true;
		final String NAMESPACE ="http://webservice.com/";
		final String URL ="http://192.168.43.2:8080/WSFacebook/WSFacebook?wsdl";
		final String METHOD_NAME = "buscarUsuario";
		final String SOAP_ACTION ="http://webservice.com/buscarUsuario";
		
		SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
		PropertyInfo pi = new PropertyInfo();
		
		pi.setName("pBusqueda");
		pi.setValue(correo);
		request.addProperty(pi);
		
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		
		envelope.setOutputSoapObject(request);
		
		HttpTransportSE transport = new HttpTransportSE(URL);
		
		try{
			transport.call(SOAP_ACTION, envelope);
			SoapObject so =(SoapObject) envelope.bodyIn;
			Log.d("Login", so.toString());
		}catch(Exception e){
			result = false;
		}
		
		return result;
	}
	
	public void onPostExecute(Boolean result){
		if(result){
			Log.d("log","algo");
		}else{
			Log.d("log","nada");
		}
	}
}
