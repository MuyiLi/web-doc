<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/13
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <!--引入markdown css样式 -->
    <link rel="stylesheet" href="../editor.md-master/css/style.css" />
    <link rel="stylesheet" href="../editor.md-master/css/editormd.css"/>
</head>

<body>
<div id="layout">
    <header>
        <h1>Simple example</h1>
    </header>
    <div id="test-editormd">
        <textarea name="blogContent" id="blogContent"></textarea>
    </div>

    <button id="get-html-btn">Get HTML</button>

</div>
<script src="../statics/js/jquery.min.js"></script>
<script src="../editor.md-master/editormd.js"></script>
</body>

<script>
    var testEditor;
    $(function () {
        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 640,
            syncScrolling: "single",
            saveHTMLToTextarea: true, //设置可保存为html 获取的时候testEditor.getHtml();就可以了
            theme : "dark",  //设置主题，有默认
            previewTheme : "dark",
            editorTheme : "pastel-on-dark",
            searchReplace: true,
            emoji: true,
            taskList: true,
            tocm: true,         // Using [TOCM]
            tex: true,                   // 开启科学公式TeX语言支持，默认关闭
            flowChart: true,             // 开启流程图支持，默认关闭
            sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
            dialogLockScreen: false,   // 设置弹出层对话框不锁屏，全局通用，默认为true
            imageUpload: true,
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "./php/upload.php",
            path: "../editor.md-master/lib/"
        });
    });

    var btn1=document.getElementById('get-html-btn');
    var html;
    btn1.onclick=function(){
        html=testEditor.getHTML();
        alert(html)
    }
</script>

</html>
