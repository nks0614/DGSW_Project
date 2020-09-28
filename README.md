# Android Simple Code Library

##### Just Kotlin!!!

This library is simplifies code that is a must-have but annoying to write down.

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
    implementation 'com.github.nks0614:DGSW_Project:1.5.2'
}
```

### Use

<b>Intent Activity Code</b>

```kotlin
spaIntent(MoveActivity::class.java)

spaIntentNoFin(MoveActivity::class.java) // no finish()
```
parameter type : Activity

<b>Intent Fragment Code</b>
```kotlin
spfIntent(MoveActivity::class.java)

spfIntentNoFin(MoveActivity::class.java) // no finish()
```
parameter type : Activity

<b>Toast Activity Code</b>

```kotlin
spaToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spaToastLong("TEXT") // duration is Toast.LENGTH_LONG
```
parameter type : String

<b>Toast Fragment Code</b>

```kotlin
spfToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spfToastLong("TEXT") // duration is Toast.LENGTH_LONG
```
parameter type : String

<b>DateFormat Code</b>

```kotlin
spDateFormat("yyyy-MM-dd", 0) // write format that you want and want day num
// 0 = todoay
// 1 = tomorrow
// -1 = yesterday
// System standard
```
parameter type : String, Int <br>
return type : String

<b>String Check digit Code</b>

```kotlin
spStringDigit("TEXT") // Check number in a String
```
parameter type : String <br>
return type : Boolean

<b>String Concat Code</b>

```kotlin
spStringConcat("t", "e", "x", "t") //Any number of arguments possible
```
parameter type : String <br>
return type : String

### P.s
This is Just Study and School Project. <br>
If you want to use this library, you can use it. <br>
But quality and stability can't be guaranteed. <br>

If you want to report bug and anything send mail - namgyeseok0614@naver.com - here please.

Thank you
