package javaprogramday3;

public class customer {

		private int customerId;
		private String customerName;
		private String Customercity;
		
		//  types - default,user defined constructer
		// 1.. default- no argument constructer
		// 2.user defined- no arguments and paramters
		//user defined-no arguments constructer
		public customer() {
		     System.out.println("user defined no argument constructer");
		     
		}
		//user defiined-argumented constrcter
		public customer(int id,String name,String city) {
			customerId=id;
			customerName=name;
			Customercity=city;
			System.out.println(id + " "+name + " "+city);
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomercity() {
			return Customercity;
		}
		public void setCustomercity(String customercity) {
			Customercity = customercity;
		}

		// Private, protected, public, def

		//Public - public

		//Friends - default //Friends of Friends

		//Only me - private

		//protected

	}


