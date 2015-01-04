# Android Quickstart

This is an Android quickstart project that includes:

* [Android Annotations](http://androidannotations.org/)
* [Spring REST template](https://github.com/excilys/androidannotations/wiki/Rest%20API)
* [EventBus](https://github.com/greenrobot/EventBus)
* [ActiveAndroid](https://github.com/pardom/ActiveAndroid)
* [Parceler](https://github.com/johncarl81/parceler)

### Pre-requisites:

* Maven 3.2+
* ANDROID_HOME set to the Android SDK location
* Populate local maven repository with Android dependencies using [Maven Android SDK Deployer](https://github.com/simpligility/maven-android-sdk-deployer)
* Intellij IDEA

### IntelliJ IDEA configuration

For Android Annotations to work in IDEA, perform the following configuration:

1. Go to File > Default Settings
2. Search for Annotation Processors
3. Enable annotation processing
4. Store generated sources relative to module content root
5. Set the sources directories to:
* target/generated-sources/annotations
* target/generated-test-sources/test-annotations
6. Add the above generated directories as source directories in File > Project Structure under the correct module

### ActiveAndroid

At the time of this writing, ActiveAndroid was not available on the public maven repositories
and therefore needed to be manually [downloaded](https://github.com/pardom/ActiveAndroid.git)
and installed. Here's the maven dependency:

```
<dependency>
	<groupId>com.activeandroid</groupId>
	<artifactId>activeandroid</artifactId>
	<version>3.1-SNAPSHOT</version>
</dependency>
```
