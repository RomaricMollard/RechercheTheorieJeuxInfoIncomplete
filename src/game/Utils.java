package game;

import java.util.ArrayList;

public class Utils {

	public static int getState(ArrayList<Integer> conf){
		int r = 0;
		
		int i = 0;
		for(Integer c : conf){
			r += c*Math.pow(2, i);
			i++;
		}
		
		return r;
	}

	public static ArrayList<Integer> compilConf(int conf, int position) {
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int w = 0;
		while(w<position){
			
			if(conf%2 == 0){
				res.add(0);
			}else{
				res.add(1);
			}
			
			conf = Math.floorDiv(conf, 2);
			w++;
		}
		
		return res;
	}
	
}
