<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.amazonaws.*" %>
<%@ page import="com.amazonaws.auth.*" %>
<%@ page import="com.amazonaws.services.ec2.*" %>
<%@ page import="com.amazonaws.services.ec2.model.*" %>
<%@ page import="com.amazonaws.services.s3.*" %>
<%@ page import="com.amazonaws.services.s3.model.*" %>
<%@ page import="com.amazonaws.services.simpledb.*" %>
<%@ page import="com.amazonaws.services.simpledb.model.*" %>

<%! // Share the client objects across threads to
    // avoid creating new clients for each web request
    private AmazonEC2      ec2;
    private AmazonS3        s3;
    private AmazonSimpleDB sdb;
 %>

<%
    /*
     * AWS Elastic Beanstalk checks your application's health by periodically
     * sending an HTTP HEAD request to a resource in your application. By
     * default, this is the root or default resource in your application,
     * but can be configured for each environment.
     *
     * Here, we report success as long as the app server is up, but skip
     * generating the whole page since this is a HEAD request only. You
     * can employ more sophisticated health checks in your application.
     */
    if (request.getMethod().equals("HEAD")) return;
%>

<%
    if (ec2 == null) {
        AWSCredentials credentials = new PropertiesCredentials(
            getClass().getClassLoader().getResourceAsStream("AwsCredentials.properties"));
        ec2 = new AmazonEC2Client(credentials);
        s3  = new AmazonS3Client(credentials);
        sdb = new AmazonSimpleDBClient(credentials);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>Team Foxtrot - Project 2</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
			<form action="foxtrot_asset_system.actions.NewAsset.action" method="GET">
			Asset Name: <input type="text" name="name" /><br />
			Manufacturer: <input type="text" name="manufacturer_name" /><br />
			Manufacturer Part Id: <input type="text" name="manufacturer_part_id" /><br />
			Tag #: <input type="text" name="tag" /><br />
			Location Name: <input type="text" name="location_name" /><br />
			Date Depreciated By: <input type="text" name="depreciated" /><br />
			Install Date: <input type="text" name="installdate" /><br />
			Note: <input type="text" name="note" /><br />
			<input type="submit" value="Submit" />
		</form>




</body>
</html>