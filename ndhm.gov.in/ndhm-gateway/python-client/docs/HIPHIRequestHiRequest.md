# HIPHIRequestHiRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent** | [**Consent**](Consent.md) |  | 
**data_push_url** | **str** |  | 
**date_range** | [**DateRange**](DateRange.md) |  | 
**key_material** | [**KeyMaterial**](KeyMaterial.md) |  | 

## Example

```python
from openapi_client.models.hiphi_request_hi_request import HIPHIRequestHiRequest

# TODO update the JSON string below
json = "{}"
# create an instance of HIPHIRequestHiRequest from a JSON string
hiphi_request_hi_request_instance = HIPHIRequestHiRequest.from_json(json)
# print the JSON string representation of the object
print(HIPHIRequestHiRequest.to_json())

# convert the object into a dict
hiphi_request_hi_request_dict = hiphi_request_hi_request_instance.to_dict()
# create an instance of HIPHIRequestHiRequest from a dict
hiphi_request_hi_request_from_dict = HIPHIRequestHiRequest.from_dict(hiphi_request_hi_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


