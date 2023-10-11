package advanced_ques;

public class Trap_Rain_Water {
    static int trap(int height[]) {
    	
        int res=0;
        for(int i=1;i<height.length-2;i++) {
      	  int lb=height[i];
      	  for(int j=0;j<height.length-1;j++) {
      		  if(height[j]>lb) {
      			  lb=height[j];}
      	  }
      	  int rb=height[i];
      	  for(int j=i+1;j<height.length;j++) {
      		  if(height[j]>rb) {
      			  rb=height[j];}
      	  }
      	  int water_level;
      	  if(rb>lb) {
      		  water_level=lb;
      	  }else {
      		  water_level=rb;
      	  }
      	  int trapped_water=water_level-height[i];
      	  res=res+trapped_water;
    }
    return res;    
    }
	 public static void  main(String[] args) {
		// TODO Auto-generated method stub
      int height[]= {1,2,3,4,5};
 
      System.out.println(trap(height));
	}

}
