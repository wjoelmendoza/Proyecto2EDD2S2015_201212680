package com.fbook;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	private static final String NAMESPACE="http://webservice.com/";
	private static final String URL="http://192.168.43.2:8080/WSFacebook/WSFacebook?wsdl";
	private static final String METHOD_NAME="buscarUsuario";
	private static final String SOAP_ACTION="http://websevice.com/buscarUsuario";
	private EditText txtCorreo;
	private EditText txtPassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aceptar =(Button)findViewById(R.id.btnAceptarL);
        txtCorreo = (EditText) findViewById(R.id.etxtCorreo);
        txtPassword =(EditText) findViewById(R.id.etxtPassL);
        aceptar.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				SoapObject request = new SoapObject(NAMESPACE,METHOD_NAME);
				PropertyInfo pi = new PropertyInfo();
				
				pi.setName("pBusqueda");
				pi.setValue(txtCorreo.getText().toString());
				
				request.addProperty(pi);
				
				SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
				envelope.setOutputSoapObject(request);
				try{
					HttpTransportSE tr = new HttpTransportSE(URL);
					tr.call(SOAP_ACTION, envelope);
					Toast.makeText(getApplicationContext(), "ok2",Toast.LENGTH_SHORT).show();
					System.out.println(envelope.bodyIn.toString());
					SoapObject result = (SoapObject) envelope.bodyIn;
					
					if(result!=null)
						Toast.makeText(getApplicationContext(),result.getProperty(0).toString() , Toast.LENGTH_LONG).show();
					else
						Toast.makeText(getApplicationContext(), "no response", Toast.LENGTH_LONG).show();
				}catch(Exception e){
					e.printStackTrace();
					
				}	
			}
        	
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void crear (View v){
    	Intent intent = new Intent(this,CrearU.class);
    	startActivity(intent);
    }
    
}
