# Android Simple Code Library

##### `Just Kotlin!!!`

This library is simplifies code that is a must-have but annoying to write down.

## Download

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

Add it in your app build.gradle at dependencies<br>
[![](https://jitpack.io/v/nks0614/DGSW_Project.svg)](https://jitpack.io/#nks0614/DGSW_Project)
```
dependencies {
    implementation 'com.github.nks0614:DGSW_Project:[VERSION]'
}
```

## Use

### Activity

<b>Intent Activity Code</b>

```kotlin
spaIntent(MoveActivity::class.java)

spaIntentNoFin(MoveActivity::class.java) // no finish()
```
parameter type : Activity

<b>Toast Activity Code</b>

```kotlin
spaToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spaToastLong("TEXT") // duration is Toast.LENGTH_LONG
```
parameter type : String


### Fragment

<b>Intent Fragment Code</b>
```kotlin
spfIntent(MoveActivity::class.java)

spfIntentNoFin(MoveActivity::class.java) // no finish()
```
parameter type : Activity

<b>Toast Fragment Code</b>

```kotlin
spfToastShort("TEXT") // duration is Toast.LENGTH_SHORT

spfToastLong("TEXT") // duration is Toast.LENGTH_LONG
```
parameter type : String


### Function

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
                      // If String has number, return false
                      // not has true
```
parameter type : String <br>
return type : Boolean

<b>String Concat Code</b>

```kotlin
spStringConcat("t", "e", "x", "t") // Any number of arguments possible
```
parameter type : String <br>
return type : String

<b>Random Gerenate Code</b>

```kotlin
spRandom(1, 10) // start num and end num
```
parameter type : Int <br>
return type : Int

<b>Average Code</b>

```kotlin
// Any number of arguments possible
spAverage(1, 2, 3 ,4) // only Int
spAverage(10.5, 2.3, 4.5, 11.3) // only Double 
```
parameter type : Int or Double (Only one of them in one function)<br>
return type : Double

<b>String Similarity Code</b>

```kotlin
spStringSimilarity("abc", "abd") // Compares two Strings and gives String similarity
                                 // Use Levenshtein Distance
                                 // A long string is the criterion                               
```
parameter type : String
return type : Double


### P.s

This is Just Study and School Project. <br>
If you want to use this library, you can use it. <br>
But quality and stability can't be guaranteed. <br>

If you want to report bug and anything send mail - namgyeseok0614@naver.com - here please.

Thank you
