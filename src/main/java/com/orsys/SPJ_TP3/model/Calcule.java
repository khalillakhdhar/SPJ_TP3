package com.orsys.SPJ_TP3.model;

public class Calcule {
private int brute;

public int getBrute() {
	return brute;
}

public void setBrute(int brute) {
	this.brute = brute;
}

public Calcule(int brute) {
	super();
	this.brute = brute;
}
public String bilan()
{
	double taxe=0; double nette=0;
if(this.brute<1200)
{
	taxe=0;
	nette=this.brute;
}
else if(this.brute<3500)
{
taxe=this.brute*0.10;
nette=this.brute*0.9;
}
else
{
taxe=this.brute*0.15;
nette=this.brute-taxe;

}
return "votre salaire nette est "+nette+" avec des taxes de "+taxe;


}
}
