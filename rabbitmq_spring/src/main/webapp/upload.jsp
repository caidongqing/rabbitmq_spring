<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>图片上传</title>
</head>
<body>
<form id="upload" method="post" action="<%=request.getContextPath()%>/tool/fileUploadImg" enctype="multipart/form-data">
	<input type="file" name="img">
	<input type="submit" value="上传">
</form>
</body>
</html>