
###在线课堂点名系统


###主要的功能：

- 教师注册登录
- 课程、学生、班级增删改查
- 在线语音点名
    - 可语音点名单个学生或选择全部学生
    - 支持点名暂停、继续
- 课堂考勤
    - 考勤情况统计
    - 考勤数据Excel导入导出（待添加）

###使用到下列技术：

- 框架：Spring、Spring MVC、MyBatis
- 前端：freemarker、jquery、bootstrap
- 语音朗读：讯飞TTS（在线语音合成）
- 项目管理工具：Maven

###使用注意:
- 使用MyEclipse或Eclipse，导入已存在的Maven项目
- 框架和数据库的配置文件在src/main/resouces下面
- 讯飞TTS开发者的APPID需要自行申请（open.voicecloud.cn）
