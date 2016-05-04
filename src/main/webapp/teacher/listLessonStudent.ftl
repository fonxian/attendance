<#include "../BaseControl.ftl" encoding="utf-8">
<script type="text/jsx">

//tts
		/**
		  * 初始化Session对象
		  */
	    var session = new IFlyTtsSession({
                                      'url' : 'http://webapi.openspeech.cn/',
                                      'interval' : '30000',
								      'disconnect_hint' : 'disconnect',
								      'sub' : 'tts'
						         });
		var audio = null;

		/**
		  * 输入文本，输出语音播放链接
		  * @content 待合成文本(不超过4096字节)
		  */
		function play(content) {
		    /***********************************************************以下签名过程需根据实际应用信息填入***************************************************/

		    var appid = "54c88b8d";                              //应用APPID，在open.voicecloud.cn上申请即可获得
		    var timestamp = new Date().toLocaleTimeString();                      //当前时间戳，例new Date().toLocaleTimeString()
            var expires = 60000;                          //签名失效时间，单位:ms，例60000
		    //!!!为避免secretkey泄露，签名函数调用代码建议在服务器上完成
		    var signature = faultylabs.MD5(appid + '&' + timestamp + '&' + expires + '&' + "6a97bfd7fa4531f7");
		   /************************************************************以上签名过程需根据实际应用信息填入**************************************************/

			var params = { "params" : "aue = speex-wb;7, ent = intp65 , vcn = vixy, spd = slow, vol = 50, tte = utf8, caller.appid=" + appid + ",timestamp=" + timestamp + ",expires=" + expires, "signature" : signature, "gat" : "mp3"};
			session.start(params, content, function (err, obj)
	        {
			    if(err) {
				    alert("语音合成发生错误，错误代码 ：" + err);
			    } else {
			        if(audio != null)
					{
					    audio.pause();
					}
					audio = new Audio();
					audio.src = '';
	                audio.play();
					audio.src = "http://webapi.openspeech.cn/" + obj.audio_url;
					audio.play();
			    }
		    });
		};
		function stop(){
			audio_state = 2;
			if(audio != null){
				audio.pause();
			}
		};
		function start(){
			if(audio != null){
				audio.play();
			}
		};
		function restart(){
			if(audio != null){
				audio = new Audio();
			}
		};
		//tts结束

	//全部点名
	var StartAllButton = React.createClass({

    render: function () {
        return (
            <button className="btn btn-primary btn-sm" onClick={this.handleClick}>全部点名</button>
        )
    },

    handleClick: function (event) {
    	var name_length = $(".name").length;
            var name = new Array(name_length);
            for(var i = 0;i < name_length;i++){
                name[i] = $(".name").eq(i).text();
            }
            var name_list=" ";
            for(var i = 0;i < name_length;i++){
                name_list = name_list + name[i] +"——"+name[i]+"——";
            }
            console.log(name_list);
            play(name_list);
    }
});

	//暂停点名
	var StopButton = React.createClass({

    render: function () {
        return (
            <button className="btn btn-primary btn-sm" onClick={this.handleClick}>暂停点名</button>
        )
    },

    handleClick: function (event) {
    	stop();
    }
});

	//继续点名
	var StartButton = React.createClass({
    render: function () {
        return (
            <button className="btn btn-primary btn-sm" onClick={this.handleClick}>继续点名</button>
        )
    },

    handleClick: function (event) {
   	   start();
    }
});

var Component1 = React.createClass({
	render:function(){
		return (
			<tr>
			<td>{this.props.id}</td>
			<td className="name" onClick={this.handleClick} >{this.props.name}</td>
			<td>{this.props.classid}</td>
			<td>
			
				<button className="attend" ref="attend" onClick={this.attendClick.bind(this, 1)} name="1">正常</button> |
				<button className="attend"  ref="attend" onClick={this.attendClick} name="2">缺勤</button> |
				<button  className="attend" ref="attend" onClick={this.attendClick} name="3">请假</button> |
				<button className="attend"  ref="attend" onClick={this.attendClick} name = "4">迟到</button>
			</td>
			<td><label ref= "solution" className="solution">未点名</label> | <input ref="result" className="result" name="result"/></td>
			</tr>
		);
	},
	handleClick: function (e) {
            play(this.props.name);
    },
    attendClick: function(e){
    		var lesson_id = 1;
			var student_id = this.props.id;
			var teacher_id = this.props.teacherid;
			var classes_id=this.props.classid;
			var reason =this.refs.result.getDOMNode().value;
			var test =this.refs.solution.getDOMNode().test;
			var status_id = this.name;
			var status_name = this.props;
			console.log("this.name="+this);

			//$.ajax({
			//	type:"POST",
			//	url : "${rc.contextPath}/attend/add",
			//	data:{lesson_id:lesson_id,student_id:student_id,teacher_id:teacher_id,status_id:status_id,reason:reason,classes_id:classes_id},
		  	//	success:function(){
			//		test.text(status_name);
			//	}
			//});
    }
});

var Component2 = React.createClass({
	render:function(){
		return (
			 <table className="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
			      <th>姓名</th>
			      <th>班级编号</th>
			      <th>考勤操作</th>
			      <th>考勤情况 | 事由</th>
                </tr>
              </thead>
              <tbody>
               	<#list lessonStudentGroup as student>
               		<Component1 id="${student.id}" name="${student.name}" teacherid="${teacher.id}"classid="${student.classes_id}"/>
               	</#list>
              </tbody>
            </table>
		);
	}
});


var LessonStudentModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
             		<div id = "button"></div>
   					<div id="datalist"className="table-responsive"></div>
			 	</div>
              );
            }

        });

    React.render(
        <div className="row">
         <MenuModel/>
         <LessonStudentModel/>
        </div>
        ,document.getElementById('main')
    );

    React.render(
        <div>
         <StartAllButton/>
         <StopButton/>
         <StartButton/>
        </div>
        ,document.getElementById('button')
    );

    React.render(
         <Component2/>
        ,document.getElementById('datalist')
    );

</script>


<script src="http://blog.faultylabs.com/files/md5.js"></script>
<script src="http://webapi.openspeech.cn/socket.io/socket.io.js"></script>
<script src='http://webapi.openspeech.cn/fingerprint.js'></script>
<script src="http://webapi.openspeech.cn/tts.min.js"></script>

