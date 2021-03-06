/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wbd101.hrvdemo;

public class respiration_result_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected respiration_result_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(respiration_result_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AndroidRespirationAPIJNI.delete_respiration_result_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public short getRespiratory_rate() {
    return AndroidRespirationAPIJNI.respiration_result_t_respiratory_rate_get(swigCPtr, this);
  }

  public float getRespiration_current_depth() {
    return AndroidRespirationAPIJNI.respiration_result_t_respiration_current_depth_get(swigCPtr, this);
  }

  public boolean getIs_inspirating() {
    return AndroidRespirationAPIJNI.respiration_result_t_is_inspirating_get(swigCPtr, this);
  }

  public respiration_result_t() {
    this(AndroidRespirationAPIJNI.new_respiration_result_t(), true);
  }

}
