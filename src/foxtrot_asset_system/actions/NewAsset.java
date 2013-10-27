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
//for(String name: new String[] {"name", "manufacturer_name", "manufacturer_part_id", "tag", "location_name", "depreciation", "installdate", "note"}){
//if(request.getParameter(name) == null || request.getParameter(name).equals("")){
//	request.setAttribute("message", "Please enter a value for " + name);
//	return "server_info.jsp";
//	}
//}

String name = request.getParameter("name");
String manufacturerName = request.getParameter("manufacturer_name");
String manufacturerPartId = request.getParameter("manufacturer_part_id");
String tag = request.getParameter("tag");
String locationName = request.getParameter("location_name");
String depreciated = request.getParameter("depreciated");
String installdate = request.getParameter("installdate");
String note = request.getParameter("note");

//asset asset1 = BusinessObjectDAO.getInstance().create("asset");
//
//asset1.setId(GUID.generate());
//asset1.setName(name);
//asset1.setManufacturer_part_id(manufacturerPartId);
//asset1.setInstallDate(installdate);
//asset1.setDate_depreciated_by(depreciated);
//asset1.setTag(tag);
//asset1.setNotes(note);
//asset1.setLocation_id("hi");

asset asset1 = BusinessObjectDAO.getInstance().create("asset");

//location.save();
//
//asset1.setId(GUID.generate());
//asset1.setName(name);
//asset1.setManufacturer_part_id(manufacturerPartId);
//asset1.setInstallDate(installdate);
//asset1.setDate_depreciated_by(depreciated);
//asset1.setTag(tag);
//asset1.setNotes(note);
//asset1.setLocation_id("hi");



//Send an email
StringBuilder body = new StringBuilder();
body.append("Welcome to My Stuff! To finish your registration, please click the link below. You'll love our great products.\n\n");

System.out.println("sent!");
return "server_info.jsp";
}

}