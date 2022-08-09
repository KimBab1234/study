
public class No6_19 {

	public static void main(String[] args) {

		MyTv tv= new MyTv();
		
		tv.channel =100;
		tv.volume = 0;
		System.out.printf("ch : %d, vol: %d %n",tv.channel,tv.volume);
		
		tv.channelDown();
		tv.volumeDown();
		System.out.printf("ch : %d, vol: %d %n",tv.channel,tv.volume);
		
		tv.volume =100;
		tv.channelUp();
		tv.volumeUp();
		System.out.printf("ch : %d, vol: %d %n",tv.channel,tv.volume);
	}
}

class MyTv {
	
	boolean isPoweron;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void channelDown() { if(channel>MIN_CHANNEL) {channel--;} }
	void channelUp() { if(channel<MAX_CHANNEL) {channel++;} }
	void volumeDown() { if(volume>MIN_VOLUME) {volume--;} }
	void volumeUp() { if(volume<MAX_VOLUME) {volume++;}  }
	
	
}