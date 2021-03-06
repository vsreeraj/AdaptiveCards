/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class DateTimePreparser {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DateTimePreparser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DateTimePreparser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_DateTimePreparser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DateTimePreparser() {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparser__SWIG_0(), true);
  }

  public DateTimePreparser(String in) {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparser__SWIG_1(in), true);
  }

  public DateTimePreparsedTokenVector GetTextTokens() {
    return new DateTimePreparsedTokenVector(AdaptiveCardObjectModelJNI.DateTimePreparser_GetTextTokens(swigCPtr, this), true);
  }

  public void AddTextToken(String text, DateTimePreparsedTokenFormat format) {
    AdaptiveCardObjectModelJNI.DateTimePreparser_AddTextToken(swigCPtr, this, text, format.swigValue());
  }

  public void AddDateToken(String text, CTime date, DateTimePreparsedTokenFormat format) {
    AdaptiveCardObjectModelJNI.DateTimePreparser_AddDateToken(swigCPtr, this, text, CTime.getCPtr(date), date, format.swigValue());
  }

  public String Concatenate() {
    return AdaptiveCardObjectModelJNI.DateTimePreparser_Concatenate(swigCPtr, this);
  }

}
