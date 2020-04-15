# oce-survey 调研问卷表单系统

oce-survey是一款方便、高效、实用的调研问卷表单系统。

## 安装

配置好数据库地址，Tomcat正常启动使用。

### 安装说明

	服务器环境 JAVA 1.8、MySQL、Apache Tomcat

### 配置说明、数据初始化

    先在您mysql导入/src/main/resources/conf/sql/目录下的oce_survey.sql与alert数据库脚本文件

### 配置文件地址

    conf/application.properties

	#database settings
	jdbc.url=jdbc:mysql://localhost:3306/dwsurvey?useUnicode=true&characterEncoding=utf8
	jdbc.username=root
	jdbc.password=123456,.

    分别修改```jdbc.url、jdbc.username、jdbc.password```

### 启动访问

配置完成后，启动应用

初始账号：```service@diaowen.net``` 密码：```123456```

## 特色

特色

### 全新体验、流程简单

以一种全新的设计体验，告别繁琐的设计流程，通过简单有趣的方式，轻轻松松完成问卷设计，多种问卷样式模板选择，只为显现更精美的表单问卷.

### 丰富的题型 

丰富的题型支持，通过拖拽即可完成题目选择，并可以随意拖动其位置，还可置入所需图片、企业LOGO、设置答题逻辑，一份优美的问卷就是这么简单。

### 问卷表单静态化

对于问卷表单系统，因为所有的表单字段都是后台数据库来维护，所以对于每一次答卷请求，如果都从后端数据库去取每一题及选项的话，必定会对性能造成不小影响。

所以在发布的表单问卷时会对数据进行的页面静态化，生成一个真实的表单存档。
