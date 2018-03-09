package pl.codeme.oop;

public interface Radio {

	final int MAX_VOLUME = 100;
	
	int volume = 0; 
	
	public void radioOn();
	public void radioOff();
	public void setVolume(int volume);
}
