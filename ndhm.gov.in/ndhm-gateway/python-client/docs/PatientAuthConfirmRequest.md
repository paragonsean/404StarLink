# PatientAuthConfirmRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credential** | [**PatientAuthConfirmRequestCredential**](PatientAuthConfirmRequestCredential.md) |  | 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 
**transaction_id** | **str** |  | 

## Example

```python
from openapi_client.models.patient_auth_confirm_request import PatientAuthConfirmRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PatientAuthConfirmRequest from a JSON string
patient_auth_confirm_request_instance = PatientAuthConfirmRequest.from_json(json)
# print the JSON string representation of the object
print(PatientAuthConfirmRequest.to_json())

# convert the object into a dict
patient_auth_confirm_request_dict = patient_auth_confirm_request_instance.to_dict()
# create an instance of PatientAuthConfirmRequest from a dict
patient_auth_confirm_request_from_dict = PatientAuthConfirmRequest.from_dict(patient_auth_confirm_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


