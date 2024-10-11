

# CacheSettings

<p>Describes the cache settings of an Amazon Lightsail content delivery network (CDN) distribution.</p> <p>These settings apply only to your distribution's <code>cacheBehaviors</code> (including the <code>defaultCacheBehavior</code>) that have a <code>behavior</code> of <code>cache</code>.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultTTL** | [**Integer**](Integer.md) |  |  [optional] |
|**minimumTTL** | [**Integer**](Integer.md) |  |  [optional] |
|**maximumTTL** | [**Integer**](Integer.md) |  |  [optional] |
|**allowedHTTPMethods** | [**String**](String.md) |  |  [optional] |
|**cachedHTTPMethods** | [**String**](String.md) |  |  [optional] |
|**forwardedCookies** | [**CacheSettingsForwardedCookies**](CacheSettingsForwardedCookies.md) |  |  [optional] |
|**forwardedHeaders** | [**CacheSettingsForwardedHeaders**](CacheSettingsForwardedHeaders.md) |  |  [optional] |
|**forwardedQueryStrings** | [**CacheSettingsForwardedQueryStrings**](CacheSettingsForwardedQueryStrings.md) |  |  [optional] |



