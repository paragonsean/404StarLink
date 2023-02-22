

# ExperimentVariationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the variation. This field is required when creating an experiment. This field may not be changed for an experiment whose status is ENDED. |  [optional] |
|**status** | **String** | Status of the variation. Possible values: \&quot;ACTIVE\&quot;, \&quot;INACTIVE\&quot;. INACTIVE variations are not served. This field may not be changed for an experiment whose status is ENDED. |  [optional] |
|**url** | **String** | The URL of the variation. This field may not be changed for an experiment whose status is RUNNING or ENDED. |  [optional] |
|**weight** | **Double** | Weight that this variation should receive. Only present if the experiment is running. This field is read-only. |  [optional] |
|**won** | **Boolean** | True if the experiment has ended and this variation performed (statistically) significantly better than the original. This field is read-only. |  [optional] |



