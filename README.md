### Aggregator

# Aggregator pom project

* pulls the content from url
* separate threads are dedicated to pull each url
* if the url is paged, separate threads are spawned out to process them.
** pages can be blocking or non-blocking
** parent urls provided can be inline content or manifests
** keep track of failures and attempt re-tries.