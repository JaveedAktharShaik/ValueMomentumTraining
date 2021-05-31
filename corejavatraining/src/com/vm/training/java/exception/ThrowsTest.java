package com.vm.training.java.exception;

class Training{
	
	void train() throws Exception{
		
		System.out.println("Dotnet Zero Knowledge");
	}
	
	void trainAllSubjects() throws Exception{
		
		specificTraining();
		System.out.println("can train all subjects theoritically");
	}
	
	void specificTraining() throws Exception{
		train();
		System.out.println("can only train on java and angular ");
	} 
}
public class ThrowsTest {
	
	public static void main(String[] args) throws Exception{
		
		Training training = new Training();
		
		training.trainAllSubjects();
	}

}
