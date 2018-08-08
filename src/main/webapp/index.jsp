<html>
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="齐某人,齐伟超">
    <meta name="baidu-site-verification" content="EAnB2Faos1"/>

    <title>齐某人</title>
</head>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<body>
<h2>Hello World!</h2>
<img src="test.jpg" alt="齐某人" width="121px" height="75px"/>


<!--畅言PC和WAP自适应版-->
<div id="SOHUCS"></div>
<script type="text/javascript">
    (function () {
        var appid = 'cytmLdUfW';
        var conf = 'prod_e878d8d57edc3922e93c9925c69b5c41';
        var width = window.innerWidth || document.documentElement.clientWidth;
        if (width < 960) {
            window.document.write('<script id="changyan_mobile_js" charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/mobile/wap-js/changyan_mobile.js?client_id=' + appid + '&conf=' + conf + '"><\/script>');
        } else {
            var loadJs = function (d, a) {
                var c = document.getElementsByTagName("head")[0] || document.head || document.documentElement;
                var b = document.createElement("script");
                b.setAttribute("type", "text/javascript");
                b.setAttribute("charset", "UTF-8");
                b.setAttribute("src", d);
                if (typeof a === "function") {
                    if (window.attachEvent) {
                        b.onreadystatechange = function () {
                            var e = b.readyState;
                            if (e === "loaded" || e === "complete") {
                                b.onreadystatechange = null;
                                a()
                            }
                        }
                    } else {
                        b.onload = a
                    }
                }
                c.appendChild(b)
            };
            loadJs("http://changyan.sohu.com/upload/changyan.js", function () {
                window.changyan.api.config({appid: appid, conf: conf})
            });
        }
    })(); </script>
</body>
</html>