# git

### #一

##### 查看版本：

git --version

##### 清屏：

clear

##### 退到上层：

cd ..

##### 复制：

选中即复制、粘贴：右键paste

##### 查看文件：

cat [file]



### #二

##### 设置用户名和邮箱：

git config --global user.name "myname" 、git config --global user.email "xxx@xxx"<br>

##### 本地仓库初始化：

1.定位：cd d:/ 、 cd GitResp/ 、或直接在文件夹下右键Git bash here<br>
2.初始化：git init<br>



### #三

##### 工作区to暂存区: 

git add file

##### 暂存区to本地库:

 git commit -m "注释" file

##### 查看工作区和暂时存区的状态：

git status

##### 日志查看：

1.git log、下一页-空格、上一页b、退出q、<br>
2.git log --pretty=online(简洁展示-方式1)、<br>
3.git log --online(简洁2)<br>
4.git reflog(简洁3)<br>

##### 后退或前进历史版本：

1.git reset --hard 七位索引号（relog里面的）<br>
2.--hard: 本地库指针移动时，同时重置暂存区和工作区<br>
3.--mixed: 本地库指针移动时，同时重置暂存区，工作区不动<br>
4.--sorf: 本地库指针移动时，其他不动<br>

##### 删除文件：

1.rm file 删除工作区中的<br>
2.git add file、git commit -m "将删除操作同步至暂存区和本地库" file<br>
3.gir reflog<br>
4.git reset --hard (撤销本地库的删除/回到历史版本)<br>
（5.只add未commit，从暂存区中撤销删除：可以直接git reset --HEAD 索引或head）<br>

##### 比较：

比对工作区和暂存区的不同：git diff / git diff file<br>
比较暂存区和本地库的不同：git diff [历史版本(HEAD)] [file]<br>

##### 分支：

1.git branch -v 查看分支<br>
2.git branch [branch01] 创建分支<br>
3.git checkout branch01/master 切换分支<br>
4.git merge branch01-->选择内容-->git add [file]-->git commit (不带文件名) 合并分支<br>

##### 将github地址保存到本地

1.git remote -v 查看<br>
2.git remote add [别名]  [github地址]<br>

##### 推送: 

git push [别名] [分支]<br>

##### 整个文件夹推送

1.git add .<br>

2.git commit -m "xx"<br>

3.git push [别名] [分支]<br>

##### 克隆

git clone [地址]

##### 抓取

git fetch [别名] [分支]<br>

只将远程库内容下载到本地，本地区内容不变，抓取后切换到远程库看看内容是否正确，之后再切换回本地进行合并

##### 合并

1.git merge [分支]]<br>

2.在解决merging冲突问题时的提交不带文件名

##### 拉取

git pull [别名] [分支]   直接抓取+合并到本地

##### 跨团队合作

1.本团队获取远程库地址]<br>

2.另团队fork操作： 进入resp，点击fork，复制地址，找个本地位置，git clone [地址]<br>

3.另团队工作，修改内容后，push到自己的remote<br>

4.另团队：网页找到pull requests --> new pull request-->create pull request <br>

5.本团队：进入网页-->pull requests-->files change查看

##### SSH免密操作

不用每次身份认证，但只能针对一个账号，工作常用

1.进入用户主目录：cd ~<br>

2.生成一个.ssh的目录： ssh-keygen -t rsa -C [github邮箱]  然后按三次回车<br>

3.打开.ssh目录下id_rad.pub文件，将里面内容进行复制操作<br>

4.github里点头像，setting，SSHandGPG keys, SSH keys,add ssh key<br>

5.生成后就可以正常进行push。对ssh地址起别名。git remote add  [别名] [ssh地址]

