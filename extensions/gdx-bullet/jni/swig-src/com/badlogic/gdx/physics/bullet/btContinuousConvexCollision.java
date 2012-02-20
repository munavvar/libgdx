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

public class btContinuousConvexCollision extends btConvexCast {
  private long swigCPtr;

  protected btContinuousConvexCollision(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btContinuousConvexCollision_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btContinuousConvexCollision obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btContinuousConvexCollision(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btContinuousConvexCollision(btConvexShape shapeA, btConvexShape shapeB, SWIGTYPE_p_btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) {
    this(gdxBulletJNI.new_btContinuousConvexCollision__SWIG_0(btConvexShape.getCPtr(shapeA), shapeA, btConvexShape.getCPtr(shapeB), shapeB, SWIGTYPE_p_btSimplexSolverInterface.getCPtr(simplexSolver), btConvexPenetrationDepthSolver.getCPtr(penetrationDepthSolver), penetrationDepthSolver), true);
  }

  public btContinuousConvexCollision(btConvexShape shapeA, btStaticPlaneShape plane) {
    this(gdxBulletJNI.new_btContinuousConvexCollision__SWIG_1(btConvexShape.getCPtr(shapeA), shapeA, btStaticPlaneShape.getCPtr(plane), plane), true);
  }

}
