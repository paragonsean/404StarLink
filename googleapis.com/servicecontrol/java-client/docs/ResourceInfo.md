

# ResourceInfo

Describes a resource referenced in the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**container** | **String** | Optional. The identifier of the container of this resource. For Google Cloud APIs, the resource container must be one of the following formats: - &#x60;projects/&#x60; - &#x60;folders/&#x60; - &#x60;organizations/&#x60; For the policy enforcement on the container level (VPCSC and Location Policy check), this field takes precedence on the container extracted from name when presents. |  [optional] |
|**location** | **String** | Optional. The location of the resource. The value must be a valid zone, region or multiregion. For example: \&quot;europe-west4\&quot; or \&quot;northamerica-northeast1-a\&quot; |  [optional] |
|**name** | **String** | The name of the resource referenced in the request. |  [optional] |
|**permission** | **String** | The resource permission needed for this request. The format must be \&quot;{service}/{plural}.{verb}\&quot;. |  [optional] |
|**type** | **String** | The resource type in the format of \&quot;{service}/{kind}\&quot;. |  [optional] |



