public class Sound {
	private int[] samples;
	
	public Sound(int[] s){
		samples = s;
	}
	
	public int limitAmplitude(int limit) {
		int counter = 0;
		for(int x = 0; x < samples.length; x++){
			if(samples[x] > limit){
				samples[x] = limit;
				counter++;
			}
			if(samples[x] < -limit){
				samples[x] = -limit;
				counter++;
			}
		}
		return counter;
	}
		
	public void trimSilenceFromBeginning() {
		int counter = 0;
		int x = 0;
		while(samples[x] == 0){
			counter++;
			x++;
		}
		int[] newArray = new int[samples.length - counter];
		for (int y = 0; y < newArray.length; y++){
			newArray[y] = samples[counter + y];
		}
		this.samples = newArray;
	}
	
	public String toString(){
		String s = "[";
		for(int a=0;a < samples.length-1;a++)
			s+= samples[a] + ",";
		s += samples[samples.length-1] + "]";
		return s;
	}
}
