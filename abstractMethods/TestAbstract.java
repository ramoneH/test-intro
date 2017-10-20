package abstractMethods;

public class TestAbstract {

	 public static void main(String[] args) {
		
		 SalesPerson Ramone = new SalesPerson();
		 Ramone.payEmp();
		 Ramone.bonusOfEmp();
		 System.out.println(Ramone.bonusOfEmp() + Ramone.payEmp());
		 
		 Clerk Ben = new Clerk();
		 Ben.bonusOfEmp();
		 Ben.payEmp();
		 System.out.println(Ben.bonusOfEmp() + Ben.payEmp());
		 
		 DevGuy Enomar = new DevGuy();
		 Enomar.bonusOfEmp();
		 Enomar.payEmp();
		 System.out.println(Enomar.bonusOfEmp() + Enomar.payEmp());
	}
}
