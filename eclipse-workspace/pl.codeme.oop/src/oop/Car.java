package pl.codeme.oop;

//import Engine;
import pl.codeme.oop.car.Seat;
import pl.codeme.oop.car.Wheel;

public class Car extends Vehicle implements Radio {
	private Wheel wheelLF;
	private Wheel wheelRF;
	private Wheel wheelLB;
	private Wheel wheelRB;

	private Seat driverSeat;
	private Seat passengerSeat;
	
	private pl.codeme.oop.car.Engine engine;

	private int currentSpeed;
	private int fuelLevel;
	
	public Car() {		
		super("Samochod");
		final Wheel zapasowy;
	}
	
	@Override
	public void start() {
		super.start();
		engine.start();
	}
	
	public void start(int acceleration) {
		
	}
	
	public void start(int i1, float i2) {}
	
	public void start(float i1, int i2) {}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void radioOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void radioOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
