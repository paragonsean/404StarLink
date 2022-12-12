# PatientRepresentation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**care_contexts** | [**List[CareContextRepresentation]**](CareContextRepresentation.md) |  | [optional] 
**display** | **str** |  | 
**matched_by** | [**List[IdentifierType]**](IdentifierType.md) |  | [optional] 
**reference_number** | **str** |  | 

## Example

```python
from openapi_client.models.patient_representation import PatientRepresentation

# TODO update the JSON string below
json = "{}"
# create an instance of PatientRepresentation from a JSON string
patient_representation_instance = PatientRepresentation.from_json(json)
# print the JSON string representation of the object
print(PatientRepresentation.to_json())

# convert the object into a dict
patient_representation_dict = patient_representation_instance.to_dict()
# create an instance of PatientRepresentation from a dict
patient_representation_from_dict = PatientRepresentation.from_dict(patient_representation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


