package com.directi.training.ocp.exercise;

public interface Ressource {
	 int findFree();
	 void markFree(int resourceId);
	 void markBusy(int resourceId);
	 
}
