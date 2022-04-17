```
 docker build -t test-cron-job-datadog .
 docker tag test-cron-job-datadog absalon1000rr/test-cron-job-datadog:v1
 docker push absalon1000rr/test-cron-job-datadog:v1

```

```
mvn package
mvn package
mvn clean package
mvn exec:java -Dexec.mainClass="bxcronjob.App"
```
