package edu.lessons.day95.listeners;
public interface ISignalListener
{
	void changedToRed();
	void changedToGreen();
}

// Publisher ===>(calls methods of) VehicleDriver at runtime 