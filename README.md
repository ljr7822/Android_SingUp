# SignUp <打了么> 打卡APP开发文档（更新中...）

## 说明

## 功能截图

## 技术框架

## 提交记录
**第一次提交 2020.11.11**
- 初始化工程文件
- 封装BaseActivity基类
- 封装BaseFragment基类
- 分包common负责提取一些常规操作、lang负责存储字符串类型数据，方便多语言切换
- app\build.gradle、common\build.gradle添加依赖库
- 添加图片资源文件、xml资源文件等

**第二次提交 2020.11.13**
- MainActivity界面布局封装
- 底部导航栏的封装
- 头像、顶部导航背景、点击效果
- 导航栏切换效果的实现

**第三次提交 2020.11.13**
- 修改文件名
- 修改背景、布局等

**第四次提交 2020.11.14**
- 添加浮动按钮动画
- 添加了 NavHelper 工具类，解决对fragment的调度与重用问题
- 修改了 部分标题信息

**第五次提交 2020.11.15**
- 添加图片选择框架
- 完善修改用户头像、剪切头像等

**第六次提交 2020.11.16**
- 完成动态权限申请
- 完成启动页面，进入启动页先授权，才可以启动app

**第七次提交 2020.11.16**
- 添加相关工具类

**第八次提交 2020.11.16**
- 头像上传到阿里云oss

**第九次提交 2020.11.16**
- 初始化登录、注册Fragment
- 改动用户登录、注册切换逻辑
- 改动用户信息修改逻辑

**第十次提交 2020.11.16**
- 登录、注册界面布局

**第十一次提交 2020.11.17**
- 修改了 首页appbar背景图片拉伸问题
- 添加了 注册部分逻辑
- 添加了 登录部分逻辑
- 抽离了 逻辑接口
- 注册功能的基本实现（没有使用网络请求）

**第十二次提交 2020.11.18**
- 注册功能基本实现
- 编写完成启动页
- 添加获取定位功能
- 添加首页轮播图

**第十二次提交 2020.11.20**
- 封装网络请求
- 添加安卓9网络权限要求
- 完成了登录的网络请求
- 引入了弹窗、时间、城市选择器

**第十三次提交 2020.11.20**
- 封装了 获取手机imei + android_id + serial + 硬件uuid（自生成）为唯一标识
- 封装了 sp工具类
- 修改登录时传进去的数据Model

**第十四次提交 2020.11.20**
- 修改公告弹窗样式
- 点击获取定位时，出现弹框
- 美化登录界面、个人中心界面等

**第十五次提交 2020.11.24**
- 界面基本完善

**第十六次提交 2020.11.25**
- 完成登录、退出登录：解决每次进入都需要登录的问题

**第十七次提交 2020.12.21**
- 修改了一些bug
- 添加了打卡跳转到拍照的页面，实现了拍照并且预览
- 修复了公告内容不显示
- 添加了轨迹采集

**第十八次提交 2020.12.21**
- 轨迹采集服务可在设置页面打开

**第十九次提交 2021.3.3**
- 修改了 获取权限后的跳转

**第二十次提交 2021.3.14**
- 修改了 点击事件穿透问题

**第二十一次提交 2021.3.15**
- 修改了 拍照签到逻辑问题

**第二十二次提交 2021.3.15**
- 修改了 不是拍照任务逻辑问题

**第二十三次提交 2021.3.15**
- 修改了 后台签到任务标题展示问题

**第二十四次提交 2021.3.15**
- 修改了 标签根据状态显示不同颜色

**第二十五次提交 2021.3.17**
- 将传递进来的数据进行排序
- 判断签到是否过期，今天不能签昨天的

**第二十六次提交 2021.3.18**
- 判断能否签到bug
- 增加下拉刷新框架
- 解决登陆异常问题

**第二十七次提交 2021.3.19**
- 完善信息逻辑更新
- 修改密码逻辑更新
- 个人信息页头像加载问题解决

**第二十七次提交 2021.3.19**
- 添加下拉刷新信息