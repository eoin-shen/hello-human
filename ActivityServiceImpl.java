public class MultiUploadAction extends ActionSupport {
// 接收多文件上传参数，提供数组接收就可以了
private File[] upload;
private String[] uploadContentType;
private String[] uploadFileName;
public void setUpload(File[] upload) {
this.upload = upload;
}
public void setUploadContentType(String[] uploadContentType) {
this.uploadContentType = uploadContentType;
}
public void setUploadFileName(String[] uploadFileName) {
this.uploadFileName = uploadFileName;
}
@Override
public String execute() throws Exception {
for (int i = 0; i < upload.length; i++) {
// 循环完成上传
File srcFile = upload[i];
String filename = uploadFileName[i];
// 定义目标文件
File destFile = new File(ServletActionContext.getServletContext()
.getRealPath("/upload" + "/" + filename));
FileUtils.copyFile(srcFile, destFile);
}
return NONE;
}
}
new add func2