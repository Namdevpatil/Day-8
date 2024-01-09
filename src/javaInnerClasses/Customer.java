package javaInnerClasses;

//Outer Class
public class Customer{

	private int customerId;
	private String customerName;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	//Inner class
	static class Address
	{
		private String address;

		public Address() {
			// TODO Auto-generated constructor stub
		}

		public Address(String address) {
			super();
			this.address = address;
		}

		public String getCustomerDetails() 
		{
			return "Customer [customerAddress=" + address+ "]";
		}
		
	}
	
}
