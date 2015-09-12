<%@page language="java" contentType="text/html; charset=utf-8" 
import="com.hsbc.multiapp.wf.web.common.util.WFConstants"%>

<html>
<head>

</head>
<body>

	<%
	if (request.getAttribute(WFConstants.SUCCESS_UPLOAD_MESSAGE_KEY) != null) {
	%>
	<HR />
	<H1><b><%= request.getAttribute(WFConstants.SUCCESS_UPLOAD_MESSAGE_KEY) %></b></H1>
	<% } %>
   <HR />

<a href="docAccess?cmd_download=<%= request.getAttribute("fileId") %>&cmd=wfDocDownload" target="_blank">Download Just Upload</a>
<P/>
<a href="docAccess?cmd_download=22&cmd=wfDocDownload" target="_blank">Download JPG</a>
<a href="docAccess?cmd_download=62&cmd=wfDocDownload" target="_blank">Download TXT</a>
</body>
</html>

