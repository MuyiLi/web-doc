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
    <link rel="stylesheet" href="../editor.md-master/css/style.css"/>
    <link rel="stylesheet" href="../editor.md-master/css/editormd.css"/>
</head>

<body>
<div id="layout">
    <div id="test1">
        <input id="title" type="text" placeholder="title" />
    </div>

    <div class="editormd" id="test-editormd">
        <textarea class="editormd-markdown-textarea" name="test-editormd-markdown-doc"></textarea>
        <!-- 第二个隐藏文本域，用来构造生成的HTML代码，方便表单POST提交，这里的name可以任意取，后台接受时以这个name键为准 -->
        <textarea class="editormd-html-textarea" name="text"></textarea>
    </div>

    <div id="editor-md">
        <textarea name="blogContent" id="blogContent"></textarea>
    </div>

    <button id="get-html-btn">保存</button>

</div>
<script src="../statics/js/jquery.min.js"></script>
<script src="../editor.md-master/editormd.js"></script>
</body>

<script>
    var testEditor;
    $(function () {
        testEditor = editormd("editor-md", {
            width: "90%",
            height: 640,
            syncScrolling: "single",
            saveHTMLToTextarea: true, //设置可保存为html 获取的时候testEditor.getHtml();就可以了
//            theme: "dark",  //设置主题，有默认
//            previewTheme: "dark",
//            editorTheme: "pastel-on-dark",
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

    var btn1 = document.getElementById('get-html-btn');
    var title = $("#title").val();
    var html;
    var md;
    btn1.onclick = function () {
        html = testEditor.getPreviewedHTML();
        md=testEditor.getMarkdown();
        console.log("html："+html);
        console.log("md："+md);

        var data = {
            "html": html,
            "title": title
        };
        console.log("data："+data);

        $.ajax({
            url: '/md/save',
            type: 'POST', //GET
            contentType: "application/json; charset=utf-8",   //内容类型
            dataType: "json",     //类型
            data: JSON.stringify(data),
            success: function (data) {
             if(data.response_code=1){
                alert("success")
             }
            }
        });

//        $.post('/md/save', {html: html, title: title}).success(function (data) {
//            console.log(data);
//        })

    }
</script>

</html>
