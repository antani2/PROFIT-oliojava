/**
 * 
 */
package java4;

/**Manager class to demonstrate inheritance
 * 
 * @author Ari
 *
 */
public class Manager extends Employee {
	private String department;
	
	Manager(String n, int s, String d) {
		super (n, s); // Työntekijän nimi ja palkka periytyvät
		department = d;
	}
	
	//Myos tyontekijan metodit periytyvat
	
	public String getDepartment() {
		return department;
	}
	
	//Ylikuormitettu metodi johtaja-luokalle
	public String displayEmpInfo() {
		String managerInfo = super.displayEmpInfo() + "department: " + department + "\n";
		return managerInfo;	
	}
	/**Demonstroi ensin, miten kay kun salary on private
	 * Ja sitten, mita kay kun protected (perivilla paasy)
	 * Tasta hyva tehtava myos oliosuunnittelun kurssille
	 * 
	 * @param amount
	 */
	public void changeSalary(Employee e, int amount) {
		e.salary = amount;
	}

}

