<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

 <!-- 触发JS刷新-->
 <script type="text/javascript">
    function changeImg(){
        var img = document.getElementById("img"); 
        img.src = "authImage?date=" + new Date();;
    }
</script>

</head>
<body>

<!-- 验证码 ，本工程默认没有开启EL表达式，需要修改web.xml版本-->
<tr>
   <td nowrap width="437"></td>
    <td>
        <img id="img" src="authImage" />
        <a href='#' onclick="javascript:changeImg()" ><label >看不清？</label></a>
    </td>
 </tr>
  
</body>
</html>