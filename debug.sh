#!/bin/bash

adb -s emulator-5554 exec-out sh -c "ls -al /sdcard/Documents"
adb -s emulator-5554 exec-out sh -c "ls -al /sdcard/Documents/video"
adb -s emulator-5554 exec-out sh -c "ls -al /sdcard/googletest/test_outputfiles"
