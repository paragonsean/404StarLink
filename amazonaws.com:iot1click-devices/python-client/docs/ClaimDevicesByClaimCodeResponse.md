# ClaimDevicesByClaimCodeResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claim_code** | **str** |  | [optional] 
**total** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.claim_devices_by_claim_code_response import ClaimDevicesByClaimCodeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ClaimDevicesByClaimCodeResponse from a JSON string
claim_devices_by_claim_code_response_instance = ClaimDevicesByClaimCodeResponse.from_json(json)
# print the JSON string representation of the object
print(ClaimDevicesByClaimCodeResponse.to_json())

# convert the object into a dict
claim_devices_by_claim_code_response_dict = claim_devices_by_claim_code_response_instance.to_dict()
# create an instance of ClaimDevicesByClaimCodeResponse from a dict
claim_devices_by_claim_code_response_from_dict = ClaimDevicesByClaimCodeResponse.from_dict(claim_devices_by_claim_code_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


