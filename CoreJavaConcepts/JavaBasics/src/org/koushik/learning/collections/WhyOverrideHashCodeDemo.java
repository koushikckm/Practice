package org.koushik.learning.collections;

import java.util.HashMap;
import java.util.Map;

public class WhyOverrideHashCodeDemo {
	  private long crmID;
	  private int nameSpace;

	  public WhyOverrideHashCodeDemo(long crmID, int nameSpace) {
	    super();
	    this.crmID = crmID;
	    this.nameSpace = nameSpace;
	  }

	  public boolean equals(Object obj) {
	    //null instanceof Object will always return false
	    if (!(obj instanceof WhyOverrideHashCodeDemo))
	      return false;
	    if (obj == this)
	      return true;
	    return  this.crmID == ((WhyOverrideHashCodeDemo) obj).crmID &&
	            this.nameSpace == ((WhyOverrideHashCodeDemo) obj).nameSpace;
	  }

	  public static void main(String[] args) {
		  
		  WhyOverrideHashCodeDemo obj1 = new WhyOverrideHashCodeDemo(123L, 1);
		  WhyOverrideHashCodeDemo obj2 = new WhyOverrideHashCodeDemo(345L, 1);
		  
		  Map<WhyOverrideHashCodeDemo, String> m = new HashMap<>();
		  m.put(obj1,"Jeff Smith");
		  m.put(obj2,"John");
		  
		  System.out.println(m.get(obj2));
	  }

	}
