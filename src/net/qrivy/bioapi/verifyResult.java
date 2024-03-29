/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class verifyResult {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected verifyResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(verifyResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      BioAPIJNI.delete_verifyResult(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setAdaptedBir(int adaptedBir) {
    BioAPIJNI.set_verifyResult_adaptedBir(swigCPtr, adaptedBir);
  }

  public int getAdaptedBir() {
    return BioAPIJNI.get_verifyResult_adaptedBir(swigCPtr);
  }

  public void setResult(long result) {
    BioAPIJNI.set_verifyResult_result(swigCPtr, result);
  }

  public long getResult() {
    return BioAPIJNI.get_verifyResult_result(swigCPtr);
  }

  public void setFarAchieved(int farAchieved) {
    BioAPIJNI.set_verifyResult_farAchieved(swigCPtr, farAchieved);
  }

  public int getFarAchieved() {
    return BioAPIJNI.get_verifyResult_farAchieved(swigCPtr);
  }

  public void setFrrAchieved(int frrAchieved) {
    BioAPIJNI.set_verifyResult_frrAchieved(swigCPtr, frrAchieved);
  }

  public int getFrrAchieved() {
    return BioAPIJNI.get_verifyResult_frrAchieved(swigCPtr);
  }

  public void setPayload(BioAPI_DATA payload) {
    BioAPIJNI.set_verifyResult_payload(swigCPtr, BioAPI_DATA.getCPtr(payload));
  }

  public BioAPI_DATA getPayload() {
    long cPtr = BioAPIJNI.get_verifyResult_payload(swigCPtr);
    return (cPtr == 0) ? null : new BioAPI_DATA(cPtr, false);
  }

  public void setAuditData(int auditData) {
    BioAPIJNI.set_verifyResult_auditData(swigCPtr, auditData);
  }

  public int getAuditData() {
    return BioAPIJNI.get_verifyResult_auditData(swigCPtr);
  }

  public verifyResult() {
    this(BioAPIJNI.new_verifyResult(), true);
  }

}
