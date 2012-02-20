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

public class btTriangleInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btTriangleInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btTriangleInfo() {
    this(gdxBulletJNI.new_btTriangleInfo(), true);
  }

  public void setM_flags(int value) {
    gdxBulletJNI.btTriangleInfo_m_flags_set(swigCPtr, this, value);
  }

  public int getM_flags() {
    return gdxBulletJNI.btTriangleInfo_m_flags_get(swigCPtr, this);
  }

  public void setM_edgeV0V1Angle(float value) {
    gdxBulletJNI.btTriangleInfo_m_edgeV0V1Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV0V1Angle() {
    return gdxBulletJNI.btTriangleInfo_m_edgeV0V1Angle_get(swigCPtr, this);
  }

  public void setM_edgeV1V2Angle(float value) {
    gdxBulletJNI.btTriangleInfo_m_edgeV1V2Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV1V2Angle() {
    return gdxBulletJNI.btTriangleInfo_m_edgeV1V2Angle_get(swigCPtr, this);
  }

  public void setM_edgeV2V0Angle(float value) {
    gdxBulletJNI.btTriangleInfo_m_edgeV2V0Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV2V0Angle() {
    return gdxBulletJNI.btTriangleInfo_m_edgeV2V0Angle_get(swigCPtr, this);
  }

}
