# CombineDateAndTime


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	 implementation 'com.github.hamurcuabi:CombineDateAndTime:Tag'
}
```

## Configuration
  :OnDateTimePicker 
  DateTimePickerFragment(this).show(supportFragmentManager, "DateTimePickerFragment")
