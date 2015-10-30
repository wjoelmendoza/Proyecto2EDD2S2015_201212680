package com.fbook;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearU extends Activity {
	private static final String NAMESPACE="http://webservice.com/";
	private static final String URL="http://192.168.43.2:8080/WSFacebook/WSFacebook?wsdl";
	private static final String METHOD_NAME="agregarUsuario";
	private static final String SOAP_ACTION="http://websevice.com/agregarUsuario";
	EditText txtContra, txtCorreo,txtNombre, txtrContra;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.crear_user);
		txtNombre =(EditText) findViewById(R.id.etxtNombreC);
		txtCorreo = (EditText) findViewById(R.id.etxtCorreoC);
		txtContra =(EditText) findViewById(R.id.etxtContra);
		txtrContra =(EditText) findViewById(R.id.etxtRContra);
	}
	
	public void aceptar(View v){
		String uCorreo, uNombre, uContra,urContra;
		uCorreo = txtCorreo.getText().toString();
		uNombre = txtNombre.getText().toString();
		uContra = txtContra.getText().toString();
		urContra = txtrContra.getText().toString();
		boolean vacio =( uCorreo.length() == 0) | (uNombre.length() == 0 ) | (uContra.length() == 0) | (urContra.length() == 0);
		if(!vacio){
			if(uContra.equals(urContra)){
				SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
				PropertyInfo pi = new PropertyInfo();
				
				pi.setName("uContra");
				pi.setValue(urContra);
				request.addProperty(pi);
				
				pi =new PropertyInfo();
				pi.setName("uCorreo");
				pi.setValue(uCorreo);
				request.addProperty(pi);
				
				pi = new PropertyInfo();
				pi.setName("uNombre");
				pi.setValue(uNombre);
				request.addProperty(pi);
				
				SoapSerializationEnvelope envelope= new SoapSerializationEnvelope(SoapEnvelope.VER11);
				envelope.setOutputSoapObject(request);
				try{
					HttpTransportSE tr = new HttpTransportSE(URL);
					tr.call(SOAP_ACTION, envelope);
					Toast.makeText(this, "hecho", Toast.LENGTH_LONG).show();
				}catch(Exception e){
					e.printStackTrace();
				}
			}else{
				Toast.makeText(this, "No coinciden las contraseñas", Toast.LENGTH_SHORT).show();
			}
		}else{
			Toast.makeText(this, "Hay datos vacios", Toast.LENGTH_SHORT).show();
		}
	}
}
