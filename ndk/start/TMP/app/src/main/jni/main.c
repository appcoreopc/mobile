#include "com_example_jeremy_ndksample_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_example_jeremy_ndksample_MainActivity_getStringNative(JNIEnv * env, jobject obj)
{
  return (*env)->NewStringUTF(env, "Hello Android");
}
