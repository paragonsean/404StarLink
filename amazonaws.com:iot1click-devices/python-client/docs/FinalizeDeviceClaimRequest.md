# FinalizeDeviceClaimRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Dict[str, str]** | &lt;p&gt;A collection of key/value pairs defining the resource tags. For example, {  \&quot;tags\&quot;: {\&quot;key1\&quot;: \&quot;value1\&quot;, \&quot;key2\&quot;: \&quot;value2\&quot;} }. For more information, see &lt;a href&#x3D;\&quot;https://aws.amazon.com/answers/account-management/aws-tagging-strategies/\&quot;&gt;AWS  Tagging Strategies&lt;/a&gt;.&lt;/p&gt;&lt;p&gt;    &lt;/p&gt; | [optional] 

## Example

```python
from openapi_client.models.finalize_device_claim_request import FinalizeDeviceClaimRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FinalizeDeviceClaimRequest from a JSON string
finalize_device_claim_request_instance = FinalizeDeviceClaimRequest.from_json(json)
# print the JSON string representation of the object
print(FinalizeDeviceClaimRequest.to_json())

# convert the object into a dict
finalize_device_claim_request_dict = finalize_device_claim_request_instance.to_dict()
# create an instance of FinalizeDeviceClaimRequest from a dict
finalize_device_claim_request_from_dict = FinalizeDeviceClaimRequest.from_dict(finalize_device_claim_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


