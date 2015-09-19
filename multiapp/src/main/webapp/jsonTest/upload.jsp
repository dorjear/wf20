<%@page language="java" contentType="text/html; charset=utf-8" 
import="com.dorjear.ralf.web.processor.util.WFConstants"%>
<html>
<head>

</head>
<body>


	<%
	if (request.getAttribute(WFConstants.RESPONSE_ERROR_CODE_KEY) != null) {
	%>
	<HR />
	<H5><b><%= request.getAttribute(WFConstants.RESPONSE_ERROR_CODE_KEY) %></b></H5>
	<% } %>
   <HR />


 <form method="POST"  action='../docAccess' enctype="multipart/form-data">
	            <table border="0">
	                <tr>
	                    <td>File Name</td>
	                    <td><input name="fileName" class="myStyle"/></td>
	                </tr>
	                <tr>
	                    <td>Title</td>
	                    <td><input name="title" class="myStyle"/></td>
	                </tr>
	                <tr>
	                    <td>Description</td>
	                    <td><input name="description" class="myStyle"/></td>
	                </tr>
	                <tr>
	                    <td>File to Upload</td>
	                    <td><input type="file" name="file"/></td>
	                </tr>
	                <input type="hidden" name="cmd" value="wfDocUpload"/>
	            </table>
	        <div class="buttons">
	              <button name="cmd_upload" value="upload" accesskey="s" type="submit">Upload the File</button>                        
	        </div>

	    </form>	
</body>
</html>

