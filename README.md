# Android Simple Code Library

##### Just Kotlin!!!

This library simplifies code that is a must-have but annoying to write down.

### Download

Add it in your root build.gradle at repositories

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
        ...
    }
}
```

Add it in your app build.gradle at dependencies

```
dependencies {
    implementation 'com.github.nks0614:DGSW_Project:1.2.0'
}
```

### Use

Intent Activity Code

```kotlin
simIntent(MainActivity::class.java) // if you back, app finish

simIntentNoFinish(MainActivity::class.java) // if you back, go first stack Activity
```

Toast Activity Code

```kotlin
simToastShort("TEXT") // duration is Toast.LENGTH_SHORT

simToastLong("TEXT") // duration is Toast.LENGTH_LONG
```

DateFormat Code

```kotlin
simDateFormatNow("yyyy-MM-dd") // write format that you want
```

String Check digit Code

```kotlin
simStringDigit("TEXT") // Check number in a String
```

### P.s
This is Just Study and School Project. <br>
If you want to use this library, you can use it. <br>
But quality and stability can't be guaranteed. <br>

Thank you
