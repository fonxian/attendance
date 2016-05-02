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
<div id = "a"></div>
<script type="text/jsx">

	var ColorButton = React.createClass({
    getInitialState: function () {
        return {name: 'button'};
    },
    render: function () {
        return (
            <button onClick={this.handleClick}>click</button>
        )
    },
    handleClick: function (event) {
        console.log(this.state);
        console.log(event.target);
    }
});

React.render(
    <ColorButton />,
   document.getElementById('a')
);

</script>
</body>
</html>