package foxtrot_asset_system.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import foxtrot_asset_system.*;
import foxtrot_asset_system.web.*;

//import edu.byu.isys413.fbrooke.*;
//import edu.byu.isys413.fbrooke.web.*;
import java.util.*;	

/**
* Processes requests from web-based clients to create a new customer account
*
* @author FalconFire
*
* @since April 2013
*
* @param This class needs the firstname, lastname, address, phone, email1, email2, password1, password2, and creditcard parameters in order to correctly process a new account
*
* @return "validation.jsp" with success or "newaccount.jsp" for errors
* @return an email with a validation string is sent to the customer upon completion
**/
public class NewAsset implements Action {
public NewAsset(){

}

public String process(HttpServletRequest request,
HttpServletResponse response) throws Exception {
HttpSession session = request.getSession();

//Validate the Input
for(String name: new String[] {"first_name", "last_name", "email_address", "manufacturer_name", "manufacturer_part_name", "tag", "location_group_name", "location_name"}){
if(request.getParameter(name) == null || request.getParameter(name).equals("")){
	request.setAttribute("message", "Please enter a value for " + name);
	return"index.jsp";
	}
}

String firstname = request.getParameter("first_name");
String lastname = request.getParameter("last_name");
String emailAddress = request.getParameter("email_address");
String manufacturerName = request.getParameter("manufacturer_name");
String manufacturerPartName = request.getParameter("manufacturer_part_name");
String tag = request.getParameter("tag");
String locationGroupName = request.getParameter("location_group_name");
String locationName = request.getParameter("location_name");

//assetObject cust = BusinessObjectDAO.getInstance().create("Customer");
assetObject asset = new assetObject();
private String id;
private String name;
private String manufacturer_part_id;
private String employee_id;
private String installDate;
private String date_depreciated_by;
private String tag;
private String notes;
private String location_id;
asset.setId();
asset.setName(name);
asset.setManufacturer_part_id("");
asset.setInstallDate(name);
asset.setDate_depreciated_by(name);
asset.setTag(tag);
asset.setNote(note);


cust.setLastname(lastname);
cust.setAddress(address);
cust.setEmail(email);
cust.createSalt();
cust.createPassword(password);
//cust.setPassword(password);
cust.setPhone(phone);
cust.setValidated(false);
cust.setValidationcode(GUID.generate());

cust.save();

//log the user in
session.setAttribute("userid", cust.getId());

Membership mem = BusinessObjectDAO.getInstance().create("Membership");
mem.setCreditcard(creditcard);
mem.setCustid(cust.getId());
mem.save();
cust.setMemberId(mem.getId());
cust.save();


//Send an email
StringBuilder body = new StringBuilder();
body.append("Welcome to My Stuff! To finish your registration, please click the link below. You'll love our great products.\n\n");
body.append("http://intexmystuff.com/mystuff/edu.byu.isys413.fbrooke.actions.RegisterValidate.action?validcode=" + cust.getValidationcode() + "\n\n");

BatchEmail.send("brookefrandsen@gmail.com", "no-reply", cust.getEmail(), "MyStuff Validation", body.toString());
System.out.println("sent!");
return "validation.jsp";
}

}