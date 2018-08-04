##jar包的名称
jar_file_name="processTxt.jar"

##启动参数
# 测试集请求入参文件
in_file="/disk1/apps/process-txt.jar/data/diagnose-data/diagnose-test.txt"


# 结果相同的输入文件
equal_out_file="/disk1/apps/process-txt.jar/data/diagnose-data/equal_result.txt"
# 结果不相同的输出文件
not_equal_out_file="/disk1/apps/process-txt.jar/data/diagnose-data/not_equal_result.txt"
# 平台返回结果文件
result_out_file="/disk1/apps/process-txt.jar/data/diagnose-data/result.txt"


##虚拟机启动参数
JAVA_OPTS="-server -Xms512m -Xmx4096m "

sleep 1
kill -9 `ps -ef | grep ${jar_file_name} | grep -v grep | awk '{print $2}'`

## 启动jar包
nohup java $JAVA_OPTS -jar ${jar_file_name} ${in_file}  ${equal_out_file} ${not_equal_out_file} ${result_out_file} &