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

## Building

```shell
mmm vendor/foqus/FooBoot
```
