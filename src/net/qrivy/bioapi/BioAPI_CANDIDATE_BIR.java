/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class BioAPI_CANDIDATE_BIR {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BioAPI_CANDIDATE_BIR(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BioAPI_CANDIDATE_BIR obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      BioAPIJNI.delete_BioAPI_CANDIDATE_BIR(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setBIRInDataBase(SWIGTYPE_p_a_16__unsigned_char BIRInDataBase) {
    BioAPIJNI.set_BioAPI_CANDIDATE_BIR_BIRInDataBase(swigCPtr, SWIGTYPE_p_a_16__unsigned_char.getCPtr(BIRInDataBase));
  }

  public SWIGTYPE_p_a_16__unsigned_char getBIRInDataBase() {
    long cPtr = BioAPIJNI.get_BioAPI_CANDIDATE_BIR_BIRInDataBase(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_16__unsigned_char(cPtr, false);
  }

  public void setBIRInArray(SWIGTYPE_p_unsigned_int BIRInArray) {
    BioAPIJNI.set_BioAPI_CANDIDATE_BIR_BIRInArray(swigCPtr, SWIGTYPE_p_unsigned_int.getCPtr(BIRInArray));
  }

  public SWIGTYPE_p_unsigned_int getBIRInArray() {
    long cPtr = BioAPIJNI.get_BioAPI_CANDIDATE_BIR_BIRInArray(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public BioAPI_CANDIDATE_BIR() {
    this(BioAPIJNI.new_BioAPI_CANDIDATE_BIR(), true);
  }

}
