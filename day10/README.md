# Exercises, day 10

## The exercise sheet [exercises_d10.pdf](exercises_d10.pdf) 

# 1 Extension, extension. . .

Completed:

* [Phone.java](src/Phone.java) original interface.
* [OldPhone.java](src/OldPhone.java) Old-style phone just makes calls.
* [MobilePhone.java](src/MobilePhone.java) with alarm, games and number store.
* [SmartPhone.java](src/SmartPhone.java) with web browser and GPS.
* [GPS3coords.java](src/GPS3coords.java) to bundle GPS coords together.
* [PhoneLauncher.java](src/PhoneLauncher.java) Testing script (used to test/develop *OldPhone*, then *MobilePhone* and finally *SmartPhone*). 
  **See commit messages for output during development.**

# 2 Overriding

* Done [SmartPhone.java](src/SmartPhone.java) and [PhoneLauncher.java](src/PhoneLauncher.java).

# 3 Passing information to ancestor classes

* Done (see above).


# 4 Visibility

## 4.1 Increasing visibility

* Told to change visibility of  *playGame(String)* in [MobilePhone.java](src/MobilePhone.java) to *private*. 
  So  [SmartPhone.java](src/SmartPhone.java) cannot use this method and instead we have to provide
  a new implementation in [SmartPhone.java](src/SmartPhone.java) itself.

## 4.2 Reducing visibility

* Told to try to reduce the visibility of playGame in RestrictedSmartPhone by making the method private
  this results in the compiler message:

```
RestrictedSmartPhone.java:9: playGame(java.lang.String) in RestrictedSmartPhone cannot override playGame(java.lang.String) in SmartPhone; attempting to assign weaker access privileges; was public
	private void playGame( String game) {
```

* You cannot reduce the visibility only increase it. But you can override the method with a new one: 
  [RestrictedSmartPhone.java](src/RestrictedSmartPhone.java) Tested in  [PhoneLauncher.java](src/PhoneLauncher.java).

# 5 Multiple inheritance

Done can "cludge" it by using one extension and creating an interface
to the other class:

* [MusicalInstrument.java](src/MusicalInstrument.java)
* [WoodenObjectInterface.java](src/WoodenObjectInterface.java)
* [WoodenObject.java](src/WoodenObject.java)
* [Guitar.java](src/Guitar.java)

# 6 Java magic

Not sure what is meant to be wrong the only thing required to
is to add a constructor for Lecturer class. Works fine simple inheritance?

* [Teacher.java](exercise6/src/Teacher.java) as given
* [Lecturer.java](exercise6/src/Lecturer.java) added constructor
* [LecturerTestScript.java](exercise6/src/LecturerTestScript.java) test script
   works fine - see git commit message for output.

# 7 Final means no change

* As instructed wrote [FinalMeansNoChange7.java](src/FinalMeansNoChange7.java) 
attempting to extend `String`. Does not compile because `String` is `final`:

````
$ javac FinalMeansNoChange7.java 
FinalMeansNoChange7.java:9: cannot inherit from final java.lang.String
public class FinalMeansNoChange7 extends String {
````

# 8 Noah’s Ark (*)

Tackled. Used eclipse and java package for first time. 
Reasonably straightforward. Code is in animal package:

* [animal/Animal.java](Ark/src/animal/Animal.java) Abstract class.
* [animal/Type.java](Ark/src/animal/Type.java) and [animal/IsMammal.java](Ark/src/animal/IsMammal.java) enum's used.
* The actual animals are pretty simple
  * [animal/Bat.java](Ark/src/animal/Bat.java) 
  * [animal/Bear.java](Ark/src/animal/Bear.java)
  * [animal/Beetle.java](Ark/src/animal/Beetle.java)
  * [animal/Dolphin.java](Ark/src/animal/Dolphin.java)
  * [animal/Eagle.java](Ark/src/animal/Eagle.java)
  * stopped after doing 5 will leave rest to Noah.
* [ArkTest.java](Ark/src/ArkTest.java) simple testing script *see commit message for its output.*
