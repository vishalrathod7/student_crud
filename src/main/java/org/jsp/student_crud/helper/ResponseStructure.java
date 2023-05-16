package org.jsp.student_crud.helper;

public class ResponseStructure <T>
{
int code;
String message;
T data;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
@Override
public String toString() {
	return "ResponseStructure [code=" + code + ", message=" + message + ", data=" + data + "]";
}

}
