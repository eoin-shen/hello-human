public class MultiUploadAction extends ActionSupport {
// ���ն��ļ��ϴ��������ṩ������վͿ�����
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
// ѭ������ϴ�
File srcFile = upload[i];
String filename = uploadFileName[i];
// ����Ŀ���ļ�
File destFile = new File(ServletActionContext.getServletContext()
.getRealPath("/upload" + "/" + filename));
FileUtils.copyFile(srcFile, destFile);
}
return NONE;
}
}
new add func2