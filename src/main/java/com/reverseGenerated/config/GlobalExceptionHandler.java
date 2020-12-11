package com.reverseGenerated.config;

import com.reverseGenerated.constant.ErrorCodeEx;
import com.reverseGenerated.exception.ReverseGeneratedApplicationException;
import com.reverseGenerated.pojo.dto.CommonResult;
import java.io.IOException;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目全局异常处理
 * @Author xuz_Ben
 * @Date 2020/11/20
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public CommonResult<String> runtimeException(RuntimeException ex) {
      ex.printStackTrace();
      return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //空指针异常
  @ExceptionHandler(NullPointerException.class)
  public CommonResult<String> nullPointerExceptionHandler(NullPointerException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //类型转换异常
  @ExceptionHandler(ClassCastException.class)
  public CommonResult<String> classCastExceptionHandler(ClassCastException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //IO异常
  @ExceptionHandler(IOException.class)
  public CommonResult<String> iOExceptionHandler(IOException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //未知方法异常
  @ExceptionHandler(NoSuchMethodException.class)
  public CommonResult<String> noSuchMethodExceptionHandler(NoSuchMethodException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //数组越界异常
  @ExceptionHandler(IndexOutOfBoundsException.class)
  public CommonResult<String>  indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //400错误
  @ExceptionHandler({HttpMessageNotReadableException.class})
  public CommonResult<String> requestNotReadable(HttpMessageNotReadableException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //400错误
  @ExceptionHandler({TypeMismatchException.class})
  public CommonResult<String> requestTypeMismatch(TypeMismatchException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //400错误
  @ExceptionHandler({MissingServletRequestParameterException.class})
  public CommonResult<String> requestMissingServletRequest(
      MissingServletRequestParameterException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //405错误
  @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
  public CommonResult<String> request405(HttpRequestMethodNotSupportedException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //406错误
  @ExceptionHandler({HttpMediaTypeNotAcceptableException.class})
  public CommonResult<String> request406(HttpMediaTypeNotAcceptableException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //500错误
  @ExceptionHandler({ConversionNotSupportedException.class, HttpMessageNotWritableException.class})
  public CommonResult<String> server500(RuntimeException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //栈溢出
  @ExceptionHandler({StackOverflowError.class})
  public CommonResult<String> requestStackOverflow(StackOverflowError ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //除数不能为0
  @ExceptionHandler({ArithmeticException.class})
  public CommonResult<String> arithmeticException(ArithmeticException ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  //其他错误
  @ExceptionHandler({Exception.class})
  public CommonResult<String> exception(Exception ex) {
    ex.printStackTrace();
    return new CommonResult(ErrorCodeEx.SERVER_ERROR.getCode(), ErrorCodeEx.SERVER_ERROR.getMsg());
  }

  @ExceptionHandler(ReverseGeneratedApplicationException.class)
  public CommonResult<String> interfaceException(ReverseGeneratedApplicationException ex) {
    ex.printStackTrace();
    String massage = ex.getMessage();
    long code = Long.valueOf(massage.substring(0, massage.indexOf("::")));
    String newMassage = massage.substring(massage.indexOf("::") + 2);
    return new CommonResult(code, newMassage);
  }
}
