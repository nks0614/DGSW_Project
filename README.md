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
    implementation 'com.github.nks0614:DGSW_Project:1.4.0'
}
```

### Use

Intent Activity Code

```kotlin
spaIntent(MoveActivity::class.java)

spaIntentNoFin(MoveActivity::class.java) // no finish()
```

Intent Fragment Code
```kotlin
spfIntent(MoveActivity::class.java)

spfIntentNoFin(MoveActivity::class.java) // no finish()
```

Toast Activity Code

```kotlin
spaToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spaToastLong("TEXT") // duration is Toast.LENGTH_LONG
```

Toast Fragment Code

```kotlin
spfToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spfToastLong("TEXT") // duration is Toast.LENGTH_LONG
```

DateFormat Code

```kotlin
spDateFormatNow("yyyy-MM-dd") // write format that you want
```
return type : String

String Check digit Code

```kotlin
spStringDigit("TEXT") // Check number in a String
```
return type : Boolean

String Concat Code

```kotlin
spStringConcat("t", "e", "x", "t") //Any number of arguments possible
```
return type : String

### P.s
This is Just Study and School Project. <br>
If you want to use this library, you can use it. <br>
But quality and stability can't be guaranteed. <br>

Thank you
