/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btConeTwistConstraintData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btConeTwistConstraintData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConeTwistConstraintData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConeTwistConstraintData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_typeConstraintData(btTypedConstraintData value) {
    gdxBulletJNI.btConeTwistConstraintData_m_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getM_typeConstraintData() {
    long cPtr = gdxBulletJNI.btConeTwistConstraintData_m_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setM_rbAFrame(btTransformFloatData value) {
    gdxBulletJNI.btConeTwistConstraintData_m_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getM_rbAFrame() {
    long cPtr = gdxBulletJNI.btConeTwistConstraintData_m_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setM_rbBFrame(btTransformFloatData value) {
    gdxBulletJNI.btConeTwistConstraintData_m_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getM_rbBFrame() {
    long cPtr = gdxBulletJNI.btConeTwistConstraintData_m_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setM_swingSpan1(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_swingSpan1_set(swigCPtr, this, value);
  }

  public float getM_swingSpan1() {
    return gdxBulletJNI.btConeTwistConstraintData_m_swingSpan1_get(swigCPtr, this);
  }

  public void setM_swingSpan2(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_swingSpan2_set(swigCPtr, this, value);
  }

  public float getM_swingSpan2() {
    return gdxBulletJNI.btConeTwistConstraintData_m_swingSpan2_get(swigCPtr, this);
  }

  public void setM_twistSpan(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_twistSpan_set(swigCPtr, this, value);
  }

  public float getM_twistSpan() {
    return gdxBulletJNI.btConeTwistConstraintData_m_twistSpan_get(swigCPtr, this);
  }

  public void setM_limitSoftness(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_limitSoftness_set(swigCPtr, this, value);
  }

  public float getM_limitSoftness() {
    return gdxBulletJNI.btConeTwistConstraintData_m_limitSoftness_get(swigCPtr, this);
  }

  public void setM_biasFactor(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_biasFactor_set(swigCPtr, this, value);
  }

  public float getM_biasFactor() {
    return gdxBulletJNI.btConeTwistConstraintData_m_biasFactor_get(swigCPtr, this);
  }

  public void setM_relaxationFactor(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getM_relaxationFactor() {
    return gdxBulletJNI.btConeTwistConstraintData_m_relaxationFactor_get(swigCPtr, this);
  }

  public void setM_damping(float value) {
    gdxBulletJNI.btConeTwistConstraintData_m_damping_set(swigCPtr, this, value);
  }

  public float getM_damping() {
    return gdxBulletJNI.btConeTwistConstraintData_m_damping_get(swigCPtr, this);
  }

  public void setM_pad(String value) {
    gdxBulletJNI.btConeTwistConstraintData_m_pad_set(swigCPtr, this, value);
  }

  public String getM_pad() {
    return gdxBulletJNI.btConeTwistConstraintData_m_pad_get(swigCPtr, this);
  }

  public btConeTwistConstraintData() {
    this(gdxBulletJNI.new_btConeTwistConstraintData(), true);
  }

}
