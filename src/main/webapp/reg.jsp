<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/16
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
    <input type="text" id="email" name="email" />
    <span id="msg"></span>
    <input type="password" name="password"/>
    <script type="text/javascript">

        $('#email').blur(function( e ){
            var $this = $( this );
            $.get('/check',{'email':$this.val(),'t': new Date().getTime()}, function(data){
                if( 1 == data ){
                    $('#msg').html('该邮箱已存在,请换一个').css('color','red');
                } else {
                    $('#msg').html('该邮箱可以使用').css('color','green');
                }
            }, 'json');
        });
    </script>
</body>
</html>
