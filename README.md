# CombineDateAndTime
[![](https://jitpack.io/v/hamurcuabi/CombineDateAndTime.svg)](https://jitpack.io/#hamurcuabi/CombineDateAndTime)

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
	 implementation 'com.github.hamurcuabi:CombineDateAndTime:v1.0.1'
}
```

## Usage Kotlin

``` 
class MainActivity : AppCompatActivity(), `OnDateTimePicker` {


DateTimePickerFragment(this).show(supportFragmentManager, "DateTimePickerFragment")

  ``` 
  ## Usage Java


``` 
class MainActivity extends AppCompatActivity implements `OnDateTimePicker` {


new DateTimePickerFragment(this).show(getSupportFragmentManager(), "DateTimePickerFragment")

  ``` 
