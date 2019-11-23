package com.mycompany.validate;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class CredentialValidate {

	/**
	 * Default Constructor
	 */
	public CredentialValidate() {

	}

	public boolean validate(String name, String password) {
		System.out.println("eneterd credentilas are : ");
		System.out.println("user name == " + name);
		System.out.println("password name == " + password);
		boolean flag = true;
		if (name.equals("paramesh") && password.equals("paramesh")) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
}
