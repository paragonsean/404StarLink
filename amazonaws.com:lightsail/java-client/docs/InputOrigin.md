

# InputOrigin

<p>Describes the origin resource of an Amazon Lightsail content delivery network (CDN) distribution.</p> <p>An origin can be a Lightsail instance, bucket, or load balancer. A distribution pulls content from an origin, caches it, and serves it to viewers via a worldwide network of edge servers.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**regionName** | [**RegionName**](RegionName.md) |  |  [optional] |
|**protocolPolicy** | [**OriginProtocolPolicyEnum**](OriginProtocolPolicyEnum.md) |  |  [optional] |



