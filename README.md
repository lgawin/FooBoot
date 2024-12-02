# FooBoot

Sample application for investigating some boot up issues

## Setup

### adjust repo

First you need to instruct repo to add `FooBoot` project to your AOSP sources.

Copy `local_manifests/*.xml` into your AOSP's `.root/local_manifests`.

```shell
AOSP_ROOT=/sources/aosp

mkdir -p $AOSP_ROOT/local_manifests
cp ./local_manifests/*.xml $AOSP_ROOT/local_manifests/
```

### sync repo

Sync sources, at least this project, e.g.
```shell
repo sync vendor/foqus/FooBoot
```

### add project to target

In your target's `.mk` file add `FooBoot` to product packages

```
PRODUCT_PACKAGES += FooBoot
```

## Building

Follow build instructions for AOSP, so

```shell
. build/envsetup.sh
lunch <YOUR_TARGET>
m
```

To verify only project setup, you can call

```shell
mmm vendor/foqus/FooBoot
```
