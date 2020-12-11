package com.reverseGenerated.exception;

/**
 * @Author xuz_Ben
 * @Date 2020/12/11
 */
public class ReverseGeneratedApplicationException extends RuntimeException {

  public ReverseGeneratedApplicationException() {
    super();
  }

  public ReverseGeneratedApplicationException(long code, String msg) {
    super(code + "::" + msg);
  }

}
