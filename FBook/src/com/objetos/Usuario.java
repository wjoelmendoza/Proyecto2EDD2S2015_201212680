package com.objetos;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
	private String nombre;
	private String correo;
	private int edad;
	private String genero;

	public Usuario(String nombre,String correo , String genero){
		this.nombre=nombre;
		this.correo= correo;
		this.genero=genero;
	}
	
	public Usuario(Parcel in){
		readFromParcel(in);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public int describeContents(){
		return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags){
		dest.writeString(correo);
		dest.writeString(genero);
		dest.writeString(nombre);
		dest.writeInt(edad);
	}
	
	private void readFromParcel(Parcel in){
		correo = in.readString();
		genero = in.readString();
		nombre = in.readString();
		edad = in.readInt();
	}
	
	public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {
		@Override
		public Usuario createFromParcel(Parcel source){
			return new Usuario(source);
		}
		
		@Override
		public Usuario[] newArray(int size){
			return new Usuario[size];
		}
	};

}
