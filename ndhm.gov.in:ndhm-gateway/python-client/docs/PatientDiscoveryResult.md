# PatientDiscoveryResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  | [optional] 
**patient** | [**PatientRepresentation**](PatientRepresentation.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 
**transaction_id** | **str** |  | 

## Example

```python
from openapi_client.models.patient_discovery_result import PatientDiscoveryResult

# TODO update the JSON string below
json = "{}"
# create an instance of PatientDiscoveryResult from a JSON string
patient_discovery_result_instance = PatientDiscoveryResult.from_json(json)
# print the JSON string representation of the object
print(PatientDiscoveryResult.to_json())

# convert the object into a dict
patient_discovery_result_dict = patient_discovery_result_instance.to_dict()
# create an instance of PatientDiscoveryResult from a dict
patient_discovery_result_from_dict = PatientDiscoveryResult.from_dict(patient_discovery_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


