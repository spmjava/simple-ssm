<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:import charEncoding="utf-8"  url="/member/layout/common_top.htm">
    <c:param name="title" value="403错误"/>
    <c:param name="logoUrl" value="${contextPath}/member/client/assets/layout/img/logo.png"/>
    <c:param name="applicationName" value="消息管理平台"/>
</c:import>
<c:import charEncoding="utf-8"  url="/member/layout/common_left.htm" />
<div class="content-wrapper">
    <section class="content-header">
        <h1>
            403错误
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-home"></i>主页</a></li>
            <li class="active">403error</li>
        </ol>
    </section>
    <section class="content">
        <div class="error-page">
            <h2 class="headline text-yellow"> 403</h2>

            <div class="error-content">
                <h3><i class="fa fa-warning text-yellow"></i> 当前访问未授权</h3>

                <p>
                    很抱歉,您当前暂未授权访问该页面,如有疑问,请联系系统管理员解决,您也可以点此<a href="javascript:history.back(0)">返回上一页</a>,
                    或者回到 <a href="/index.htm">首页</a>
                </p>
            </div>
            <!-- /.error-content -->
        </div>
    </section>
    <!-- 结束右侧内容-->
</div>
<c:import charEncoding="utf-8" url="/member/layout/common_foot.htm" />
