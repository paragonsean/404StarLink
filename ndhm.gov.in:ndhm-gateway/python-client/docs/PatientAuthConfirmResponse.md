# PatientAuthConfirmResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth** | [**PatientAuthConfirmResponseAuth**](PatientAuthConfirmResponseAuth.md) |  | [optional] 
**error** | [**Error**](Error.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.patient_auth_confirm_response import PatientAuthConfirmResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PatientAuthConfirmResponse from a JSON string
patient_auth_confirm_response_instance = PatientAuthConfirmResponse.from_json(json)
# print the JSON string representation of the object
print(PatientAuthConfirmResponse.to_json())

# convert the object into a dict
patient_auth_confirm_response_dict = patient_auth_confirm_response_instance.to_dict()
# create an instance of PatientAuthConfirmResponse from a dict
patient_auth_confirm_response_from_dict = PatientAuthConfirmResponse.from_dict(patient_auth_confirm_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


