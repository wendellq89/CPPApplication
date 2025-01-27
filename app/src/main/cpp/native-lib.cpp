#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_globalsources_cppapplication_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_globalsources_cppapplication_MainActivity_stringFromJNI2(
        JNIEnv* env,
jobject /* this */) {
std::string hello = "Hello Kotlin from C++";
return env->NewStringUTF(hello.c_str());
}
