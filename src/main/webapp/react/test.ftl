<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>最简单的jsx</title>
    <script src="${rc.contextPath}/common/js/react.js"></script>
    <script src="${rc.contextPath}/common/js/JSXTransformer.js"></script>
    <link href="${rc.contextPath}/common/css/bootstrap.css" rel="stylesheet">
	<link href="${rc.contextPath}/common/css/bootstrap.min.css" rel="stylesheet">
	<link href="${rc.contextPath}/common/css/dashboard.css" rel="stylesheet">
    <script src="${rc.contextPath}/common/js/bootstrap.min.js"></script>
     <script src="${rc.contextPath}/common/js/jquery-1.12.2.js"></script>
     <script src="${rc.contextPath}/common/js/bootstrap.js"></script>
     <style>
        .commentList{
            color: dodgerblue;
        }
    </style>
</head>
<body>
<div id="a">123</div>
<script type="text/jsx">
	 var Component1 = React.createClass({
        render: function() {
            return <p> {this.props.abc, this.props.name} </p>;
        }
    });
    var Component2 = React.createClass({
        render: function() {
            return (
                    <div className="commentList" onClick={this.handleClick}>
                        <Component1 abc="你好！" name="张三" />
                        <Component1 abc="Hi！" name="李四" />
                    </div>
            );
        },
        handleClick: function (e) {
            console.log(this.props.name, e.target);
        }
    });
    React.render(
        <Component2 name="我是Component2的name哦！" />,
        document.getElementById('a')
    );
</script>
</body>
</html>