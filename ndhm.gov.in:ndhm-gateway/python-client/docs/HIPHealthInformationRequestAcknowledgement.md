# HIPHealthInformationRequestAcknowledgement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  | [optional] 
**hi_request** | [**HIPHealthInformationRequestAcknowledgementHiRequest**](HIPHealthInformationRequestAcknowledgementHiRequest.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.hip_health_information_request_acknowledgement import HIPHealthInformationRequestAcknowledgement

# TODO update the JSON string below
json = "{}"
# create an instance of HIPHealthInformationRequestAcknowledgement from a JSON string
hip_health_information_request_acknowledgement_instance = HIPHealthInformationRequestAcknowledgement.from_json(json)
# print the JSON string representation of the object
print(HIPHealthInformationRequestAcknowledgement.to_json())

# convert the object into a dict
hip_health_information_request_acknowledgement_dict = hip_health_information_request_acknowledgement_instance.to_dict()
# create an instance of HIPHealthInformationRequestAcknowledgement from a dict
hip_health_information_request_acknowledgement_from_dict = HIPHealthInformationRequestAcknowledgement.from_dict(hip_health_information_request_acknowledgement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


