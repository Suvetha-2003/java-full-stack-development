package com.suvetha;


class Sports{
	void play() {
		System.out.println("Playing game...");
	}
}

class Football extends Sports{
	void play(){
		System.out.println("Playing Football....");
	}
}

class Basketball extends Sports{
	void play() {
		System.out.println("Playing Basketball....");
	}
}

class Rugby extends Sports{
	void play() {
		System.out.println("Playing Rugby.....");
	}
}
public class Main5 {
	public static void main(String args[])
	{
		Sports s = new Sports();
		s.play();
		Football f = new Football();
		f.play();
		Basketball b = new Basketball();
		b.play();
	}
}
