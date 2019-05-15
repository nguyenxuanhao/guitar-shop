<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html class="no-js">

<head>
    <!-- Tiles config -->
    <title><tiles:getAsString name="title" /></title>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/fav.png">
    <!-- Author Meta -->
    <meta name="author" content="CodePixar">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/linearicons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/nouislider.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ion.rangeSlider.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ion.rangeSlider.skinFlat.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" type="text/css">
</head>

<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />

<!-- JavaScript -->
<div>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/vendor/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.ajaxchimp.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.nice-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.sticky.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/nouislider.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/rater.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.unobtrusive-ajax.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</div>

</body>
</html>