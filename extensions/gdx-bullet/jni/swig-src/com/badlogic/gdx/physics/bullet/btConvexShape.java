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

public class btConvexShape extends btCollisionShape {
  private long swigCPtr;

  protected btConvexShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConvexShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public Vector3 localGetSupportingVertex(Vector3 vec) {
	return gdxBulletJNI.btConvexShape_localGetSupportingVertex(swigCPtr, this, vec);
}

  public Vector3 localGetSupportingVertexWithoutMargin(Vector3 vec) {
	return gdxBulletJNI.btConvexShape_localGetSupportingVertexWithoutMargin(swigCPtr, this, vec);
}

  public Vector3 localGetSupportVertexWithoutMarginNonVirtual(Vector3 vec) {
	return gdxBulletJNI.btConvexShape_localGetSupportVertexWithoutMarginNonVirtual(swigCPtr, this, vec);
}

  public Vector3 localGetSupportVertexNonVirtual(Vector3 vec) {
	return gdxBulletJNI.btConvexShape_localGetSupportVertexNonVirtual(swigCPtr, this, vec);
}

  public float getMarginNonVirtual() {
    return gdxBulletJNI.btConvexShape_getMarginNonVirtual(swigCPtr, this);
  }

  public void getAabbNonVirtual(btTransform t, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btConvexShape_getAabbNonVirtual(swigCPtr, this, btTransform.getCPtr(t), t, aabbMin, aabbMax);
  }

  public void project(btTransform trans, Vector3 dir, SWIGTYPE_p_float min, SWIGTYPE_p_float max) {
    gdxBulletJNI.btConvexShape_project(swigCPtr, this, btTransform.getCPtr(trans), trans, dir, SWIGTYPE_p_float.getCPtr(min), SWIGTYPE_p_float.getCPtr(max));
  }

  public void batchedUnitVectorGetSupportingVertexWithoutMargin(btVector3 vectors, btVector3 supportVerticesOut, int numVectors) {
    gdxBulletJNI.btConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin(swigCPtr, this, btVector3.getCPtr(vectors), vectors, btVector3.getCPtr(supportVerticesOut), supportVerticesOut, numVectors);
  }

  public void getAabbSlow(btTransform t, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btConvexShape_getAabbSlow(swigCPtr, this, btTransform.getCPtr(t), t, aabbMin, aabbMax);
  }

  public int getNumPreferredPenetrationDirections() {
    return gdxBulletJNI.btConvexShape_getNumPreferredPenetrationDirections(swigCPtr, this);
  }

  public void getPreferredPenetrationDirection(int index, Vector3 penetrationVector) {
    gdxBulletJNI.btConvexShape_getPreferredPenetrationDirection(swigCPtr, this, index, penetrationVector);
  }

}
