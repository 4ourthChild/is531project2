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
for(String name: new String[] {"name", "manufacturer_name", "manufacturer_part_id", "tag", "location_name", "depreciation", "installdate", "note"}){
if(request.getParameter(name) == null || request.getParameter(name).equals("")){
	request.setAttribute("message", "Please enter a value for " + name);
	return"index.jsp";
	}
}

String name = request.getParameter("name");
String manufacturerName = request.getParameter("manufacturer_name");
String manufacturerPartId = request.getParameter("manufacturer_part_id");
String tag = request.getParameter("tag");
String locationName = request.getParameter("location_name");
String depreciated = request.getParameter("depreciated");
String installdate = request.getParameter("installdate");
String note = request.getParameter("note");

assetObject asset = BusinessObjectDAO.getInstance().create("assetObject");

asset.setId(GUID.generate());
asset.setName(name);
asset.setManufacturer_part_id(manufacturerPartId);
asset.setInstallDate(installdate);
asset.setDate_depreciated_by(depreciated);
asset.setTag(tag);
asset.setNotes(note);

asset.save();


//Send an email
StringBuilder body = new StringBuilder();
body.append("Welcome to My Stuff! To finish your registration, please click the link below. You'll love our great products.\n\n");

System.out.println("sent!");
return "assetlist.jsp";
}

}