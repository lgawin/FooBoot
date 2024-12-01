mvn \
  -DoutputDirectory=${pwd}  \
  dependency:copy-dependencies \
  -DincludeScope=runtime
