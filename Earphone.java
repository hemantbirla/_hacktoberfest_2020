package assignment4;
import java.util.*;
class Headset
{
 String brand;
 double p;
 Headset(String a,double b)
 {
  brand=a;
  p=b;
 }
 void showSpec()
 {
  System.out.println("Brand of the headset : "+brand);
  System.out.println("Price of the headset : "+p);
 }
}
class WirelessHeadset extends Headset
{
 String wireless,battery;
 int duration;
 WirelessHeadset(String c,double d,String e,String f,int g)
 {
	 super(c,d);
  wireless=e;
  battery=f;
  duration=g;
 }
 void showSpec()
 {
	 super.showSpec();
  System.out.println("wirelesstech of the headset : "+wireless);
  System.out.println("batterytype of the headset : "+battery);
  System.out.println("battery op duration of the headset:"+duration);
 }
 void changeSpec()
 {
	super.brand="abc";
	super.p=12.3;
	System.out.println("changed brand of the headset: "+super.brand);
	System.out.println("changed price of the headset: "+super.p);
	System.out.println("wirelesstech of the headset : "+wireless);
	  System.out.println("batterytype of the headset : "+battery);
	  System.out.println("battery op duration of the headset:"+duration);
 }
}
class EarbudHeadset extends WirelessHeadset
{
	int size;
	boolean isTouchType;
	double weigth;
	EarbudHeadset(String n,double o,String h,String i,int j,int k,boolean l,double m)
	{
		super(n,o,h,i,j);
		size=k;
		isTouchType=l;
		weigth=m;
	}
	void showSpec()
	 {
		 super.showSpec();
	  System.out.println("size of the headset : "+size);
	  System.out.println("istouchtype of the headset : "+isTouchType);
	  System.out.println("weigth of the headset:"+weigth);
	 }
	void changeSpec()
	 {
		super.wireless="def";
		super.battery="ghi";
		super.duration=3;
		System.out.println("changed wirelesstech of the headset: "+super.wireless);
		System.out.println("changed batterytype of the headset: "+super.battery);
		System.out.println("changed batteryopduration of the headset: "+super.duration);
		 System.out.println("size of the headset : "+size);
		  System.out.println("istouchtype of the headset : "+isTouchType);
		  System.out.println("weigth of the headset:"+weigth);
	 }
	
}
 
public class Earphone {

	public static void main(String[] args) {
		EarbudHeadset S=new EarbudHeadset("JBL",1599.90,"jass","lion",10,5,true,10);
		S.showSpec();
		System.out.println();
		S.changeSpec();
		System.out.println();
		System.out.println();
        WirelessHeadset T=new WirelessHeadset("BoAt",3444.99,"bass","lithium",8);
		T.showSpec();
		System.out.println();
		T.changeSpec();
		System.out.println();
		System.out.println();
		Headset U=new Headset("mivi",300.4);
		U.showSpec();
		
	}

}